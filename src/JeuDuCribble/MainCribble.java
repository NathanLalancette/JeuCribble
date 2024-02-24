package JeuDuCribble;

import Accessoires.Carte;
import Accessoires.Paquet;
import utile.Utile;

import java.util.ArrayList;

public class MainCribble {
    private ArrayList<Carte> mainJoueur = new ArrayList<>();
    private ArrayList<Carte> cribble = new ArrayList<>();
    private Paquet paquet;

    public MainCribble(Paquet paquet, int nbCartes, int nbCarteDansLeCribble) {
        this.paquet = paquet;
        for (int i = 0; i < nbCartes; i++) {
            pigerAuCribble();
        }
    }

    private void pigerAuCribble() {
        mainJoueur.add(paquet.piger());
    }
    public int getValeurDeCarte(Carte carte) {
        int valeurCarte;
        if (carte.getValeur() >= 10) {
            valeurCarte = 10;
        } else if (carte.getValeur() == 1) {
            valeurCarte = 11;
        } else valeurCarte = carte.getValeur();
        return valeurCarte;
    }
}
