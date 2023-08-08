package org.henrique.calculadora;

import org.henrique.model.Tituto;

public class CalculadoraDeTempo {

    private double tempoTotal;

    public double getTempoTotal() {
        return tempoTotal/60;
    }

    public void incluiTitulo(Tituto tituto) {
        tempoTotal += tituto.getDuracaoMinutos();
    }
}
