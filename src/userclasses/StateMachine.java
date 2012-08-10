/**
 * Your application code goes here
 */

package userclasses;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.processing.Result;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
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
               String response = "";
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
          
             Vector modelData = new Vector();
             request.setUrl("http://173.201.20.182:2050/customers.json");
             request.setPost(false);
             networkManager.addToQueue(request);
             cmp.setModel(new DefaultListModel(modelData));
        }
        catch (Exception e) {
           
        }
        
        return true;
    }
    

    protected void beforeCustomerSelect(Form f) {
        // If the resource file changes the names of components this call will break notifying you that you should fix the code
        super.beforeCustomerSelect(f);

    
    }
}
