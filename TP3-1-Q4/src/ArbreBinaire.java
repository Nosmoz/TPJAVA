//
// File : ArbreBinaire.java
//


public class ArbreBinaire<T> implements Iterable<ArbreBinaire<T>>
{
    private ArbreBinaire<T> pere;
    private ArbreBinaire<T> fG;
    private ArbreBinaire<T> fD;
    private T donnee;

    public ArbreBinaire(ArbreBinaire<T> fG, T donnee, ArbreBinaire<T> fD)
    {
        this.pere = null;
        this.fG = fG;
        this.donnee = donnee;
        this.fD = fD;
        if (fG != null)
        {
            if (fG.getPere() != null)
                throw new IllegalArgumentException();
            fG.pere = this;
        }
        if (fD != null)
        {
            if (fD.getPere() != null)
                throw new IllegalArgumentException();
            fD.pere = this;
        }
    }

    public ArbreBinaire(ArbreBinaire<T> arbre)
    {
        //Constructeur par recopie
        this.pere = arbre.pere;
        this.fG = arbre.fG;
        this.fD = arbre.fD;
        this.donnee = arbre.donnee;
    }

    public ArbreBinaire<T> getPere()
    {
        return pere;
    }
    public ArbreBinaire<T> getfG()
    {
        return fG;
    }
    public ArbreBinaire<T> getfD()
    {
        return fD;
    }
    public T getDonnee()
    {
        return donnee;
    }

    @Override
    public IterateurArbreBinaire<T> iterator()
    {
        return new IterateurArbreBinaire<T>(this);
    }


}
