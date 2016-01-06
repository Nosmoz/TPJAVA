//
// File : OperateurBinaire.java
//

public interface OperateurBinaire
{
    int getResultat(int a, int b);

    //je ne fait pas de toString derive d'object, si un jour je veux un autre moyen de l'afficher.
    String operateurToString();
}

class OperateurPlus implements OperateurBinaire
{
    @Override
    public int getResultat(int a, int b) { return a + b; }

    @Override
    public String operateurToString() { return "+"; }
}


class OperateurMoins implements OperateurBinaire
{
    @Override
    public int getResultat(int a, int b) { return a - b; }

    @Override
    public String operateurToString() { return "-"; }
}


class OperateurDivise implements OperateurBinaire
{
    @Override
    public int getResultat(int a, int b) { return a / b; }

    @Override
    public String operateurToString() { return "/"; }
}


class OperateurMultiplie implements OperateurBinaire
{
    @Override
    public int getResultat(int a, int b) { return a * b; }

    @Override
    public String operateurToString() { return "*"; }
}