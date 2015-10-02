/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

import com.mycompany.cdp.Pizza;
import java.util.HashMap;

/**
 *
 * @author Ricardo
 */
public class FabricaPizza {
    private static HashMap<String, Builder> builders = new HashMap<>();
    
    private FabricaPizza() {
        builders.put("FrangoCatupiry", new FrangoCatupiryBuilder());
    }
    public static Pizza criarPizza(String nome) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Builder builder = builders.get(nome);

        Pizza pizza = cozinheiro.criarPizza(builder);
        return pizza;
    }
}
