package br.ic.casadocodigo.livro_00.livraria.testes;
import java.util.List;

import br.ic.casadocodigo.livro_00.livraria.Autor;
import br.ic.casadocodigo.livro_00.livraria.CarrinhoDeCompras;
import br.ic.casadocodigo.livro_00.livraria.produtos.Ebook;
import br.ic.casadocodigo.livro_00.livraria.produtos.LivroFisico;
import br.ic.casadocodigo.livro_00.livraria.produtos.Produto;


public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + fisico.getValor());
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

}
