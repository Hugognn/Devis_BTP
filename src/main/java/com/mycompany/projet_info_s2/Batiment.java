/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hugog
 */
public class Batiment {
   
    
    //Attribut
    String idBatiment;
    ArrayList<Niveau> listeNiveaux = new ArrayList<Niveau>();
    double prix;
    
    //Constructeur 
    
    Batiment(String id) throws IOException{
        this.idBatiment = id;
        this.listeNiveaux = definitionNiveaux();
        this.prix = montantRevetement();
    }
    
    public ArrayList<Niveau> definitionNiveaux() throws IOException{
        ArrayList<Niveau> liste = new ArrayList<Niveau>();
        System.out.println("Combien voulez-vous de niveaux ?");
        int nbrNiveaux = Lire.i();
        while (nbrNiveaux<1){
            System.out.println("Ceci ne définit pas un Batiment, veuillez saisir un autre nombre de niveaux :");
            nbrNiveaux = Lire.i();
        }
        double h;
        for (int i=0; i<liste.size();i++){
            System.out.println("Quelle est l'hauteure sous plafond du niveau "+ i+1 +" ? (En m)");
            h = Lire.d();
            while (h<1){
                System.out.println("Cette hauteur est trop petite pour un niveau, veuillez saisir une nouvelle hauteur :");
                h = Lire.d();
            }
            Niveau N = new Niveau (i,h);
            liste.add(i,N);  
        }
        return liste;
    }
    
    double montantRevetement(){
        double montant = 0;
        for (int i=0;i<this.listeNiveaux.size();i++){
            montant = montant + this.listeNiveaux.get(i).prix;
        }
        return montant;
    }
}
