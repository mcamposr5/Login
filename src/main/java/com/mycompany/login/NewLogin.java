/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login;
import java.util.ArrayList;

/**
 *
 * @author Miguel Campos
 */
public class NewLogin {
    
    public static ArrayList<usuario> usuarios;
    public static ArrayList<Producto> productos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        usuarios = new ArrayList<>();
        InterfazLogin log = new InterfazLogin();
        log.setVisible(true);
        
        productos = new ArrayList<>();
        
    }
    
}
