/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Stéphane
 */
    class Revetement{                   //Avec la manière dont ça a été codé jusqu'a présent, elle est inutile, comme "Ouverture"
        
        int idRevetement;
        String designation;
        boolean pourMur;
        boolean pourSol;
        boolean pourPlafond;
        double prixUnitaire;
        
        double montantR;
        
        Revetement(int id) throws IOException{
            String [][] Revetement = lecturefichierrevetement();
            double prix = Double.parseDouble(Revetement[id][5]);
            int bitmur = Integer.parseInt(Revetement[id][2]);
            int bitsol = Integer.parseInt(Revetement[id][3]);
            int bitplafond = Integer.parseInt(Revetement[id][4]);
            
            this.idRevetement = id;
            this.designation = Revetement[id][1];
            
            if (bitmur == 1){
                this.pourMur = true;
            }else{this.pourMur = false;}
            
            if (bitsol == 1){
                this.pourSol = true;
            }else{this.pourSol = false;}
            
            if (bitplafond == 1){
                this.pourPlafond = true;
            }else{this.pourPlafond = false;}
            
            this.prixUnitaire = prix;
            
        }
        
        String [][] lecturefichierrevetement() throws FileNotFoundException, IOException{      // int id correspond à l'identifiant du revetement
        
            double prix ;
            FileReader fr = new FileReader("CatalogueRevetements.txt");
            BufferedReader br = new BufferedReader(fr);
            int i=0;
            String[][] elements = new String [100][100];
            String ligne;
            while((ligne = br.readLine())!=null){
                String[] elements2 = ligne.split(";");
                for(int j=0;j<elements2.length;j++)
                {
                    elements[i][j]=elements2[j];
                }
                i++;
            }return elements;
        }
        
//        double prix = Double.parseDouble(elements[r][5]);
//        return value;
    }
        
//        double montantTotalRevetement(){
//        
//            
//        }
        
        
}
