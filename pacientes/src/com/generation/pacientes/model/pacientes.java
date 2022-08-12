package com.generation.pacientes.model;

public class pacientes {
	
	private String nome;
	private int idade;
	private String endereco;
	private String especialidade;
	private String convenio;
	
	public pacientes(String nome, int idade, String endereco, String especialidade, String convenio) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.especialidade = especialidade;
		this.convenio = convenio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	public void visualizar()
	{
		System.out.println("\nNome do paciente: " + nome);
		System.out.println("Idade do paciente: " + idade);
		System.out.println("Endereço do paciente: " + endereco);
		System.out.println("Especialidade : " + especialidade);
		System.out.println("Convênio do paciente: " + convenio);
	}
	
	
	
	
}
