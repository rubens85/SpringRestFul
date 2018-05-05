/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restfull.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author rubens
 */
public class TestSpring {
    public static void main(String[] args) {
        String xmlFile = "src/main/resources/beans.xml";
        ApplicationContext ctx = new FileSystemXmlApplicationContext(xmlFile);
        
        System.out.println( "Mensaje: " + ((HelloBean)ctx.getBean(HelloBean.class)).hello());
    }
}
