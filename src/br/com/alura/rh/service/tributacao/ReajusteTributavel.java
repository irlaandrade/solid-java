package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;

//Aplicando o principio Interface Segregation Principle
public interface ReajusteTributavel extends Reajuste {
    BigDecimal valorImpostoDeRenda();
}
