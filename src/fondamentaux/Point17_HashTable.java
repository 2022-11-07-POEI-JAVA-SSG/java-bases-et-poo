package fondamentaux;

import java.util.HashMap;

public class Point17_HashTable {
    public static void main(String[] args) {
        HashMap<String,String> identite=new HashMap<>();
        // nom : Lisangola
        // prenom : Christian
        // pays : Belgique
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");
        identite.put("pays","Belgique");
//        System.out.println(identite);

        System.out.println(identite.get("prenom"));
    }
}
