package com.mycompany.projet_info_s2;

import java.util.ArrayList;

public class Projet_info_S2{
    
    public static void main (String[]args){
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
         Mur m1=new Mur(id,c1,c2,N1);
         m1.afficher();
         System.out.println(m1.toString());
         //Format de l'affichage
         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());

         System.out.println("La surface du mur est de :" + m1.surface() + " m²");
         
         //Revetement
//         System.out.println("Identifiant Revêtement :");
//         int idRevetement1 = Lire.i();
//         System.out.println("Jusqu'à quelle hauteur ? :");
//         double hrevetement1 = Lire.d();
//         if (hrevetement1 <= N1.hsp){
//            System.out.println("Identifiant Deuxième Revêtement :");
//            int idRevetement2 = Lire.i();

        double sommeh=0;
        int i = 0;
        System.out.println("Nous allons donner la liste des revetements du mur de bas en haut.");
        while (sommeh<m1.niveau.hsp){
            System.out.println("Identifiant revetement, jusqu'à quelle hauteure");
            int r = Lire.i();
            m1.listeRevetements = m1.listeRevetements.add();
            double hr  = Lire.d();
            m1.hauteur = m1.hauteur.add(hr);
            
            
            
            
        }
    }
         
}