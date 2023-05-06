package com.mycompany.projet_info_s2;

import java.io.IOException;

public class Projet_info_S2{
    
    public static void main (String[]args) throws IOException{
        Save s= new Save();
        Coin c1= new Coin(1,0,0);
        Coin c2= new Coin(2,0,1);
        Coin c3= new Coin(3,1,1);
        Coin c4= new Coin(4,1,0);
        Mur m1 = new Mur(1,c1,c2);
        Mur m2 = new Mur(2,c2,c3);
        Mur m3 = new Mur(3,c3,c4);
        Mur m4 = new Mur(4,c4,c1);
        Piece p1 = new Piece(1,m1,m2,m3,m4);
        Appartement a1 = new Appartement(1,p1);
        Batiment b1 = new Batiment(1,3);
        Save.sauvegarder(Coin.getCoinList(), Mur.getMurList(),Piece.getPieceList(),Appartement.getListeAppartements(),Niveau.getNiveauxList(),b1 ,"6");
//      //Création du niveau
//        System.out.println("Identifiant niveau");
//        int idn = Lire.i();
//        System.out.println("Hauteur sous plafond du niveau");
//        double h = Lire.d();
//        Niveau N1 = new Niveau(idn,h);
//                                Coin [] C = new Coin[4];
//      //Coin c1
//        System.out.println(" Identifiant du Coin");
//        int id=Lire.i();
//        System.out.println(" Abscisse du Coin");
//        double x=Lire.d();
//        System.out.println(" Ordonnée du Coin");
//        double y=Lire.d();
//        Coin c1=new Coin(id,x,y);
//                                C[0] = c1;
//      //Pour afficher textuellement le coin c1
//        c1.afficher();
//      //Coin c2
//         System.out.println(" Identifiant du Coin");
//         id=Lire.i();
//         System.out.println(" Abscisse du Coin");
//         x=Lire.d();
//         System.out.println(" Ordonnée du Coin");
//         y=Lire.d();
//         Coin c2=new Coin(id,x,y);
//                                C[1] = c2;
//         c2.afficher();
//                         System.out.println(" Identifiant du Coin");
//                         id=Lire.i();
//                         System.out.println(" Abscisse du Coin");
//                         x=Lire.d();
//                         System.out.println(" Ordonnée du Coin");
//                         y=Lire.d();
//                         Coin c3=new Coin(id,x,y);
//                         c3.afficher();
//                                 C[2] = c3;                         
//                         System.out.println(" Identifiant du Coin");
//                         id=Lire.i();
//                         System.out.println(" Abscisse du Coin");
//                         x=Lire.d();
//                         System.out.println(" Ordonnée du Coin");
//                         y=Lire.d();
//                         Coin c4=new Coin(id,x,y);
//                         c4.afficher();
//                                C[3] = c4;
//                                System.out.println("Donnez l'identifiant du sol");
//                                id = Lire.i();
//                        Sol Sol1 = new Sol(id,C);
//                        
//                        int i = 0;                  // Pour checker que les revetements du sol sont bien sauvegardé dans l'arrayliste
//                        while (i<Sol1.RS.size()){
//                            System.out.print(Sol1.RS.get(i) +";" );
//                            i++;
//                        }
//                        System.out.println();                   //Vérifier que le prix du sol correspond bien
//                        System.out.println(Sol1.prix);
//                        
//                        System.out.println("Donnez l'identifiant du plafond :");
//                        id = Lire.i();
//                        Plafond Plafond1 = new Plafond(id, C);
//                        i = 0;                  // Pour checker que les revetements du sol sont bien sauvegardé dans l'arrayliste
//                        while (i<Plafond1.RP.size()){
//                            System.out.print(Plafond1.RP.get(i) +";" );
//                            i++;
//                        }
//                        System.out.println(Plafond1.prix);
//         //Mur m1
//         System.out.println(" Identifiant du Mur");
//         id=Lire.i();
//         Mur m1=new Mur(id,c1,c2,N1,0,0);
//         m1.afficher();
//         System.out.println(m1.toString());
//         //Format de l'affichage
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur);
////      
//        c1 = null;
//        System.out.println(m1.longueur);
////         System.out.println("La surface du mur est de :" + m1.surface + " m²");
////         
////        // Définir les revetements et l'hauteur du revetement en question
////         System.out.println(m1.prix);
//        System.out.println("Comment voulez-vous appeller le batiment ?");
//        String nom = Lire.S();
//        System.out.println("Combien de niveaux voulez-vous ?");
//        int nbrN = Lire.i();
//        if(nbrN ==1){
//            Maison M = new Maison(1,nom);
//            System.out.println(M.prix);
//        }else{
//            Immeuble I = new Immeuble (1, nom,nbrN);
//            System.out.println(I.prix);
//        }
   } 
}