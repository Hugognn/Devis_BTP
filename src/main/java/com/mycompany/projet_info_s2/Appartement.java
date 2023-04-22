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
    
    Appartement(int id) throws IOException{
        this.idAppartement = id;
        this.listePieces = definitionPieces();
        this.prix = montantRevetement();
    }
    
    public ArrayList<Piece> definitionPieces() throws IOException{
        ArrayList<Piece> liste = new ArrayList<Piece>();
        //liste.clear();
        System.out.println("Combien voulez-vous de pieces dans votre appartement ?");
        int nbrpieces = Lire.i();
        while(nbrpieces<1){
            System.out.println("Ceci ne définit pas un appartement, veuillez saisir un autre nombre de pièces :");
            nbrpieces = Lire.i();
        }
                                                //Demander 4 coins qui vont être saisis dans une liste pour créer le sol et le plafond
        Coin [] C = new Coin[4];
        for (int i=0;i<nbrpieces;i++){             //Toujours considérer une pièce rectangulaire
            for(int h=0;h<4;h++){                       //Vider la liste de coins à chaque nouvelles pièces
                C[h]=null;
            }
            for (int j=0;j<4;j++){
                System.out.println("Donnez l'identifiant du coin :");
                int id = Lire.i();
                System.out.println("Donnez l'abscisse :");
                double cx = Lire.d();
                System.out.println("Donnez l'ordonné :");
                double cy = Lire.d();
                Coin c = new Coin (id,cx,cy);
                C[j] = c;
            }
            Sol sol = new Sol(i,C);
            Plafond plafond = new Plafond(i,C);
            Piece p = new Piece(i,sol,plafond);
            liste.add(i,p);
        }
        return liste;
        }
    
    double montantRevetement(){
        double montant = 0;
        for (int i=0;i<this.listePieces.size();i++){
            montant = montant + this.listePieces.get(i).prix;
        }
        return montant;
    }
}
