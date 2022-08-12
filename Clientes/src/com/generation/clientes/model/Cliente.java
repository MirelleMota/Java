package com.generation.clientes.model;

public class Cliente {

	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	public Cliente(int id, String cpf, String nome, String endereco, String email, int telefone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar()
	{
		System.out.println("\nCódigo do cliente" + id);
		System.out.println("CPF do cliente" + cpf);
		System.out.println("Nome do cliente" + nome);
		System.out.println("Endereço do cliente" + endereco);
		System.out.println("Email do cliente" + email);
		System.out.println("Email do cliente" + telefone);
	}
}
