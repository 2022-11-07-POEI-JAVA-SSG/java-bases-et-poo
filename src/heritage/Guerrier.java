package heritage;

// DRY : Don't repeat yourself

public class Guerrier extends Personnage {
    private String arme;

    public Guerrier(String name, int dureeDeVie, String arme) {
        super(name,dureeDeVie);
        this.arme = arme;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }


    @Override
    public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un un guerrier.\n",this.getName());
    }
}
