/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author killi
 */

class Immeuble extends Batiment{
   
    String nom;
    int idImmeuble;
    int nbrNiveaux;
    
    Immeuble(int id,String name, int nbr) throws IOException{
        super(name, nbr);
        this.idImmeuble = id;
    }
    
    
    
}
