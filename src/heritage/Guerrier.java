package heritage;

// DRY : Don't repeat yourself

public class Guerrier extends Personnage {
    private Arme arme;

    public Guerrier(String name, int dureeDeVie, Arme arme) {
        super(name,dureeDeVie);
        this.arme = arme;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }


    @Override
    public void presentation(){
        System.out.printf("Mon nom est %s, et je suis un un guerrier.\n",this.getName());
    }
}
