package br.ic.casadocodigo.livro_00.livraria.produtos;
public interface Promocional {

	boolean aplicaDescontoDe(double porcentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}