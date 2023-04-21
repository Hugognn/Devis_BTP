package com.mycompany.projet_info_s2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Double;

public class Projet_info_S2{
    
    public static void main (String[]args) throws IOException{
      //Création du niveau
        System.out.println("Identifiant niveau");
        int idn = Lire.i();
        System.out.println("Hauteur sous plafond du niveau");
        double h = Lire.f();
        Niveau N1 = new Niveau(idn,h);
      //Coin c1;
        System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin");
        double y=Lire.d();
        Coin c1=new Coin(id,x,y);
      //Pour afficher textuellement le coin c1
        c1.afficher();
      //Coin c2;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         Coin c2=new Coin(id,x,y);
         c2.afficher();
         //Mur m1;
         System.out.println(" Identifiant du Mur");
         id=Lire.i();
         Mur m1=new Mur(id,c1,c2,N1,0,0);
         m1.afficher();
         System.out.println(m1.toString());
         //Format de l'affichage
         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur);

         System.out.println("La surface du mur est de :" + m1.surface + " m²");
         
        // Définir les revetements et l'hauteur du revetement en question
         System.out.println(m1.prix);
    } 
}