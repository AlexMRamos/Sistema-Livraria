package ramos.monteiro.alex.service;

import java.util.LinkedList;
import java.util.List;

import ramos.monteiro.alex.model.Album;
import ramos.monteiro.alex.model.Brinquedo;
import ramos.monteiro.alex.model.Filmes;
import ramos.monteiro.alex.model.Jogos;
import ramos.monteiro.alex.model.Livro;
import ramos.monteiro.alex.model.Loja;
import ramos.monteiro.alex.model.Produto;

public class LojaServiceImpl implements LojaService {

	@Override
	public List<Livro> adicionaLivros(Livro... livros) {
		List<Livro> listLivro = new LinkedList<>();
		for (int i = 0; i < livros.length; i++)  {
			listLivro.add(livros[i]);
		  }
		return listLivro;
	}

	@Override
	public List<Jogos> adicionaJogos(Jogos... jogos) {
		List<Jogos> listJogos = new LinkedList<>();
		for (int i = 0; i < jogos.length; i++)  {
			listJogos.add(jogos[i]);
		  }
		return listJogos;
	}

	@Override
	public List<Filmes> adicionaFilmes(Filmes... filmes) {
		List<Filmes> listFilmes = new LinkedList<>();
		for (int i = 0; i < filmes.length; i++)  {
			listFilmes.add(filmes[i]);
		  }
		return listFilmes;
	}

	@Override
	public List<Brinquedo> adicionaBrinquedos(Brinquedo... brinquedos) {
		List<Brinquedo> listBrinquedos = new LinkedList<>();
		for (int i = 0; i < brinquedos.length; i++)  {
			listBrinquedos.add(brinquedos[i]);
		  }
		return listBrinquedos;
	}

	@Override
	public List<Album> adicionaAlbuns(Album... albuns) {
		List<Album> listAlbuns = new LinkedList<>();
		for (int i = 0; i < albuns.length; i++)  {
			listAlbuns.add(albuns[i]);
		  }
		return listAlbuns;
	}

	@Override
	public void listarProduto(List<? extends Produto> produtos) {		
		System.out.println(produtos.toString());
		
	}

	@Override
	public void quantidadeProduto(List<? extends Produto> produtos) {
		
		System.out.println("Produto: " + produtos.get(0).getCategoria());
		System.out.println("Quantidade: " + produtos.size());
		
	}

	@Override
	public void removeProduto(List<? extends Produto> produtos, Produto produto) {	
		produtos.remove(produto);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public void listarTodosProduto(List<? extends Produto>... produtos) {
		for (int i = 0; i < produtos.length; i++)  {
			this.listarProduto(produtos[i]);
		  }	
		
	}




}
