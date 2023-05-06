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
 * @author Stéphane
 */
public class Piece {
    
    //double hsp;
    int idPiece;
//    Coin[]C = new Coin[4];
//    Sol sol;
//    Plafond plafond;                           
    //ArrayList<Mur> listeMurs = new ArrayList<Mur>();        //La pièce peut contenir moins de 4 murs, si c'est une terasse par exemple
    //double prix;
    private List<Mur> listeMurs;
    private static List<Piece> pieceList = new ArrayList<Piece>();
//    Piece(int id,Mur m1, Mur m2, Mur m3, Mur m4) throws IOException{
//        //C = this.Definitioncoins();
//        //this.hsp = hauteur;
//        this.idPiece = id;
//        //this.sol = new Sol(this.idPiece,C);
//        //this.plafond = new Plafond(this.idPiece,C);
//        this.listeMurs = new ArrayList<Mur>();
//        listeMurs.add(m1);
//        listeMurs.add(m2);
//        listeMurs.add(m3);
//        listeMurs.add(m4);
//        pieceList.add(this);
//       // this.prix = montantRevetement();
//    }
    Piece(int id, Mur... murs) throws IOException {
    this.idPiece = id;
    this.listeMurs = new ArrayList<Mur>();
    for (Mur mur : murs) {
        this.listeMurs.add(mur);
    }
    pieceList.add(this);
}

    public int getIdPiece() {
    return this.idPiece;
    }

    public List<Mur> getListeMurs() {
        return this.listeMurs;
    }

    public static List<Piece> getPieceList() {
        return pieceList;
    }
//    Coin[] Definitioncoins(){
//        Coin[] DC = new Coin[4];
//            for (int i=0;i<4;i++){
//               System.out.println(" Identifiant du Coin");
//                int id=Lire.i();
//                System.out.println(" Abscisse du Coin");
//                double x=Lire.d();
//                System.out.println(" Ordonnée du Coin");
//                double y=Lire.d();
//                DC[i] = new Coin(id,x,y); 
//            }
//            return DC;
//    }
    
//    public ArrayList<Mur> definitionMurs(Mur m1, Mur m2, Mur m3, Mur m4) throws IOException{
//        ArrayList<Mur> liste = new ArrayList<Mur>();
//        liste.add(m1);
//        liste.add(m2);
//        liste.add(m3);
//        liste.add(m4);
//        
////        System.out.println("Combien de murs voulez-vous dans votre pièce ?");
////        int nbrmurs = Lire.i();
////        while ((nbrmurs<2) || (nbrmurs>4)){
////            System.out.println("Ce nombre de murs ne défini pas une pièce, où celle-ci ne serait pas rectangulaire, veuillez saisir un autre nombre de murs :");
////            nbrmurs = Lire.i();
////        }
//                
//        for (int i = 0; i<nbrmurs; i++){
//            
//            
//            Mur m = new Mur(i,c1,c2, this.hsp);
//                liste.add(i,m);
//        }
//        return liste;
//    }
    
//    double montantRevetement(){
//        double montant = 0;
//        montant = this.plafond.prix + this.sol.prix ;
//        for (int j = 0; j<this.listeMurs.size(); j++ ){
//            montant = montant + this.listeMurs.get(j).prix;
//        }
//        return montant;
//    }
}
