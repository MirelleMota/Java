package com.generation.pacientes;

import com.generation.pacientes.model.pacientes;

public class TestePaciente {

	public static void main(String[] args) {
		
		pacientes P1 = new pacientes("Luiza Monteiro", 32, "Rua Florida,10" , "Endocrinologista", "SulAmerica");
		
		P1.visualizar();

	}

}
