/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

/**
 *
 * @author hugog
 */
public class Revetement {
    
//Attribut
    int idRevetement;
    double prixRevetement;
    
    //Constructeur 
    
    Revetement(int id, double  prix){
        this.idRevetement = id;
        this.prixRevetement = prix;
    }
    
    public class Peinture {
    
    //Attribut
    int idPeinture;
    double prixPeinture;
    
    //Constructeur 
    
    Peinture(int id, double  prix){
        this.idPeinture = id;
        this.prixPeinture = prix;
    }
    static double MontantPeinture(Mur m, Sol s,Plafond pl, Peinture p){
        double montantPeinture = (m.surface()+s.surface()+pl.surface())*p.prixPeinture;
        return (montantPeinture);
}
    public class Carrelage {
    
    //Attribut
    int idCarrelage;
    double prixCarrelage;
    
    //Constructeur 
    
    Carrelage(int id, double  prix){
        this.idCarrelage = id;
        this.prixCarrelage = prix;
    }
    static double MontantCarrelage(Mur m, Sol s,Plafond pl, Carrelage p){
        double montantCarrelage = (m.surface()+s.surface()+pl.surface())*p.prixCarrelage;
        return (montantCarrelage);
}
}
    public class Isolation {
    
    //Attribut
    int idIsolant;
    double prixIsolant;
    
    //Constructeur 
    
    Isolation(int id, double  prix){
        this.idIsolant= id;
        this.prixIsolant = prix;
    }
    static double MontantCarrelage(Mur m, Sol s,Plafond pl, Isolation p){
        double montantIsolant = (m.surface()+s.surface()+pl.surface())*p.prixIsolant;
        return (montantIsolant);
}
}
    
}}
