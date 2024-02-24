//TP5
//420-201 – Introduction à la programmation
//Groupe 2 – lundi & jeudi
//Nom : Lalancette
//Prénom : Nathan
//DA : 2236998
package utile;

import java.util.Random;
import java.util.Scanner;

public class Utile {
    public static int trouverStr(String str, String[] chaine) {
        int indice = -1;
        boolean tu = false;
        for (int i = 0; i < chaine.length && !tu; i++) {
            if (str.equalsIgnoreCase(chaine[i])) {
                indice = i;
                tu = true;

            }
        }
        return indice;
    }
    public static int getNombreAleatoireEntreBorne(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max doit etre plus grand que min");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    public static int lireEntier(String q){
        int chiffre = Integer.parseInt(lireString(q));
        return chiffre;
    }
    public static String lireString(String question){
        Scanner sc = new Scanner(System.in);
        String reponse;
        afficherQuestion(question);
        reponse = sc.nextLine();
        return reponse;
    }
    public static void afficherQuestion(String question){
        System.out.print(question);
    }

    public static char saisirCaracterValide(String question, String carValides){
        String reponse = lireString(question);

        if (reponse.equals("") || indexOf_ignoreCase(carValides, reponse.charAt(0)) == -1){
            do {
                System.out.println("Entrez un choix valide (" + carValides + ")");
                reponse = lireString(question);
            } while (reponse.equals("") || indexOf_ignoreCase(carValides, reponse.charAt(0)) == -1);
        }
        return Character.toLowerCase(reponse.charAt(0));
    }
    public static int indexOf_ignoreCase(String str, char caractere){
        int retour = -1;
        boolean troouve = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(caractere)){
                retour = i;
                troouve = true;
            }
        }
        return retour;
    }

}
