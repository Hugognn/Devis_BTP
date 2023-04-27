/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Stéphane
 */
public class Sol {
    //Attributs
    Coin [] CS = new Coin[4];                   //Considérer une pièce rectangulaire
    ArrayList<Integer> SaisieIdRS = new ArrayList<Integer>();
    ArrayList<Revetement> SaisieR = new ArrayList<Revetement>();
    //Niveau niveau;          //Pas sûr de l'utilité
    int idSol;
    double surface;
    double prix;
    
    Sol(int id, Coin [] C) throws IOException{
        this.idSol = id;
        this.surface = this.surface(C);
        this.SaisieRevetementsSol();
        this.prix = this.MontantRevetement();
    }
    
    double distance2points(Coin C1, Coin C2){
        return (Math.sqrt((C2.cx-C1.cx)*(C2.cx-C1.cx) + (C2.cy-C1.cy)*(C2.cy-C1.cy)));
    }
    
    double surface(Coin[] C){
        
        double DC12 = distance2points(C[0],C[1]);
        double DC13 = distance2points(C[0],C[2]);
        double DC14 = distance2points(C[0],C[3]);
        double largeur ;
        double longueur ;
        double hypothenus ;
        
        if ((DC12<=DC13) && (DC12<=DC14)){              //Recherche de la largeur
            largeur = DC12;
        }else if ((DC13<=DC12) && (DC13<=DC14)){
            largeur = DC13;
        }else{
            largeur = DC14;
        }
        
        if ((DC12<=DC13) && (DC14<=DC13)){              //Recherche de la longueur
            hypothenus = DC13;
        }else if ((DC14<=DC12) && (DC13<=DC12)){
            hypothenus = DC12;
        }else{
            hypothenus = DC14;
        }
        longueur = (Math.sqrt((hypothenus*hypothenus)-(largeur*largeur)));
        
    return (largeur * longueur);
    }
    
    void SaisieRevetementsSol() throws FileNotFoundException, IOException{
        
        this.SaisieIdRS.clear();
        this.SaisieR.clear();
        
        int p = 0;
//        FileReader fr = new FileReader("CatalogueRevetements.txt");
//        BufferedReader br = new BufferedReader(fr);
//        int i = 0;
//        String[][] elements = new String[100][100];
//        String ligne ;
//        while((ligne = br.readLine())!=null){
//            String[] elements2= ligne.split(";");
//            for(int j=0;j<elements2.length;j++)
//            {
//                elements[i][j]=elements2[j];
//            }
//            i++;
//        }
//        
//        double value;
        String reponse = "Oui";
        System.out.println("Nous allons donner la liste des revetements du sol, le revetement sera appliqué sur la totalité du sol.");
        while (reponse.equalsIgnoreCase("oui")){
            System.out.println("Identifiant revetement :");
            int r = Lire.i();
            Revetement r1 = new Revetement(r);
            this.SaisieR.add(p,r1);
            while ((SaisieIdRS.contains(r)) || (r>19) || (r<1) || (this.SaisieR.get(p).pourSol == false)){                                     //Faire la saisie forcé d'un revetement special mur
                System.out.println("Ce revetement est soit déjà présent sur le sol, soit il n'existe pas ou alors il n'est pas addapté pour les sols :");
                r = Lire.i();
                this.SaisieR.set(p, new Revetement(r));
            }
            this.SaisieIdRS.add(p,r);
            System.out.println(this.SaisieIdRS.get(p));
            p = p+1;
            System.out.println("Voulez vous appliquer un autre revetement ? Oui/Non");
            reponse = Lire.S();
        }
        
    }
    
//    public double lecturepixrevetement(int r) throws FileNotFoundException, IOException{      // int r correspond à l'identifiant du revetement
//        FileReader fr = new FileReader("CatalogueRevetements.txt");
//        BufferedReader br = new BufferedReader(fr);
//        int i=0;
//        String[][] elements = new String [100][100];
//        String ligne;
//        while((ligne = br.readLine())!=null){
//            String[] elements2= ligne.split(";");
//            for(int j=0;j<elements2.length;j++)
//            {
//                elements[i][j]=elements2[j];
//            }
//            i++;
//        }
//        double value = Double.parseDouble(elements[r][5]);
//        return value;
//    }
    
    double MontantRevetement() throws FileNotFoundException, IOException{
        double montantrevetement = 0;
        int h =0;                               //Pas fait de la manière la plus efficace mais fonctionne
        while(h<this.SaisieIdRS.size()){
            montantrevetement = montantrevetement + this.surface*(this.SaisieR.get(h).prixUnitaire);
            h = h+1 ;
        }
        return montantrevetement ;
    }
    
}
