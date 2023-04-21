/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Double;

/**
 *
 * @author Amadou Coulibaly
 */
public class Mur {
    int idMur;
    Coin debut, fin;
    Niveau niveau ;
    int nbrePortes;
    int nbreFenetres;
    ArrayList<Integer> SaisieIdR = new ArrayList<Integer>();    //identifiant du revetement
    ArrayList<Double> SaisieHR = new ArrayList<Double>();       //hauteur du revetement
    double longueur;
    double surface ;
    double prix;
    
    Mur(int id, Coin dc, Coin fc, Niveau idn, int nbF, int nbP) throws FileNotFoundException, IOException{
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.niveau=idn;
        this.nbreFenetres = nbF;
        this.nbrePortes = nbP;
        this.longueur=(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
        this.surface=(this.longueur*this.niveau.hsp);
        this.SaisieRevetementsMur();            //permet de remplir les arraylist SaisieIdR et SaisieHR
        this.prix = this.MontantRevetement();
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
//    double longueur()
//    {
//        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
//    }
    
//    double surface()
//    {
//        return(this.longueur*this.niveau.hsp);
//    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + ", idNiveau=" + this.niveau.idNiveau + ", nombre de Fenetres=" + this.nbreFenetres + ", nombre de Portes=" + this.nbrePortes + "}";
    }
    
    void SaisieRevetementsMur() throws FileNotFoundException, IOException{
        
        this.SaisieIdR.clear();
        this.SaisieHR.clear();
        int p = 0 ;
        double hauteurtotaler=0;
        
        FileReader fr = new FileReader("CatalogueRevetements.txt");
        BufferedReader br = new BufferedReader(fr);
        int i = 0;
        String[][] elements = new String[100][100];
        String ligne ;
        while((ligne = br.readLine())!=null){
            String[] elements2= ligne.split(";");
            for(int j=0;j<elements2.length;j++)
            {
                elements[i][j]=elements2[j];
            }
            i++;
        }
        
        double value;
        
        
            System.out.println("Nous allons donner la liste des revetements du mur de bas en haut.");
            while (hauteurtotaler<this.niveau.hsp){
                System.out.println("Identifiant revetement, jusqu'à quelle hauteure");
                int r = Lire.i();
                
                while ((SaisieIdR.contains(r)) || (r>19) || (r<1) || ((value=Double.parseDouble(elements[r][2]))== 0)){                                     //Faire la saisie forcé d'un revetement special mur
                    System.out.println("Ce revetement est soit déjà présent sur le mur, soit il n'existe pas ou alors il n'est pas addapté pour les murs :");
                    r = Lire.i();
                }
                
                double hr = Lire.d();
                while (hr>this.niveau.hsp){
                    System.out.println("L'hauteur demandé est plus haute que la taille de la pièce, veuillez choisir une nouvelle hauteur :");
                    hr = Lire.d();
                }
                hauteurtotaler = hr;
                this.SaisieIdR.add(p,r);
                this.SaisieHR.add(p,hr);
                System.out.println(this.SaisieIdR.get(p) +" ; "+ this.SaisieHR.get(p));
                p = p+1;
            }
    }
    
    public double lecturepixrevetement(int r) throws FileNotFoundException, IOException{      // int r correspond à l'identifiant du revetement
        FileReader fr = new FileReader("CatalogueRevetements.txt");
        BufferedReader br = new BufferedReader(fr);
        int i=0;
        String[][] elements = new String [100][100];
        String ligne;
        while((ligne = br.readLine())!=null){
            String[] elements2= ligne.split(";");
            for(int j=0;j<elements2.length;j++)
            {
                elements[i][j]=elements2[j];
            }
            i++;
        }
        double value = Double.parseDouble(elements[r][5]);
        return value;
    }
    
    double MontantRevetement() throws FileNotFoundException, IOException{
        double montantrevetement = 0;
        int h =1;                               //Pas fait de la manière la plus efficace mais fonctionne
        montantrevetement = montantrevetement +(this.longueur*this.SaisieHR.get(0)*(Mur.this.lecturepixrevetement(this.SaisieIdR.get(0))));
        while(h<this.SaisieIdR.size()){
            montantrevetement = montantrevetement + (this.longueur*(this.SaisieHR.get(h)-this.SaisieHR.get(h-1))*(Mur.this.lecturepixrevetement(this.SaisieIdR.get(h))));
            h = h+1 ;
        }
        return montantrevetement ;
    }
}
