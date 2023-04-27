/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;

/**
 *
 * @author Stéphane
 */
public class Maison extends Batiment {
    
    int idMaison;
    String nom;
    
    Maison(int id,String name) throws IOException{
        super(name,1);
    }
}
