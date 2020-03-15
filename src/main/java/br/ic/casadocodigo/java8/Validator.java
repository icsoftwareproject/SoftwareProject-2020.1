package br.ic.casadocodigo.java8;

@FunctionalInterface
interface Validador<T> {
	
	boolean valida(T t);
}