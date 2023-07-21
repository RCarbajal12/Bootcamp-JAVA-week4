package com.romina.maestro.objetos.main;

import com.romina.maestro.objetos.clase.Human;
import com.romina.maestro.objetos.clase.Ninja;
import com.romina.maestro.objetos.clase.Samurai;
import com.romina.maestro.objetos.clase.Wizard;

public class HumanTest {

    public static void main(String[] args) {

        Human ninja = new Ninja("Ninja ");
        Human samurai = new Samurai("Samurai ");
        Human wizard = new Wizard("Wizard ");
        
        //EJECUTANDO MÉTODO
        System.out.println("Vida inicial de Ninja: " + ninja.getHealth());
        System.out.println("Vida inicial de Samurai: " + samurai.getHealth());
        System.out.println("Vida inicial de Wizard: " + wizard.getHealth());
        
        samurai.attack(wizard);
        samurai.attack(wizard);


        System.out.println( "Wizard tiene " + wizard.getHealth() + " puntos de vida ");
       
      
        }

    }
