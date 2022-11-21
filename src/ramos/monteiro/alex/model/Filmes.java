package ramos.monteiro.alex.model;

import java.util.List;

public class Filmes extends Produto {
	
	private String estudio;
	private List<String> diretores;
	private List<String> generos;
	private List<String>  produtores;
	
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public List<String> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<String> diretores) {
		this.diretores = diretores;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public List<String> getProdutores() {
		return produtores;
	}
	public void setProdutores(List<String> produtores) {
		this.produtores = produtores;
	}
	public Filmes(String nome, String estudio, List<String> diretores, List<String> generos, List<String> produtores, Double preco, int id, Boolean indicador) {
		this.setNome(nome);
		this.estudio = estudio;
		this.diretores = diretores;
		this.generos = generos;
		this.produtores = produtores;
		this.setPreco(preco);
		this.setId(id);
		this.setCategoria("Filme");
		this.setIndicador(indicador);
	}
	
	@Override
	public String toString() {
		return "Filmes [estudio=" + estudio + ", diretores=" + diretores + ", generos=" + generos + ", produtores="
				+ produtores + ", Nome()=" + getNome() + ", Preco()=" + getPreco() + ", Categoria()="
				+ getCategoria() + ", Id()=" + getId() + "]";
	}
	
	
	
	
	
	

}
