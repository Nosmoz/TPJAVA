//
// File : Feuille.java 
//

class Feuille implements Expression
{
    private int valeur;

    public Feuille(int valeur)
    {
        this.valeur = valeur;
    }

    @Override
    public int getValeur()
    {
        return valeur;
    }

    @Override
    public String toString()
    {
        return Integer.toString(valeur);
    }
}
