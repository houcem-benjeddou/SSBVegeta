/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3a23;

/**
 *
 * @author benje
 */
public abstract class ProduitAgricole extends ProduitAliementaire implements Critere{
    //int id;
    //String type;
    //String libelle;
    float quantite;
    String saison;

    public ProduitAgricole(float quantite, String saison, int identifiant, String libelle, String marque, float prix) {
        super(identifiant, libelle, marque, prix);
        this.quantite = quantite;
        this.saison = saison;
    }}
