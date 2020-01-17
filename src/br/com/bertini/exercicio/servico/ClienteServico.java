package br.com.bertini.exercicio.servico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.com.bertini.exercicio.dominio.Cliente;

public class ClienteServico {

	public List<Cliente> buscarClientePorIdadeExata (List<Cliente> listaCliente, Integer idade) {
		
		List<Cliente> listaClienteFiltrada = new ArrayList<>();
		
		for (Cliente cliente : listaCliente) {
			if (cliente != null && idade != null && cliente.getIdade().intValue() == idade.intValue()) {
				listaClienteFiltrada.add(cliente);
			}
		}
		
		return listaClienteFiltrada;
	}
	
	public List<Cliente> buscarClientePorMaioridade (List<Cliente> listaCliente, boolean maiorIdade) {
		
		List<Cliente> listaClienteFiltrada = new ArrayList<>();
		
		for (Cliente cliente : listaCliente) {
			if (cliente != null) {
				
				if (maiorIdade && cliente.getIdade().intValue() >= 18) {
					listaClienteFiltrada.add(cliente);
				} else if (!maiorIdade && cliente.getIdade().intValue() < 18) {
					listaClienteFiltrada.add(cliente);
				}
			}
		}
		
		return listaClienteFiltrada;
	}
	
	public List<Cliente> buscarClientePorProfissao (List<Cliente> listaCliente, String profissao) {
		
		List<Cliente> listaClienteFiltrada = new ArrayList<>();
		
		for (Cliente cliente : listaCliente) {
			if (cliente != null && profissao.equalsIgnoreCase(cliente.getProfissao())) {
				listaClienteFiltrada.add(cliente);
			}
		}
		
		return listaClienteFiltrada;
	}

	
	public List<Cliente> buscarClientePorProfissao (List<Cliente> listaCliente, List<String> listaProfissao) {
		
		List<Cliente> listaClienteFiltrada = new ArrayList<>();
		
		if (listaProfissao != null && !listaProfissao.isEmpty()) {
			for (Cliente cliente : listaCliente) {
				
				if (cliente != null && listaProfissao.contains(cliente.getProfissao())) {
					listaClienteFiltrada.add(cliente);
				}
			}
		}
		
		return listaClienteFiltrada;
	}
	
	
	public void imprimirListaCliente (String mensagemIformativa, List<Cliente> listaCliente) {
		
		System.out.println(mensagemIformativa);
		System.out.println("----------------------------------------------------");
		
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente);
		}
		
		System.out.println("----------------------------------------------------");

	}
}
