package poo;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {



    public static void main(String[] args) {

        Rectangle rect=new Rectangle(500,250);
        Rectangle rect2=new Rectangle(rect);

        rect.setLongueur(1000);
        rect.setLargeur(650);
        System.out.println(rect);
        System.out.println(rect2);

//        System.out.printf("Longueur avant setter : %.1f\n",rect.getLongueur());
//        System.out.printf("Largeur avant setter : %.1f\n",rect.getLargeur());
//       rect.longueur=250.5;
//       rect.largeur=120.7;
//        rect.setLongueur(250);
//        rect.setLargeur(120);
//        System.out.printf("Longueur : %.1f\n",rect.getLongueur());
//        System.out.printf("Largeur : %.1f\n",rect.getLargeur());
//       System.out.printf("Surface : %.1f\n",rect.calculSurface());
//       System.out.printf("Perimetre : %.1f\n",rect.calculPerimetre());
//        System.out.println(rect);

        var etudiant=new Etudiant("Lisangola","Christian","Belgique",false);

    }
}
