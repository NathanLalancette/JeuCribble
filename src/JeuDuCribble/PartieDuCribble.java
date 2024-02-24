package JeuDuCribble;

import Accessoires.Paquet;
import utile.Utile;

public class PartieDuCribble {
    private MainCribble mainCribble;
    private Cribble cribble;

    private Paquet paquet;

    public PartieDuCribble() {jouer();
    }

    private void jouer() {
       paquet = new Paquet(true);
        int nbJoueur = Utile.saisirCaracterValide("Combien de joueur", "2, 3, 4");
        if (nbJoueur == 2){
            mainCribble = new MainCribble(paquet, 6, 0);
        }if (nbJoueur == 3){
            mainCribble = new MainCribble(paquet, 5, 1);
        }
    }
}
