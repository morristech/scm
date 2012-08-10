/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars() {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            return showForm("splash", null);
        } else {
            Form f = (Form)createContainer(resPath, "splash");
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "splash");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Dialog findAreYouSure(Container root) {
        return (com.codename1.ui.Dialog)findByName("Are you sure", root);
    }

    public com.codename1.ui.Container findContainer3(Container root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer2(Container root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Form findGUI1(Container root) {
        return (com.codename1.ui.Form)findByName("GUI 1", root);
    }

    public com.codename1.ui.TextField findPasswordTxt(Container root) {
        return (com.codename1.ui.TextField)findByName("passwordTxt", root);
    }

    public com.codename1.ui.Container findContainer1(Container root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Form findGUI2(Container root) {
        return (com.codename1.ui.Form)findByName("GUI 2", root);
    }

    public com.codename1.ui.Label findUsernameLbl(Container root) {
        return (com.codename1.ui.Label)findByName("usernameLbl", root);
    }

    public com.codename1.ui.Form findSplash(Container root) {
        return (com.codename1.ui.Form)findByName("splash", root);
    }

    public com.codename1.components.MultiButton findReportsMbtn(Container root) {
        return (com.codename1.components.MultiButton)findByName("reportsMbtn", root);
    }

    public com.codename1.ui.Form findLoading(Container root) {
        return (com.codename1.ui.Form)findByName("loading", root);
    }

    public com.codename1.ui.Container findCustomerRenderer(Container root) {
        return (com.codename1.ui.Container)findByName("customerRenderer", root);
    }

    public com.codename1.ui.Label findPasswordLbl(Container root) {
        return (com.codename1.ui.Label)findByName("passwordLbl", root);
    }

    public com.codename1.components.MultiButton findSelectcustomerMbtn(Container root) {
        return (com.codename1.components.MultiButton)findByName("selectcustomerMbtn", root);
    }

    public com.codename1.ui.TextField findUsernameTxt(Container root) {
        return (com.codename1.ui.TextField)findByName("usernameTxt", root);
    }

    public com.codename1.components.MultiButton findUploadMbtn(Container root) {
        return (com.codename1.components.MultiButton)findByName("uploadMbtn", root);
    }

    public com.codename1.ui.Form findCustomerSelect(Container root) {
        return (com.codename1.ui.Form)findByName("Customer Select", root);
    }

    public com.codename1.ui.Label findCustomerAddressLbl(Container root) {
        return (com.codename1.ui.Label)findByName("customerAddressLbl", root);
    }

    public com.codename1.ui.Label findLabel1(Container root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel(Container root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findCustomerNameLbl(Container root) {
        return (com.codename1.ui.Label)findByName("customerNameLbl", root);
    }

    public com.codename1.ui.List findList(Container root) {
        return (com.codename1.ui.List)findByName("List", root);
    }

    public com.codename1.ui.TextField findSearchTxt(Container root) {
        return (com.codename1.ui.TextField)findByName("searchTxt", root);
    }

    public com.codename1.ui.Container findContainer(Container root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public static final int COMMAND_GUI2Command8 = 8;
    public static final int COMMAND_GUI1Exit = 5;
    public static final int COMMAND_GUI2Logout = 6;
    public static final int COMMAND_GUI1Login = 4;
    public static final int COMMAND_AreYouSureYes = 10;
    public static final int COMMAND_AreYouSureNo = 11;

    protected boolean onGUI2Command8() {
        return false;
    }

    protected boolean onGUI1Exit() {
        return false;
    }

    protected boolean onGUI2Logout() {
        return false;
    }

    protected boolean onGUI1Login() {
        return false;
    }

    protected boolean onAreYouSureYes() {
        return false;
    }

    protected boolean onAreYouSureNo() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_GUI2Command8:
                if(onGUI2Command8()) {
                    ev.consume();
                }
                return;

            case COMMAND_GUI1Exit:
                if(onGUI1Exit()) {
                    ev.consume();
                }
                return;

            case COMMAND_GUI2Logout:
                if(onGUI2Logout()) {
                    ev.consume();
                }
                return;

            case COMMAND_GUI1Login:
                if(onGUI1Login()) {
                    ev.consume();
                }
                return;

            case COMMAND_AreYouSureYes:
                if(onAreYouSureYes()) {
                    ev.consume();
                }
                return;

            case COMMAND_AreYouSureNo:
                if(onAreYouSureNo()) {
                    ev.consume();
                }
                return;

        }
    }

    protected void exitForm(Form f) {
        if("Customer Select".equals(f.getName())) {
            exitCustomerSelect(f);
            return;
        }

        if("GUI 2".equals(f.getName())) {
            exitGUI2(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            exitGUI1(f);
            return;
        }

        if("Are you sure".equals(f.getName())) {
            exitAreYouSure(f);
            return;
        }

        if("splash".equals(f.getName())) {
            exitSplash(f);
            return;
        }

        if("loading".equals(f.getName())) {
            exitLoading(f);
            return;
        }

        if("customerRenderer".equals(f.getName())) {
            exitCustomerRenderer(f);
            return;
        }

    }


    protected void exitCustomerSelect(Form f) {
    }


    protected void exitGUI2(Form f) {
    }


    protected void exitGUI1(Form f) {
    }


    protected void exitAreYouSure(Form f) {
    }


    protected void exitSplash(Form f) {
    }


    protected void exitLoading(Form f) {
    }


    protected void exitCustomerRenderer(Form f) {
    }

    protected void beforeShow(Form f) {
        if("Customer Select".equals(f.getName())) {
            beforeCustomerSelect(f);
            return;
        }

        if("GUI 2".equals(f.getName())) {
            beforeGUI2(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            beforeGUI1(f);
            return;
        }

        if("Are you sure".equals(f.getName())) {
            beforeAreYouSure(f);
            return;
        }

        if("splash".equals(f.getName())) {
            beforeSplash(f);
            return;
        }

        if("loading".equals(f.getName())) {
            beforeLoading(f);
            return;
        }

        if("customerRenderer".equals(f.getName())) {
            beforeCustomerRenderer(f);
            return;
        }

    }


    protected void beforeCustomerSelect(Form f) {
    }


    protected void beforeGUI2(Form f) {
    }


    protected void beforeGUI1(Form f) {
    }


    protected void beforeAreYouSure(Form f) {
    }


    protected void beforeSplash(Form f) {
    }


    protected void beforeLoading(Form f) {
    }


    protected void beforeCustomerRenderer(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        if("Customer Select".equals(c.getName())) {
            beforeContainerCustomerSelect(c);
            return;
        }

        if("GUI 2".equals(c.getName())) {
            beforeContainerGUI2(c);
            return;
        }

        if("GUI 1".equals(c.getName())) {
            beforeContainerGUI1(c);
            return;
        }

        if("Are you sure".equals(c.getName())) {
            beforeContainerAreYouSure(c);
            return;
        }

        if("splash".equals(c.getName())) {
            beforeContainerSplash(c);
            return;
        }

        if("loading".equals(c.getName())) {
            beforeContainerLoading(c);
            return;
        }

        if("customerRenderer".equals(c.getName())) {
            beforeContainerCustomerRenderer(c);
            return;
        }

    }


    protected void beforeContainerCustomerSelect(Container c) {
    }


    protected void beforeContainerGUI2(Container c) {
    }


    protected void beforeContainerGUI1(Container c) {
    }


    protected void beforeContainerAreYouSure(Container c) {
    }


    protected void beforeContainerSplash(Container c) {
    }


    protected void beforeContainerLoading(Container c) {
    }


    protected void beforeContainerCustomerRenderer(Container c) {
    }

    protected void postShow(Form f) {
        if("Customer Select".equals(f.getName())) {
            postCustomerSelect(f);
            return;
        }

        if("GUI 2".equals(f.getName())) {
            postGUI2(f);
            return;
        }

        if("GUI 1".equals(f.getName())) {
            postGUI1(f);
            return;
        }

        if("Are you sure".equals(f.getName())) {
            postAreYouSure(f);
            return;
        }

        if("splash".equals(f.getName())) {
            postSplash(f);
            return;
        }

        if("loading".equals(f.getName())) {
            postLoading(f);
            return;
        }

        if("customerRenderer".equals(f.getName())) {
            postCustomerRenderer(f);
            return;
        }

    }


    protected void postCustomerSelect(Form f) {
    }


    protected void postGUI2(Form f) {
    }


    protected void postGUI1(Form f) {
    }


    protected void postAreYouSure(Form f) {
    }


    protected void postSplash(Form f) {
    }


    protected void postLoading(Form f) {
    }


    protected void postCustomerRenderer(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Customer Select".equals(c.getName())) {
            postContainerCustomerSelect(c);
            return;
        }

        if("GUI 2".equals(c.getName())) {
            postContainerGUI2(c);
            return;
        }

        if("GUI 1".equals(c.getName())) {
            postContainerGUI1(c);
            return;
        }

        if("Are you sure".equals(c.getName())) {
            postContainerAreYouSure(c);
            return;
        }

        if("splash".equals(c.getName())) {
            postContainerSplash(c);
            return;
        }

        if("loading".equals(c.getName())) {
            postContainerLoading(c);
            return;
        }

        if("customerRenderer".equals(c.getName())) {
            postContainerCustomerRenderer(c);
            return;
        }

    }


    protected void postContainerCustomerSelect(Container c) {
    }


    protected void postContainerGUI2(Container c) {
    }


    protected void postContainerGUI1(Container c) {
    }


    protected void postContainerAreYouSure(Container c) {
    }


    protected void postContainerSplash(Container c) {
    }


    protected void postContainerLoading(Container c) {
    }


    protected void postContainerCustomerRenderer(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Customer Select".equals(rootName)) {
            onCreateCustomerSelect();
            return;
        }

        if("GUI 2".equals(rootName)) {
            onCreateGUI2();
            return;
        }

        if("GUI 1".equals(rootName)) {
            onCreateGUI1();
            return;
        }

        if("Are you sure".equals(rootName)) {
            onCreateAreYouSure();
            return;
        }

        if("splash".equals(rootName)) {
            onCreateSplash();
            return;
        }

        if("loading".equals(rootName)) {
            onCreateLoading();
            return;
        }

        if("customerRenderer".equals(rootName)) {
            onCreateCustomerRenderer();
            return;
        }

    }


    protected void onCreateCustomerSelect() {
    }


    protected void onCreateGUI2() {
    }


    protected void onCreateGUI1() {
    }


    protected void onCreateAreYouSure() {
    }


    protected void onCreateSplash() {
    }


    protected void onCreateLoading() {
    }


    protected void onCreateCustomerRenderer() {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(c.getParent().getLeadParent() != null) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Customer Select")) {
            if("searchTxt".equals(c.getName())) {
                onCustomerSelect_SearchTxtAction(c, event);
                return;
            }
            if("List".equals(c.getName())) {
                onCustomerSelect_ListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GUI 2")) {
            if("selectcustomerMbtn".equals(c.getName())) {
                onGUI2_SelectcustomerMbtnAction(c, event);
                return;
            }
            if("uploadMbtn".equals(c.getName())) {
                onGUI2_UploadMbtnAction(c, event);
                return;
            }
            if("reportsMbtn".equals(c.getName())) {
                onGUI2_ReportsMbtnAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("GUI 1")) {
            if("usernameTxt".equals(c.getName())) {
                onGUI1_UsernameTxtAction(c, event);
                return;
            }
            if("passwordTxt".equals(c.getName())) {
                onGUI1_PasswordTxtAction(c, event);
                return;
            }
        }
    }

      protected void onCustomerSelect_SearchTxtAction(Component c, ActionEvent event) {
      }

      protected void onCustomerSelect_ListAction(Component c, ActionEvent event) {
      }

      protected void onGUI2_SelectcustomerMbtnAction(Component c, ActionEvent event) {
      }

      protected void onGUI2_UploadMbtnAction(Component c, ActionEvent event) {
      }

      protected void onGUI2_ReportsMbtnAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_UsernameTxtAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_PasswordTxtAction(Component c, ActionEvent event) {
      }

}
