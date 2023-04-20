/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

/**
 *
 * @author hugog
 */
public class Batiment {
   
    
    //Attribut
    public static int idBatiment;
    int nbNiveaux;
    
    //Constructeur 
    
    Batiment(int id, int  nbNiveaux){
        this.idBatiment = id;
        this.nbNiveaux = nbNiveaux;
    } 
    public static void afficher(){
        System.out.println("idBatiment = "+idBatiment);
    }
    //static double surfaceRevetement(Revetement idRevetement){
    //}
}
