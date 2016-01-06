//
// File : Operation.java 
//

class Operation implements Expression
{
    //Pattern de strategie, pour les operateurs je les separe, afin de pouvoir en rajouter.
    //Quelques constantes de classes pour simplifier l'utilisation par le client.

    public static final OperateurBinaire PLUS = new OperateurPlus();
    public static final OperateurBinaire MOINS = new OperateurMoins();
    public static final OperateurBinaire FOIS = new OperateurMultiplie();
    public static final OperateurBinaire DIVISE = new OperateurDivise();

    private Expression gauche;
    private Expression droite;
    private OperateurBinaire operateur;

    public Operation(Expression gauche, OperateurBinaire operateur, Expression droite)
    {
        //On verifie les arguments
        if (gauche == null || droite == null)
            throw new IllegalArgumentException("Expressions d'arite 2 ! ");

        this.gauche = gauche;
        this.droite = droite;
        this.operateur = operateur;
    }

    @Override
    public int getValeur()
    {
        //grace a la strategie, on n'a pas de tests a faire, c'est le bon operateur qui est appele
        return operateur.getResultat(gauche.getValeur(), droite.getValeur());
    }

    @Override
    public String toString()
    {
        return "(" + gauche + operateur.operateurToString() + droite + ")";
    }
}
