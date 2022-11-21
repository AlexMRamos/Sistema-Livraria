package ramos.monteiro.alex.service;

import java.util.List;

import ramos.monteiro.alex.model.Livro;
import ramos.monteiro.alex.model.Produto;
import ramos.monteiro.alex.model.Usuario;
import ramos.monteiro.alex.utils.Utils;

public class CaixaServiceImpl implements CaixaService {

	private static Double caixa = 0.0;

	LojaServiceImpl lojaServiceImpl = new LojaServiceImpl();

	@Override
	public void gerarCaixa(Double valor) {
		CaixaServiceImpl.caixa += valor;
	}

	//TODO: ajustar caso nao exista mais o produto. Por hora eu cobro e nao entrego Rs rs rs.
	@Override
	public void venderProduto(List<? extends Produto> listProduto, Produto produto, Usuario usuario) {

		if (!produto.getIndicador()) {

			this.calculaDesconto(produto);
			this.receberCaixa(produto.getPreco());
			this.lojaServiceImpl.removeProduto(listProduto, produto);

		} else {
			if (Utils.calculaIdade(usuario.getDataNascimento())) {
				this.calculaDesconto(produto);
				this.receberCaixa(produto.getPreco());
				this.lojaServiceImpl.removeProduto(listProduto, produto);
			}else {
				System.out.println("Produto: " + produto.getNome() + " destinado a Maiores de 18 anos");
			}
		}
	}

	@Override
	public void receberCaixa(Double valor) {
		CaixaServiceImpl.caixa += valor;
	}

	public static Double getCaixa() {
		return caixa;
	}

	private void calculaDesconto(Produto produto) {
		if (produto.getClass().equals(Livro.class)) {
			produto.setPreco(produto.getPreco() * 0.85);
		}

	}

}
