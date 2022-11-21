package fondamentaux;

public class E1_ExoAffichage {
    public static void main(String[] args) {
        double longueur=250;
        double largeur=140;
        double surface=longueur*largeur;
        double perimetre=2*(longueur+largeur);
        System.out.printf("longueur : %.1f m\nlargeur : %.1f\nsurface : %.1f m2" +
                "\npérimètre : %.1f m",longueur,largeur,surface,perimetre);
    }
}
