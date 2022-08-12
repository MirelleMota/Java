package com.generation.aviao.model;

public class Aviao {
	
	private int id;
	private String marca;
	private int modelo;
	private String empresa;
	private int assentos;
	
	public Aviao(int id, String marca, int modelo, String empresa, int assentos) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.empresa = empresa;
		this.assentos = assentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public void visualizar()
	{
		System.out.println("\nCódigo do avião: " + id);
		System.out.println("Marca do avião: " + marca);
		System.out.println("Modelo do avião: " + modelo);
		System.out.println("Empresa aérea compradora: " + empresa);
		System.out.println("Quantidade de assentos:  " + assentos);
		
	}

	
	
	
	
}
