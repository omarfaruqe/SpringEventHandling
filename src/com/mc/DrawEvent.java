/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author faruqe
 */
public class DrawEvent extends ApplicationEvent {
    
    public DrawEvent(Object source) {
        super(source);
    }
    
    @Override
    public String toString(){
        return "Draw Event occured";
    }
}
