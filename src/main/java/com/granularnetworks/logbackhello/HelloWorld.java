/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.granularnetworks.logbackhello;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
/**
 *
 * @author natemarks
 */
public class HelloWorld {
    public static void main(String[] args)
    {
        Logger log = LoggerFactory.getLogger(HelloWorld.class);
        log.info("Hello World");
    }
    
    public static Integer getInt()
    {
        return 6;
    }
    
}
