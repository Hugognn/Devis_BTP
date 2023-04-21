/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Stéphane
 */
public class Piece {
    
    int idPiece;
    Sol sol;
    Plafond plafond;
    Niveau niveau;
    ArrayList<Mur> listeMurs = new ArrayList<Mur>();        //La pièce peut contenir moins de 4 murs, si c'est une terasse par exemple
    double prix;
    
    Piece(int id,ArrayList<Mur> listeM, Sol sol, Plafond plafond) throws IOException{
        this.idPiece = id;
        this.sol = sol;
        this.plafond = plafond;
        this.listeMurs = definitionMurs();
        this.prix = montantRevetement();
    }
    
    ArrayList<Mur> definitionMurs() throws IOException{
        this.listeMurs.clear();
        System.out.println("Combien de murs voulez-vous dans votre pièce ?");
        int nbrmurs = Lire.i();
        while ((nbrmurs<1) || (nbrmurs>4)){
            System.out.println("Ce nombre de murs ne défini pas une pièce, où celle-ci ne serait pas rectangulaire, veuillez saisir un autre nombre de murs :");
            nbrmurs = Lire.i();
        }
                
        for (int i = 0; i<nbrmurs; i++){
            System.out.println(" Identifiant du Coin");
            int id=Lire.i();
            System.out.println(" Abscisse du Coin");
            double x=Lire.d();
            System.out.println(" Ordonnée du Coin");
            double y=Lire.d();
            Coin c1=new Coin(id,x,y);
            System.out.println(" Identifiant du Coin");
            id=Lire.i();
            System.out.println(" Abscisse du Coin");
            x=Lire.d();
            System.out.println(" Ordonnée du Coin");
            y=Lire.d();
            Coin c2=new Coin(id,x,y);
            System.out.println("Nombre de portes :");
            int nbrportes = Lire.i();
            System.out.println("Nombre de fenetres :");
            int nbrfenetres = Lire.i();
            
            switch(i){
                case 0:
                    Mur m1 = new Mur(1,c1,c2,niveau,nbrfenetres,nbrportes);
                    this.listeMurs.add(i,m1);
                    break;
                case 1:
                    Mur m2 = new Mur(2,c1,c2,niveau,nbrfenetres,nbrportes);
                    this.listeMurs.add(i,m2);
                    break;
                case 2:
                    Mur m3 = new Mur(3,c1,c2,niveau,nbrfenetres,nbrportes);
                    this.listeMurs.add(i,m3);
                    break;
                case 3:
                    Mur m4 = new Mur(4,c1,c2,niveau,nbrfenetres,nbrportes);
                    this.listeMurs.add(i,m4);
                    break;
            }
        }
        return this.listeMurs;
    }
    
    double montantRevetement(){
        double montant = 0;
        montant = this.plafond.prix + this.sol.prix ;
        for (int j = 0; j<this.listeMurs.size(); j++ ){
            montant = montant + this.listeMurs.get(j).prix;
        }
        return montant;
    }
}
