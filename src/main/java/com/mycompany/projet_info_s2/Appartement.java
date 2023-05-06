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
public class Appartement {
    
    double hsp;
    private int idAppartement;
    private List<Piece> listePieces ;
    private static List<Appartement> listeAppartements = new ArrayList<>() ;
    //double prix;
    
    Appartement(int id, Piece... pieces) throws IOException{
        //this.hsp = hauteur;
        this.idAppartement = id;
        this.listePieces = new ArrayList<Piece>();
        for(Piece piece : pieces){
            listePieces.add(piece);
        }
        listeAppartements.add(this);
        //this.prix = montantRevetement();
    }
    public int getIdAppartement() {
    return idAppartement;
    }

    public List<Piece> getListePieces() {
        return listePieces;
    }

    public static List<Appartement> getListeAppartements() {
        return listeAppartements;
    }

//    double montantRevetement(){
//        double montant = 0;
//        for (int i=0;i<this.listePieces.size();i++){
//            montant = montant + this.listePieces.get(i).prix;
//        }
//        return montant;
//    }
}
