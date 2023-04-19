/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

/**
 *
 * @author killi
 */
public class Niveau {
    
    //attributs
    int idNiveau;
    int Appartements[];
    float hsp ;
    
    //constructeur
    Niveau(int idn, float h) {
        this.idNiveau = idn;
        this.hsp = h;
    }
    
    //methode "DevisNiveau"
    public static double DevisNiveau(){
        System.out.println("DevisNiveau = ");
        return(1);
    }

}
