package heritage;

public class MainJeux {
    public static void main(String[] args) {
        var chris=new Guerrier("Christian Lisangola",100,"AK-47");
        var marie=new Magicien("Marie Bocage",150,"Marie Guette");
        var abdelali=new Sorcier("Abdelali Akhyat",200,"Baguette Abdel","Baton Abdel");

//        La classe Personnage n'existe que pour généraliser les caracteristiques
//        partagées en le guerrier, magiciein et le sorcier
//        Donc, pas besoin d'en créer des instances
//        var thomas=new Personnage("Thomas RUST",300);
//        System.out.println(thomas.getName());
//        System.out.println(thomas.getDureeDeVie());
        chris.presentation();
        marie.presentation();
        abdelali.presentation();
    }
}
