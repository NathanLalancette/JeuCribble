//TP5
//420-201 – Introduction à la programmation
//Groupe 2 – lundi & jeudi
//Nom : Lalancette
//Prénom : Nathan
//DA : 2236998
package Accessoires;


import utile.TableauObject;

public class Paquet {

    private TableauObject paquet;

    public Paquet(boolean melanger) {
        paquet = new TableauObject(52);
        remplirPaquet();
        if (melanger){
            melanger();
        }
    }

    private void remplirPaquet() {
        Carte carte;
        int pique = 1, trefle = 1, carreau = 1, coeur = 1;
        for (int i = 0; i < paquet.size(); i++) {
            if (i < 13) {
                carte = new Carte(pique++, "Pique");
                paquet.set(i, carte);
            } else if (i < 26) {
                carte = new Carte(trefle++, "trèfle");
                paquet.set(i, carte);
            } else if (i < 39) {
                carte = new Carte(carreau++, "carreau");
                paquet.set(i, carte);
            } else if (i < 52) {
                carte = new Carte(coeur++, "coeur");
                paquet.set(i, carte);
            }
        }
    }

    @Override
    public String toString() {
        String retour = "";
        for (int i = 0; i < paquet.size(); i++) {
            retour += paquet.get(i);
        }
        return retour;
    }

    public boolean estVide() {
        return getNombreDeCartes() == 0;
    }

    public int getNombreDeCartes() {
        return paquet.size();
    }

    public void melanger() {
        paquet.shuffle();
    }

    public Carte piger() {
        if (estVide()) {
            return null;
        } else {
            return (Carte) paquet.remove(0);
        }

    }
}
//