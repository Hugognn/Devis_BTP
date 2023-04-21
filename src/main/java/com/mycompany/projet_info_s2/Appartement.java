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
public class Appartement {
    
    int idAppartement;
    ArrayList<Piece> listePieces = new ArrayList<Piece>();
    Niveau niveau;
    double prix;
    
    Appartement(int id, ArrayList<Piece> P) throws IOException{
        this.idAppartement = id;
        this.listePieces = definitionPieces();
        this.prix = montantRevetement();
    }
    
    public ArrayList<Piece> definitionPieces() throws IOException{
        this.listePieces.clear();
        System.out.println("Combien voulez-vous de pieces dans votre appartement ?");
        int nbrpieces = Lire.i();
        while(nbrpieces<1){
            System.out.println("Ceci ne définit pas un appartement, veuillez saisir un autre nombre de pièces :");
            nbrpieces = Lire.i();
        }
        for (int i=0;i<nbrpieces;i++){
            int id = i;
            ArrayList<Mur> listeMurs = new ArrayList<Mur>();
        }
        
    
    
    double montantRevetement(){
        
    }
}
}
