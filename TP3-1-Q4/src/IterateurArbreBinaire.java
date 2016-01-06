//
// File : IterateurArbreBinaire.java 
//

import java.util.Iterator;

public class IterateurArbreBinaire<T> implements Iterator<ArbreBinaire<T>>
{
    ArbreBinaire<T> suivant;

    public IterateurArbreBinaire(ArbreBinaire<T> arbre)
    {
        //Parcours infixe, on commence au plus a gauche
        this.suivant = getLePlusAGauche(arbre);
    }

    @Override
    public boolean hasNext()
    {
        return (suivant != null);
    }

    private ArbreBinaire<T> getLePlusAGauche(ArbreBinaire<T> arbre)
    {
        ArbreBinaire<T> lePlusAGauche = arbre;
        while (lePlusAGauche.getfG() != null)
            lePlusAGauche = lePlusAGauche.getfG();
        return lePlusAGauche;
    }

    private void setSuivant()
    {
        //S'il a un fils droit, c'est comme un nouvel arbre,
        //On recommence a gauche
        if (this.suivant.getfD() != null)
            this.suivant = getLePlusAGauche(this.suivant.getfD());
        else
        {
            //Sinon, on remonte jusqu'a la racine non affichee,
            //La premiere racine avec arbre dans sa partie gauche
            ArbreBinaire<T> pere = this.suivant.getPere();
            ArbreBinaire<T> aux = this.suivant;
            while (pere != null && pere.getfD() == aux)
            {
                pere = pere.getPere();
                aux = aux.getPere();
            }
            this.suivant = pere;
        }
    }

    @Override
    public ArbreBinaire<T> next()
    {
        ArbreBinaire<T> retour = new ArbreBinaire<T>(this.suivant);
        this.setSuivant();
        return retour;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}

