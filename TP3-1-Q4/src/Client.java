//
// File : Client.java
//

public class Client
{
    public static ArbreBinaire<String> feuille(String mot)
    {
        return new ArbreBinaire<String>(null, mot, null);
    }

    public static ArbreBinaire<String> noeudInterne(ArbreBinaire fG, String mot, ArbreBinaire fD)
    {
        return new ArbreBinaire<String>(fG, mot, fD);
    }

    public static void main(String[] args)
    {
        //Le nom des feuilles prend le chemin, histoire de comprendre mieux
        ArbreBinaire<String> fD = feuille("Droite");
        ArbreBinaire<String> fGG = feuille("Gauche Gauche");
        ArbreBinaire<String> fGDD = feuille("Gauche Droite Droite");
        ArbreBinaire<String> fGD = noeudInterne(null, "Gauche Droite", fGDD);
        ArbreBinaire<String> fG = noeudInterne(fGG, "Gauche", fGD);
        ArbreBinaire<String> racine = noeudInterne(fG, "Racine", fD);

        for (ArbreBinaire<String> arbre : racine)
            System.out.println(arbre.getDonnee());
    }
}