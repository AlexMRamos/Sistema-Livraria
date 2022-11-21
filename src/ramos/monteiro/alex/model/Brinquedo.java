package ramos.monteiro.alex.model;

public class Brinquedo extends Produto {
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipoo(String tipo) {
		this.tipo = tipo;
	}

	public Brinquedo(String nome, String tipo, Double preco, int id) {
		this.setNome(nome);
		this.tipo = tipo;
		this.setPreco(preco);
		this.setCategoria("Brinquedo");
		this.setId(id);
	}

	@Override
	public String toString() {
		return "Brinquedo [tipo=" + tipo + ", Nome()=" + getNome() + ", Preco()=" + getPreco()
				+ ", Categoria()=" + getCategoria() + ", Id()=" + getId() + "]";
	}
	
	

}
