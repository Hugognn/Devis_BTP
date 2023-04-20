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
    ArrayList<Revetement> listeRevetements = new ArrayList<Revetement>();
    int nbrePortes;
    int nbreFenetres;
    
    
    
    
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
}
