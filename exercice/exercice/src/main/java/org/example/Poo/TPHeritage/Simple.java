package org.example.Poo.TPHeritage;

public class Simple extends Compte {

    public Simple(int code, float solde ) {
        super(code, solde);
    }
    public void retrait(int valeur){
        if (super.solde> -200){
        super.retrait(valeur);

        } else {
            System.out.println("vous pouvez plus retirer t a sec mec !!!");
        }
    }
    public void versement(int valeur){
        super.versement(valeur);
    }
}
