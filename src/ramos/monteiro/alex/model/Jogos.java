package ramos.monteiro.alex.model;

public class Jogos extends Produto {
	

	private String distribuidora;
	private String genero;
	private String estudio;
	
	
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public Jogos(String nome, String distribuidora, String genero, String estudio, Double preco, int id) {
		this.setNome(nome);
		this.distribuidora = distribuidora;
		this.genero = genero;
		this.estudio = estudio;
		this.setPreco(preco);
		this.setId(id);
		this.setCategoria("Jogos");
	}
	
	@Override
	public String toString() {
		return "Jogos [distribuidora=" + distribuidora + ", genero=" + genero + ", estudio=" + estudio + ", Nome()="
				+ getNome() + ", Preco()=" + getPreco() + ", Categoria()=" + getCategoria() + ", Id()="
				+ getId() + "]";
	}
	

}
