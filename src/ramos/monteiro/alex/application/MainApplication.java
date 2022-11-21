package ramos.monteiro.alex.application;

import java.util.LinkedList;
import java.util.List;

import ramos.monteiro.alex.model.Album;
import ramos.monteiro.alex.model.Brinquedo;
import ramos.monteiro.alex.model.Filmes;
import ramos.monteiro.alex.model.Jogos;
import ramos.monteiro.alex.model.Livro;

public class MainApplication {

	public static void main(String[] args) {
		
		//livros
		Livro livro1 = new Livro("Novos Tempos","Abril", List.of("auto ajuda","adulto"), "George", 29.9, 1);
		Livro livro2 = new Livro("Mochileiro","Veja", List.of("aventura", "drama"), "Nilton", 59.9, 2);
		Livro livro3 = new Livro("Java", "Exame", List.of("software"), "Alex", 119.9, 3);
		
		
		//Jogos
		Jogos jogo1 = new Jogos("GTA SA", "Submarino", "ação", "Rockstat North", 59.9, 1);
		Jogos jogo2 = new Jogos("GTA IV", "Americanas", "ação", "Rockstat", 89.9, 2);
		Jogos jogo3 = new Jogos("GTA V", "Kabum", "ação", "Rockstat", 169.9, 3);
		
		//Filmes
		Filmes filme1 = new Filmes("Homem-aranha", "Sony", List.of("james", "Marcos"), List.of("Ação", "aventura"), List.of("prod1"), 79.9, 1);
		Filmes filme2 = new Filmes("Batman", "Warner", List.of("Jhon", "Nicole"), List.of("Ação", "aventura"), List.of("prod2"), 39.9, 2);
		Filmes filme3 = new Filmes("Zumbilandia", "Sony", List.of("james", "Marcos"), List.of("comedia", "aventura"), List.of("prod3"), 45.9, 3);
		
		//Brinquedos
		Brinquedo brinquedo1 = new Brinquedo("MaxStell", "articulado", 99.9, 1);
		Brinquedo brinquedo2 = new Brinquedo("Lego", "quebra-cabeça", 299.9, 2);
		Brinquedo brinquedo3 = new Brinquedo("Funko", "colecionavel", 199.9, 3);
		
		//Album
		
		Album album1 = new Album("agua da minha sede", "Zeca Pagodinho", List.of("Samba", "Pagode"), "e1", 25.9, 1);
		Album album2 = new Album("Brasil de quem", "Sid", List.of("Trap", "Rap", "Hip-Hop"), "e2", 75.9, 2);
		Album album3 = new Album("Penitencia", "LetoDie", List.of("Trap", "Rap"), "e3", 45.9, 3);
		
		
		
		
		
	}

}
