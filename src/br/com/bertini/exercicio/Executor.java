package br.com.bertini.exercicio;

import java.util.ArrayList;
import java.util.List;

import br.com.bertini.exercicio.dominio.Cliente;
import br.com.bertini.exercicio.servico.ClienteServico;

public class Executor {

	public static void main(String[] args) {

		List<Cliente> listaCliente = new ArrayList<>();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Vera");
		cliente1.setIdade(59);
		cliente1.setProfissao("Professora");
		listaCliente.add(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Marcos");
		cliente2.setIdade(36);
		cliente2.setProfissao("Advogado");
		listaCliente.add(cliente2);
		
		Cliente cliente3= new Cliente();
		cliente3.setNome("João");
		cliente3.setIdade(18);
		cliente3.setProfissao("Estagiario");
		listaCliente.add(cliente3);
		
		Cliente cliente4 = new Cliente();
		cliente4.setNome("Ana");
		cliente4.setIdade(15);
		cliente4.setProfissao("Estudante");
		listaCliente.add(cliente4);
		
		Cliente cliente5 = new Cliente();
		cliente5.setNome("Carlos");
		cliente5.setIdade(37);
		cliente5.setProfissao("Desenvolvedor");

		listaCliente.add(cliente5);
		
		ClienteServico clienteServico = new ClienteServico();
		List<Cliente> listaCliente18Anos = clienteServico.buscarClientePorIdadeExata(listaCliente, 18);
		clienteServico.imprimirListaCliente("Clientes com 18 anos", listaCliente18Anos);

		List<Cliente> listaClienteMaior18Anos = clienteServico.buscarClientePorMaioridade(listaCliente, true);
		clienteServico.imprimirListaCliente("Cliente com mais de 18 anos", listaClienteMaior18Anos);

		List<Cliente> listaClienteMenor18Anos = clienteServico.buscarClientePorMaioridade(listaCliente, false);
		clienteServico.imprimirListaCliente("Cliente com menos de 18 anos", listaClienteMenor18Anos);
		
		List<Cliente> listaClienteProfissaoExato = clienteServico.buscarClientePorProfissao(listaCliente, "Professora");
		clienteServico.imprimirListaCliente("Cliente com profissao exata", listaClienteProfissaoExato);

		List<String> listaProfissao = new ArrayList<>();
		listaProfissao.add("Desenvolvedor");
		listaProfissao.add("Advogado");
		
		List<Cliente> listaClienteListaProfissao = clienteServico.buscarClientePorProfissao(listaCliente, listaProfissao);
		clienteServico.imprimirListaCliente("Cliente com profissoes fornecidas", listaClienteListaProfissao);
		
	}

}
