package org.henrique.calculadora;

public class Recomendacao {

    /*
    Recebe como parâmetro qualquer objeto que implementa
    a interface Classificavel.
    */
    public void filtar(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        }
        else if(classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        }
        else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
