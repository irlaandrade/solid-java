package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

//Aplicando o principio Interface Segregation Principle
public interface Reajuste {
    BigDecimal valor();
    LocalDate data();
}
