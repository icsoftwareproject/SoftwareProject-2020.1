package br.ic.orientacao_objetos.aula10;


public interface Persistence<T> {
	void save();
	void remove();
	Product find();
}
