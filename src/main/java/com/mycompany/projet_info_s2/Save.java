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
public static void sauvegerder(List<Coin> coinList,List<Mur> murList, String nomFichier) throws IOException{
    String cheminFichier = "E:\\INSA\\STH\\S2\\Informatique\\Projet_info_S2\\" + nomFichier+".txt";
            BufferedWriter save = new BufferedWriter(new FileWriter(cheminFichier, true));
    try{
            for (Coin coin : coinList) {
            save.write("Coin;"+coin.getIdCoin()+";"+coin.getCx()+";"+coin.getCy());
            save.newLine();
            }        
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }

    try{
            for (Mur mur : murList) {
            
            
            save.write("Mur;"+mur.getIdMur()+";"+mur.getDebut()+";"+mur.getFin()+";"+mur.getRevetement());
            save.newLine();
            }
           
           
    }catch (IOException err){
      {System.out.println("Erreur :\n"+err);}
   }
    save.close();
}
    
}
