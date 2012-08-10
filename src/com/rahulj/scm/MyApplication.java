package com.rahulj.scm;


import com.codename1.ui.Display;
import userclasses.StateMachine;

public class MyApplication {
   
    public void init(Object context) {
        System.out.println("init");
    }

    public void start(){
        System.out.println("started");    
        new StateMachine("/themeAndGUI");        
    }

    public void stop(){
        System.out.println("stopped");
    }
    
    public void destroy(){
        System.out.println("destroyed");
    
    }

}
