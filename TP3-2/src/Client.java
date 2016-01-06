//
// File : Client.java 
//

public class Client
{
    public static void afficher(Expression expression)
    {
        System.out.println(expression + " = " + expression.getValeur());
    }

    public static void main(String[] args)
    {
        Expression expression = new Feuille(1);
        afficher(expression);
        //res : 1 = 1

        expression = new Operation(new Feuille(2), Operation.PLUS, new Feuille(3));
        afficher(expression);
        //res : (2+3) = 5
        //Comme l'exemple 1
        Expression gauche = new Operation(new Feuille(2), Operation.MOINS, new Feuille(3));
        Expression droite = new Feuille(5);
        expression = new Operation(gauche, Operation.FOIS, droite);
        afficher(expression);
        //res : ((2-3)*5) = -5

        //Comme l'exemple 2
        gauche = new Operation(new Feuille(2), Operation.FOIS, new Feuille(3));
        droite = new Feuille(5);
        expression = new Operation(gauche, Operation.PLUS, droite);
        afficher(expression);
        //res : ((2*3)+5) = 11

        //Autre test
        Expression gaucheGaucheGauche = new Operation(new Feuille(2), Operation.PLUS, new Feuille(3));
        Expression gaucheGauche = new Operation(gaucheGaucheGauche, Operation.PLUS, new Feuille(4));
        gauche = new Operation(gaucheGauche, Operation.MOINS, new Feuille(0));
        droite = new Feuille(3);
        expression = new Operation(gauche, Operation.DIVISE, droite);
        afficher(expression);
        //res : ((((2+3)+4)-0)/3) = 3
    }
}
