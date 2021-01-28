/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aaa_componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.Serializable;
import javax.swing.JTextField;
import org.apache.commons.validator.routines.CreditCardValidator;

/**
 *
 * @author Alejandro
 */
public class JCCValidatorFecha   extends JTextField implements Serializable, FocusListener{
    
    private int dia;
    private int mes;
    
    public JCCValidatorFecha() {
        addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        setForeground(Color.black);
    }

    @Override
    public void focusLost(FocusEvent e) {
         if(!validarFecha()) {
            setForeground(Color.red);   
        }
        else {            
            setForeground(Color.green); 
        }
    } 
    private boolean validarFecha() {
        if (dia) {
        }
        
            return true;
    }

    
    
}
