package poo;

public class Etudiant {
    private String nom;
    private String prenom;
    private String pays;

    private boolean married;

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Etudiant(String nom, String prenom, String pays, boolean married) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.married = married;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
