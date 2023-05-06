/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author killi
 */
public class Niveau {
    
    //attributs
    int idNiveau;
    private ArrayList<Appartement> listeAppartement ;
    private static  ArrayList<Niveau> niveauxList =new ArrayList<Niveau>();
    double hsp ;
    double prix ;
    
    //constructeur
    Niveau(int id, double h,Appartement... appart) throws IOException {
        this.idNiveau = id;
        this.hsp = h;
        this.listeAppartement = new ArrayList<Appartement>();
        for (Appartement Appart : appart){
            listeAppartement.add(Appart);
        }
        niveauxList.add(this);
       // this.prix = montantRevetement();
    }
    public static ArrayList<Niveau> getNiveauxList() {
        return niveauxList;
    }
       public int getIdNiveau() {
        return idNiveau;
    }

    public double getHsp() {
        return hsp;
    }

    public List<Appartement> getListeAppartement() {
        return listeAppartement;
    }

    
   
//    double montantRevetement(){
//        double montant = 0;
//        for (int i=0;i<this.listeAppartement.size();i++){
//            montant = montant + this.listeAppartement.get(i).prix;
//        }
//        return montant;
//    }

}
