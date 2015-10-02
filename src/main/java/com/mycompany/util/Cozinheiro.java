/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.cdp.Pizza;

/**
 *
 * @author Ricardo
 */
public class Cozinheiro implements Director {
    public Pizza criarPizza(Builder ajudante) {
        Pizza pizza = null;
        
        ajudante.prepararMassa();
        ajudante.prepararMolho();
        ajudante.prepararRecheio();
        pizza = ajudante.colocarForno();
        return pizza;
    }
}
