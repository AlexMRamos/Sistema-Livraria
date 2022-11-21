package ramos.monteiro.alex.service;

import java.util.List;

import ramos.monteiro.alex.model.Produto;

public interface CaixaService {
	
	void gerarCaixa(Double valor);
	
	void venderProduto(List<? extends Produto> listProduto, Produto produto);
	
	void receberCaixa(Double valor);

}
