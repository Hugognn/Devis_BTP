/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author hugog
 */
public class Save {
//    private String nomFichier;
//    Save() {
//        System.out.println("Entrer nom fichier sauvegarde");
//        String n = Lire.S();
//        this.nomFichier = n;   
//    }  
//    String getnomFichier(){
//        
//        return nomFichier;
//    }
public static void sauvegarder(List<Coin> coinList,List<Mur> murList,List<Piece> pieceList,List<Appartement> appartList,List<Niveau> niveauxList,Batiment bat,String nomFichier) throws IOException{
    String cheminFichier = "E:\\INSA\\STH\\S2\\Informatique\\Projet_info_S2\\" + nomFichier+".txt";
            BufferedWriter save = new BufferedWriter(new FileWriter(cheminFichier, true));
    try{
         save.write("Type ; identifiant coin ; Coordonnée X; Coordonnée Y");
         save.newLine();
            for (Coin coin : coinList) {
               
            save.write("Coin;"+coin.getIdCoin()+";"+coin.getCx()+";"+coin.getCy());
            save.newLine();
            }        
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }

    try{
        save.write("Type ; identifiant mur ; Coin de départ; Coin de fin ; identifiant de revetement");
        save.newLine();
            for (Mur mur : murList) {
            
            
            save.write("Mur;"+mur.getIdMur()+";"+mur.getDebut()+";"+mur.getFin()+";"+mur.getRevetement());
            save.newLine();
            }
           
           
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    try{
        save.write("Type ; identifiant piece ; Identifiant 1er mur; identifiant 2eme mur...");
        save.newLine();
            for (Piece piece : pieceList) {
            
            
            save.write("Piece;"+piece.getIdPiece()+";");
          
            for (Mur mur : piece.getListeMurs()) {
                save.write(mur.getIdMur() + ";");
            }
            save.newLine();
            }
           
           
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    try{
        save.write("Type ; identifiant appartement ; Identifiant 1ere piece; identifiant 2eme piece...");
        save.newLine();
            for (Appartement appart : appartList) {
            
            
            save.write("Appartement;"+appart.getIdAppartement());
          
            for (Piece piece : appart.getListePieces()) {
                save.write( ";"+piece.getIdPiece() );
            }
            save.newLine();
            }
           
           
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    try{
        save.write("Type ; identifiant niveau ;hauteur sous plafond; Identifiant 1er appart; identifiant 2eme appart...");
        save.newLine();
            for (Niveau niveau : niveauxList) {
            
            
            save.write("Niveau;"+niveau.getIdNiveau()+";"+niveau.getHsp());
          
            for (Appartement appart : niveau.getListeAppartement()) {
                save.write( ";"+appart.getIdAppartement());
            }
            save.newLine();
            }
           
           
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    try{
         save.write("Type ; identifiant batiment ; Nombre de niveaux");
         save.newLine();
            
               
            save.write("Batiment;"+bat.getIdBatiment()+";"+bat.getNbNiveaux());
            save.newLine();
            }        
    catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    save.close();
}
    
}
