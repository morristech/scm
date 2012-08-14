/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import com.codename1.components.Progress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.io.Storage;
import com.codename1.processing.Result;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListModel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Admin
 */
class FilterProxyListModel implements ListModel, DataChangedListener {
   private ListModel underlying;
   private Vector filter;
   private Vector listeners = new Vector();
   public FilterProxyListModel(ListModel underlying) {
       this.underlying = underlying;
       underlying.addDataChangedListener(this);
   }
  
   private int getFilterOffset(int index) {
       if(filter == null) {
           return index;
       }
       if(filter.size() > index) {
           return ((Integer)filter.elementAt(index)).intValue();
       }
       return -1;
   }

   private int getUnderlyingOffset(int index) {
       if(filter == null) {
           return index;
       }
       return filter.indexOf(new Integer(index));
   }
  
   public void filter(String str) {
       filter = new Vector();
       str = str.toUpperCase();
       for(int iter = 0 ; iter < underlying.getSize() ; iter++) {
           String element = (String)underlying.getItemAt(iter);
           if(element.toUpperCase().indexOf(str) > -1) {
               filter.addElement(new Integer(iter));
           }
       }
       dataChanged(DataChangedListener.CHANGED, -1);
   }
  
   public Object getItemAt(int index) {
       return underlying.getItemAt(getFilterOffset(index));
   }

   public int getSize() {
       if(filter == null) {
           return underlying.getSize();
       }
       return filter.size();
   }

   public int getSelectedIndex() {
       return Math.max(0, getUnderlyingOffset(underlying.getSelectedIndex()));
   }

   public void setSelectedIndex(int index) {
       underlying.setSelectedIndex(getFilterOffset(index));
   }

   public void addDataChangedListener(DataChangedListener l) {
       listeners.addElement(l);
   }

   public void removeDataChangedListener(DataChangedListener l) {
       listeners.removeElement(l);
   }

   public void addSelectionListener(SelectionListener l) {
       underlying.addSelectionListener(l);
   }

   public void removeSelectionListener(SelectionListener l) {
       underlying.removeSelectionListener(l);
   }

   public void addItem(Object item) {
       underlying.addItem(item);
   }

   public void removeItem(int index) {
       underlying.removeItem(index);
   }

   public void dataChanged(int type, int index) {
       if(index > -1) {
           index = getUnderlyingOffset(index);
           if(index < 0) {
               return;
           }
       }
       for(int iter = 0 ; iter < listeners.size() ; iter++) {
          
           ((DataChangedListener)listeners.elementAt(iter)).dataChanged(type, index);
       }
   }
}
