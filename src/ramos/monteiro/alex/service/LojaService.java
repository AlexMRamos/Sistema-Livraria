package ramos.monteiro.alex.service;

import java.util.List;

import ramos.monteiro.alex.model.Album;
import ramos.monteiro.alex.model.Brinquedo;
import ramos.monteiro.alex.model.Filmes;
import ramos.monteiro.alex.model.Jogos;
import ramos.monteiro.alex.model.Livro;
import ramos.monteiro.alex.model.Produto;

public interface LojaService {
	
	List<Livro> adicionaLivros(Livro... livros);
	List<Jogos> adicionaJogos(Jogos... jogos);
	List<Filmes> adicionaFilmes(Filmes... filmes);
	List<Brinquedo> adicionaBrinquedos(Brinquedo... brinquedos);
	List<Album> adicionaAlbuns(Album... albuns);
	
	void listarProduto(List<? extends Produto> produtos);
	
	@SuppressWarnings("unchecked")
	void listarTodosProduto(List<? extends Produto>... produtos);
	
//	void listarCategoriaProduto(List<Produto> produtos, String categoria);
	
	void quantidadeProduto(List<? extends Produto> produtos);
	
	void removeProduto(List<? extends Produto> produtos, Produto produto);
	


}
