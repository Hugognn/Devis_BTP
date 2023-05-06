/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_info_s2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sgourjon01
 */
public class Coin {
  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coin{");
        sb.append("idCoin=").append(idCoin);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append('}');
        return sb.toString();
    }
    // Attributs
    int idCoin;
    double cx;
    double cy;
    private static List<Coin> coinList = new ArrayList<Coin>();
    // Constructeur
    Coin(int id, double x, double y)
    {
      this.idCoin=id;
      this.cx=x;
      this.cy=y;
      coinList.add(this);
    }
    //getter
    public int getIdCoin() {
    return this.idCoin;
    }

    public double getCx() {
        return this.cx;
    }

    public double getCy() {
        return this.cy;
    }
    public static List<Coin> getCoinList() {
        return coinList;
    }

    void afficher()
    {
        System.out.println(" Coin : id ="+this.idCoin+" abscisse = "+this.cx+ " Ordonnée ="+this.cy);
    }
            
}