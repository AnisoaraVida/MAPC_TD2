package td2.systeme;

import java.util.List;

public class Composite {
    private List<Composant> liste_fichier;
    private Object List;

    public Composite(){
        this.liste_fichier = liste_fichier;
    }

    public void addChild(Composant c){
        liste_fichier.add(c);
    }

    public List<Composant> getChildren(){
        return liste_fichier;
    }
    public void removeChild(Composant c){
         liste_fichier.remove(c);
    }

    public void removeChildren( List<Composant> l ) {
        liste_fichier.remove(l);
    }
}
