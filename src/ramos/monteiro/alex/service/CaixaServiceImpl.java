package ramos.monteiro.alex.service;

import java.util.List;

import ramos.monteiro.alex.model.Produto;

public class CaixaServiceImpl implements CaixaService {
	
	private static Double  caixa = 0.0;
	
	LojaServiceImpl lojaServiceImpl = new LojaServiceImpl();

	@Override
	public void gerarCaixa(Double valor) {
		CaixaServiceImpl.caixa += valor;
	}

	@Override
	public void venderProduto(List<? extends Produto>listProduto, Produto produto) {
		this.receberCaixa(produto.getPreco());
		this.lojaServiceImpl.removeProduto(listProduto, produto);	
	}

	@Override
	public void receberCaixa(Double valor) {
		CaixaServiceImpl.caixa += valor;
	}

	public static Double getCaixa() {
		return caixa;
	}

}
