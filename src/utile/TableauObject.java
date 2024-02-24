//TP5
//420-201 – Introduction à la programmation
//Groupe 2 – lundi & jeudi
//Nom : Lalancette
//Prénom : Nathan
//DA : 2236998
package utile;


public class TableauObject {
    public static final Object VALEUR_DEFAUT = null;
    public static final int LONGUEUR_DEFAUT = 5;

    private Object[] tabEncapsule;


    public TableauObject(int longueur, Object valeurs) {
        this.tabEncapsule = new Object[longueur];
        setAll(valeurs);
    }

    public TableauObject(int longueur) {
        this(longueur, VALEUR_DEFAUT);
    }

    public TableauObject() {
        this(LONGUEUR_DEFAUT);
    }

    public void setAll(Object valeurs) {
        for (int i = 0; i < tabEncapsule.length; i++) {
            tabEncapsule[i] = valeurs;
        }
    }

    public String toString() {
        String valeursTableau = "";
        for (int i = 0; i < tabEncapsule.length; i++) {
            if (i == 0) {
                valeursTableau += tabEncapsule[i];
            } else valeursTableau += ", " + tabEncapsule[i];


        }
        return "longueur: " + tabEncapsule.length + " [" + valeursTableau + "]";
    }

    public int size() {
        return tabEncapsule.length;
    }

    public void set(int indice, Object valeur) {
        tabEncapsule[indice] = valeur;
    }

    public Object get(int i) {
        return tabEncapsule[i];
    }

    public void add(Object v) {
        Object[] tabObj = new Object[this.tabEncapsule.length + 1];
        for (int i = 0; i < tabEncapsule.length; i++) {
            tabObj[i] = this.tabEncapsule[i];
        }
        tabObj[tabEncapsule.length] = v;
        tabEncapsule = tabObj;
    }

    public void clear() {
        for (int i = 0; i < tabEncapsule.length; i++) {
            tabEncapsule[i] = 0.0;
        }
    }

    public Object remove(int indice) {
        Object retire = tabEncapsule[indice];
        Object[] tabCopie = new Object[tabEncapsule.length - 1];
        int j = 0;
        for (int i = 0; i < tabEncapsule.length; i++) {
            if (indice != i) {
                tabCopie[j++] = tabEncapsule[i];
            }
        }
        tabEncapsule = new Object[tabCopie.length];
        for (int i = 0; i < tabEncapsule.length; i++) {
            tabEncapsule[i] = tabCopie[i];
        }
        return retire;
    }

    public void set(Object[] tab) {
        tabEncapsule = new Object[tab.length];
        for (int i = 0; i < tabEncapsule.length; i++) {
            tabEncapsule[i] = tab[i];
        }
    }
    public void shuffle() {
        for (int i = 0; i < tabEncapsule.length; i++) {
            permuter(i, Utile.getNombreAleatoireEntreBorne(0, tabEncapsule.length - 1));
        }
    }
    public void permuter(int indice1, int indice2){
        Object o = tabEncapsule[indice1];
        tabEncapsule[indice1] = tabEncapsule[indice2];
        tabEncapsule[indice2] = o;
    }
}

