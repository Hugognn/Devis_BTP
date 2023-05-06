/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;

/**
 *
 * @author hugog
 */
public class Batiment {
   
    
    //Attribut
    private int idBatiment;
    private int nbNiveaux;
    double prix;
    
    //Constructeur 
   
    Batiment(int id, int nbniveaux) throws IOException{
        this.idBatiment = id;
        this.nbNiveaux = nbniveaux;
        //this.prix = DevisBatiment(nbrN);
    }
    
    public int getIdBatiment() {
    return idBatiment;
    }

    public int getNbNiveaux() {
        return nbNiveaux;
    }



    
//    double DevisBatiment(int nbrN){
//        double montant = 0;
//        for (int i=0;i<nbrN;i++){
//            montant = montant + this.listeNiveau.get(i).prix;
//        }
//        return montant;
//    }
}
