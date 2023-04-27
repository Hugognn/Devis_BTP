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
    ArrayList<Niveau> listeNiveau = new ArrayList<Niveau>();
    double prix;
    
    //Constructeur 
   
    Batiment(String id, int nbrN) throws IOException{
        this.idBatiment = id;
        this.listeNiveau = definitionNiveaux(nbrN);
        this.prix = DevisBatiment(nbrN);
    }
    
    public ArrayList<Niveau> definitionNiveaux(int nb) throws IOException{
        ArrayList<Niveau> liste = new ArrayList<Niveau>();
        double h;
        for (int i=0; i<nb;i++){
            int affichageniveau = i+1;
            System.out.println("Quelle est l'hauteure sous plafond du niveau "+ affichageniveau +" ? (En m)");
            h = Lire.d();
            while (h<1){
                System.out.println("Cette hauteur est trop petite pour un niveau, veuillez saisir une nouvelle hauteur :");
                h = Lire.d();
            }
            liste.add(i,new Niveau(i,h));
            System.out.println("Nous avons bien enregistré le niveau.");
        }
        return liste;
    }
    
    double DevisBatiment(int nbrN){
        double montant = 0;
        for (int i=0;i<nbrN;i++){
            montant = montant + this.listeNiveau.get(i).prix;
        }
        return montant;
    }
}
