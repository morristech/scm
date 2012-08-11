/**
 * Your application code goes here
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
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    String response = "";
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
        NetworkManager.getInstance().start();
    }


    protected boolean initListModelList(List cmp) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.initListModelList(cmp);
        
                try{
                    
        NetworkManager networkManager = NetworkManager.getInstance();
             
          ConnectionRequest request = new ConnectionRequest() {

               int chr;
               StringBuffer sb = new StringBuffer();
              
             protected void readResponse(InputStream input) throws IOException {
                  //do something with input stream
                 while ((chr = input.read()) != -1){
                       sb.append((char) chr);
                      // System.out.println("reading...");

                   }
                 response = sb.toString();
                 System.out.println(response);
                  
             }
          };
             Hashtable hashData;
             Progress loading = new Progress("Downloading..", request);
             loading.setAutoShow(true);
             loading.setDisposeOnCompletion(true);
             request.setUrl("http://173.201.20.182:2050/customers.json");
             request.setPost(false);
             networkManager.addToQueueAndWait(request); 
             
             InputStream is = new ByteArrayInputStream(response.getBytes());
             JSONParser parser = new JSONParser();
             hashData = parser.parse(new InputStreamReader(is));
             System.out.println("Keys:" + hashData);
             System.out.println("Values:" + hashData.get("root"));
             //String[] modelData1 = (String[])hashData.get("root");
             System.out.println("Convert to string array:");
             Vector modelData = (Vector)hashData.get("root");
            // modelData.addElement(modelData);
             Storage.getInstance().writeObject("custStore", modelData);
             
             
             modelData = (Vector)Storage.getInstance().readObject("custStore");
             System.out.println(modelData);
             System.out.println(modelData);
             Vector testData = new Vector();
             Hashtable testdata = new Hashtable();
             testdata.put("name", "Rahul");
             testdata.put("address", "test");
             testData.addElement(testdata);
             cmp.setModel(new DefaultListModel(modelData));
            // System.out.println("testdata" + testData);
            // cmp.setModel(new DefaultListModel(testData));
        }
        catch (Exception e) {
            
           Dialog.show("Connection Error", "Unable to connect", "Continue", null);
           Vector modelData = new Vector();
           modelData.addElement("No data");
           cmp.setModel(new DefaultListModel(modelData));
        }
        
        return true;
    }
    

    protected void beforeCustomerSelect(Form f) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.beforeCustomerSelect(f);

    
    }
}
