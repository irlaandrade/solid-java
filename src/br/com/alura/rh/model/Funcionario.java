package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

//Aplicado o Single Responsibility Principle (SOLID)
/*Quando aplicamos esse princípio da responsabilidade única, estamos focando em manter uma alta
coesão no nosso código, estamos pensando em deixar as classes pequenas, enxutas e deixá-las
com bastante coesão para que assim elas tenham realmente um único motivo para mudar.
Então eu consigo sempre que for fazer uma alteração no meu projeto, mexer em um único ponto do sistema.*/

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		//this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}
	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}
}
