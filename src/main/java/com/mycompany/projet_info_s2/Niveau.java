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
public class Niveau {
    
    //attributs
    int idNiveau;
    ArrayList<Appartement> listeAppartement = new ArrayList<Appartement>();
    double hsp ;
    double prix ;
    
    //constructeur
    Niveau(int id, double h) throws IOException {
        this.idNiveau = id;
        this.hsp = h;
        this.listeAppartement = definitionAppartements();
        this.prix = montantRevetement();
    }
    
    public ArrayList<Appartement> definitionAppartements() throws IOException{          //"public" sera surement a enlever
        ArrayList<Appartement> liste = new ArrayList<Appartement>();
        System.out.println("Combien voulez-vous d'appartement à ce niveau ?");
        int nbrniveaux = Lire.i();
        while (nbrniveaux<1){
            System.out.println("Ceci ne définit pas un niveau, veuillez saisir un autre nombre de pièces :");
            nbrniveaux = Lire.i();
        }
        for (int i=0;i<nbrniveaux;i++){
            Appartement A = new Appartement (i,this.hsp);
            liste.add(i,A);
            System.out.println("Nous avons bien enregistré l'appartement.");
        }
        return liste;
    }
    
    double montantRevetement(){
        double montant = 0;
        for (int i=0;i<this.listeAppartement.size();i++){
            montant = montant + this.listeAppartement.get(i).prix;
        }
        return montant;
    }

}
