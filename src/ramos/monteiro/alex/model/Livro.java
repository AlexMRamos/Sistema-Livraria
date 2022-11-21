package ramos.monteiro.alex.model;

import java.util.List;

public class Livro extends Produto {
	
	private String editora;
	private List<String> generos;
	private String escritor;
	
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public String getEscritor() {
		return escritor;
	}
	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}
	
	@Override
	public String toString() {
		return "Livro [editora=" + editora + ", generos=" + generos + ", escritor=" + escritor + ", Nome()="
				+ getNome() + ", Preco()=" + getPreco() + ", Categoria()=" + getCategoria() + ", Id()="
				+ getId() + "]";
	}
	
	public Livro(String nome,String editora, List<String> generos, String escritor, Double preco, int id) {

		this.editora = editora;
		this.generos = generos;
		this.escritor = escritor;
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.setCategoria("Livro");
	}
	public Livro() {
	}
		
	

}
