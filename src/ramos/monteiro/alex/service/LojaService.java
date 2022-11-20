package ramos.monteiro.alex.service;

import ramos.monteiro.alex.model.Album;
import ramos.monteiro.alex.model.Brinquedo;
import ramos.monteiro.alex.model.Filmes;
import ramos.monteiro.alex.model.Jogos;
import ramos.monteiro.alex.model.Livro;
import ramos.monteiro.alex.model.Produto;

public interface LojaService {
	
	Livro criarlivro(Livro livro);
	Jogos criarJogos(Jogos jogo);
	Filmes criarFilmes(Filmes filme);
	Brinquedo criarBrinquedo(Brinquedo brinquedo);
	Album criarAlbum(Album album);
	
	void comprarProduto(Produto produto);
	void removerProduto(Produto produto);
	void alterarProduto(Produto produto);

}
