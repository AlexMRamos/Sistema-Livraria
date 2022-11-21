package ramos.monteiro.alex.model;

import java.util.List;

public class Album extends Produto {
	
	private String artista;
	private List<String> generos;
	private String selos;
	
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public String getSelos() {
		return selos;
	}
	public void setSelos(String selos) {
		this.selos = selos;
	}
	public Album(String nome, String artista, List<String> generos, String selos, Double preco, int id) {
		this.setNome(nome);
		this.artista = artista;
		this.generos = generos;
		this.selos = selos;
		this.setId(id);
		this.setCategoria("Album");
		this.setPreco(preco);
	}
	@Override
	public String toString() {
		return "Album [artista=" + artista + ", generos=" + generos + ", selos=" + selos + ", Nome()=" + getNome()
				+ ", Preco()=" + getPreco() + ", Categoria()=" + getCategoria() + ", Id()=" + getId() + "]";
	}
	
	
	
	
	
	

}
