/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

/**
 *
 * @author killi
 */

public class Immeuble {
    //attributs
    public static int idImmeuble;
    
    //constructeur
    public Immeuble() {
        this.idImmeuble = 1;
    }
    
    //methode "afficher"
    public static void afficher(){
        System.out.println("idImmeuble = "+idImmeuble);
    }
}
