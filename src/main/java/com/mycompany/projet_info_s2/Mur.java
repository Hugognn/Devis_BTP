/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;
import java.util.ArrayList;

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
    
    Mur(int id, Coin dc, Coin fc, Niveau idn){
        this.idMur=id;
        this.debut=dc;
        this.fin=fc;
        this.niveau=idn;
    }
    
    void afficher()
    {System.out.println("==== Mur =====");
        this.debut.afficher();
        this.fin.afficher();    
    }
    
    double longueur()
    {
        return(Math.sqrt((this.fin.cx-this.debut.cx)*(this.fin.cx-this.debut.cx) + (this.fin.cy-this.debut.cy)*(this.fin.cy-this.debut.cy)));
    }
    
    double surface()
    {
        return(this.longueur()*this.niveau.hsp);
    }
    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", debut=" + debut + ", fin=" + fin + ", idNiveau=" + this.niveau.idNiveau + "}";
    }
    
    void SaisieRevetementsMur(){
        this.SaisieIdR.clear();
        this.SaisieHR.clear();
        int p = 0 ;
        double hauteurtotaler=0;
            System.out.println("Nous allons donner la liste des revetements du mur de bas en haut.");
            while (hauteurtotaler<this.niveau.hsp){
                System.out.println("Identifiant revetement, jusqu'à quelle hauteure");
                int r = Lire.i();
                while (SaisieIdR.contains(r)){
                    System.out.println("Ce revetement est déjà présent sur ce mur, veuillez en choisir un autre :");
                    r = Lire.i();
                }
                double hr = Lire.d();
                while ((hr<=hauteurtotaler) || (hr>this.niveau.hsp)){
                    System.out.println("Il y a déjà un revetement jusqu'à cette hauteur ou l'hauteur demandé est plus haute que la taille de la pièce, veuillez choisir une nouvelle hauteur :");
                    hr = Lire.d();
                }
                hauteurtotaler = hr;
                this.SaisieIdR.add(p,r);
                this.SaisieHR.add(p,hr);
                System.out.println(this.SaisieIdR.get(p) +" ; "+ this.SaisieHR.get(p));
                p = p+1;
            }
            System.out.println();
            for (int m =0; m<this.SaisieIdR.size(); m++){
                System.out.println(this.SaisieIdR.get(m) +" ; "+ this.SaisieHR.get(m));
            }
    }
}
