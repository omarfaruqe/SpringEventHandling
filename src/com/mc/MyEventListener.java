/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author faruqe
 */
@Component
public class MyEventListener implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent e) {
        System.out.println(e.toString());
    } 
}
