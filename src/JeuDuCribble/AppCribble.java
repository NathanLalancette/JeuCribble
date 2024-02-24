package JeuDuCribble;

import utile.Utile;

public class AppCribble {
    public PartieDuCribble partieDuCribble;

    public AppCribble() {
        do {
            partieDuCribble = new PartieDuCribble();
        } while (Utile.saisirCaracterValide("Voulez-vous jouer une autre partie ? (o/n) ", "on") == 'o');
    }


    public static void main(String[] args) {
        new AppCribble();
    }
}
