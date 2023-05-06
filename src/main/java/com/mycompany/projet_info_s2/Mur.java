/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Double;
import java.util.List;
//import com.mycompany.projet_info_s2.Revetement;

/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    private int idMur;
    Coin debut, fin;
    double hsp ;
    ArrayList<Integer> SaisieIdR = new ArrayList<Integer>();    //identifiant du revetement
    ArrayList<Double> SaisieHR = new ArrayList<Double>();       //hauteur du revetement
    double longueur;
    double surface ;
    double prix;
    String revetement;
    private static List<Mur> murList = new ArrayList<Mur>();
    
    ArrayList<Revetement> SaisieR = new ArrayList<Revetement>();        //liste de revetements avec le type revetement
    
    Mur(int id, Coin dc, Coin fc) throws FileNotFoundException, IOException{              //les portes et fenetres sont enlevé parce qu'on va devoir les faire avec la classe ouverture et ses sous classes
     
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.longueur=(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
        //  this.surface=(this.longueur*this.hsp);
        System.out.println("Entrer identifiant revêtement");
        String r=Lire.S();
        this.revetement=r;            //permet de remplir les arraylist SaisieIdR et SaisieHR
        //this.prix = this.MontantRevetement();
        murList.add(this);
        
    }
        // Getters pour chaque attribut
    public int getIdMur() {
        return idMur;
    }

    public Coin getDebut() {
        return debut;
    }

    public Coin getFin() {
        return fin;
    }

    public double getLongueur() {
        return longueur;
    }

    public String getRevetement() {
        return revetement;
    }
    
    public static List<Mur> getMurList() {
        return murList;
    }
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    public void SaisieRevetementsMur() throws FileNotFoundException, IOException{
        
//        this.SaisieIdR.clear();
//        this.SaisieHR.clear();
//        double hauteurtotaler=0;
//        
//            int p = 0 ;
//            this.SaisieR.clear();
//            System.out.println("Nous allons donner la liste des revetements du mur de bas en haut.");
//            while (hauteurtotaler<this.hsp){
//                System.out.println("Identifiant revetement, jusqu'à quelle hauteure");
//                int r = Lire.i();
//                Revetement r1 =new Revetement(r);
//                this.SaisieR.add(p,r1);
//                while ((this.SaisieIdR.contains(r)) || (r>19) || (r<1) || (this.SaisieR.get(p).pourMur == false)){         //(value=Double.parseDouble(elements[r][2]))== 0) dans la dernière paranthèse                                  //Faire la saisie forcé d'un revetement special mur
//                    System.out.println("Ce revetement est soit déjà présent sur le mur, soit il n'existe pas ou alors il n'est pas addapté pour les murs :");
//                    r = Lire.i();
//                    this.SaisieR.set(p, new Revetement(r));
//                }
//                
//                double hr = Lire.d();
//                while (hr>this.hsp){
//                    System.out.println("L'hauteur demandé est plus haute que la taille de la pièce, veuillez choisir une nouvelle hauteur :");
//                    hr = Lire.d();
//                }
//                hauteurtotaler = hr;
//                this.SaisieIdR.add(p,r);
//                this.SaisieHR.add(p,hr);
//                System.out.println(this.SaisieIdR.get(p) +" ; "+ this.SaisieHR.get(p));
//                p = p+1;
//            }
            
    }
    
    
    double MontantRevetement() throws FileNotFoundException, IOException{       //Pour le mur en particulier
        double montantrevetement = 0;
        int h =1;                               //Pas fait de la manière la plus efficace mais fonctionne
        montantrevetement = montantrevetement +(this.longueur*this.SaisieHR.get(0)*(this.SaisieR.get(0).prixUnitaire));
        while(h<this.SaisieIdR.size()){
            montantrevetement = montantrevetement + (this.longueur*(this.SaisieHR.get(h)-this.SaisieHR.get(h-1))*(this.SaisieR.get(h).prixUnitaire));       //Mur.this.lecturepixrevetement(this.SaisieIdR.get(h)))     dans la dernière paranthèse
            h = h+1 ;
        }
        return montantrevetement ;
    }
}
