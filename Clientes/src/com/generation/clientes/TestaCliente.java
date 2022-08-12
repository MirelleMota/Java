package com.generation.clientes;

import com.generation.clientes.model.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1, "40030010090", "Luis Guerreiro", "Praia", "luis@gmail.com", 912345678);
		
		c1.visualizar();

	}

}
