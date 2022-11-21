package fondamentaux;

import java.util.Scanner;

public class E2_LectureClavier {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=keyboardInput.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=keyboardInput.nextLine();

        System.out.print("Votre age : ");
        int age=keyboardInput.nextInt();


        System.out.print("Votre poids : ");
        double poids=keyboardInput.nextDouble();


        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d ans\nPoids : %.1f kg",nom,
                prenom,age
                ,poids);

    }
}
