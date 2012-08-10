/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {
    }


    protected boolean initListModelList(List cmp) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.initListModelList(cmp);
        Vector modelData = new Vector();
        Hashtable customerList = new Hashtable();
            customerList.put("customerNameLbl", "Rahul Jayaraman");
            customerList.put("customerAddressLbl", "9, Ekvira Prasad, 50-B, Pestom Sagar, Mumbai - 400089");
        
        modelData.addElement(customerList);
        System.out.println(customerList);
        System.out.println(modelData);
        
        cmp.setModel(new DefaultListModel(modelData));
        return true;
    }
}
