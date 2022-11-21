package ramos.monteiro.alex.service;

import java.util.List;

import ramos.monteiro.alex.model.Produto;
import ramos.monteiro.alex.model.Usuario;

public interface CaixaService {
	
	void gerarCaixa(Double valor);
	
	void venderProduto(List<? extends Produto> listProduto, Produto produto, Usuario usuario);
	
	void receberCaixa(Double valor);

}
