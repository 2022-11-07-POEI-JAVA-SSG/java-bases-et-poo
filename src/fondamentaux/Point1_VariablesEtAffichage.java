package fondamentaux;

public class Point1_VariablesEtAffichage {
    public static void main(String[] args) {
        int age=35;//Déclaration d'un entier
        String nom="Lisangola";//Déclaration d'une chaine des caractères
        String prenom="Christian";//Déclaration d'une chaine des caractères
        double poids=75.57;//Déclaration d'un réel

        /*
             Commentaires
             multilignes
        */

//        Affichage des variables de manière individuelle
//        System.out.println(age);
//        System.out.println(nom);
//        System.out.println(prenom);
//        System.out.println(poids);

        System.out.println("Je m'appelle "+prenom+" "+nom+", j'ai "+age+" ans et je pèse "+poids+ " Kg");

//        Affichage sans arrondissement
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %f kg\n",prenom,nom
                ,age,poids);

//        Affichage avec arrondissement
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %.1f kg\n",prenom
                ,nom
                ,age,poids);

        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\nPoids : %f",nom,prenom,age,poids);

    }
}
