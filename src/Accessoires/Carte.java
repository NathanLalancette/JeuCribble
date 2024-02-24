//TP5
//420-201 – Introduction à la programmation
//Groupe 2 – lundi & jeudi
//Nom : Lalancette
//Prénom : Nathan
//DA : 2236998
package Accessoires;


import utile.Utile;

import java.util.Objects;

public class Carte {
    public static final String[] COULEURS_VALIDES = {"pique", "trèfle", "carreau", "coeur"};
    public static final char[] COULEURS_CAR = {'\u2660', '\u2663', '\u2666', '\u2764'};
    private int valeur;
    private String couleur;

    public Carte(int valeur, String couleur) {
        setCouleur(couleur);
        setValeur(valeur);
    }

    public char getCharCarte() {
        char symbole = 's';
        switch (couleur) {
            case "pique":
                symbole = '\u2660';
                break;
            case "trèfle":
                symbole = '\u2663';
                break;
            case "carreau":
                symbole = '\u2666';
                break;
            case "coeur":
                symbole = '\u2764';
        }
        return symbole;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        if (valeurEstValide(valeur)) {
            this.valeur = valeur;
        } else throw new IllegalArgumentException("La valeur " + valeur + " n'est pas valide.");

    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)) {
            this.couleur = couleur.toLowerCase();
        } else throw new IllegalArgumentException("La couleur " + couleur + " n'est pas valide.");
    }

    public static boolean couleurEstValide(String couleur) {return Utile.trouverStr(couleur, COULEURS_VALIDES) != -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte carte)) return false;

        if (valeur != carte.valeur) return false;
        return Objects.equals(couleur, carte.couleur);
    }

    @Override
    public int hashCode() {
        int result = valeur;
        result = 31 * result + (couleur != null ? couleur.hashCode() : 0);
        return result;
    }

    public static boolean valeurEstValide(int valeur) {
        return valeur >= 1 && valeur <= 13;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur + " (" + getCharCarte() + ")";
    }
}
