package br.com.lanches.lanches.dto;

public class IngredientesDTO {
	private int alface;
	private int bacon;
	private int hamburguer;
	private int ovo;
	private int queijo;

	public IngredientesDTO() {
	}

	public IngredientesDTO(int alface, int bacon, int hamburguer, int ovo, int queijo) {
		this.alface = alface;
		this.bacon = bacon;
		this.hamburguer = hamburguer;
		this.ovo = ovo;
		this.queijo = queijo;
	}

	public int getAlface() {
		return alface;
	}

	public void setAlface(int alface) {
		this.alface = alface;
	}

	public int getBacon() {
		return bacon;
	}

	public void setBacon(int bacon) {
		this.bacon = bacon;
	}

	public int getHamburguer() {
		return hamburguer;
	}

	public void setHamburguer(int hamburguer) {
		this.hamburguer = hamburguer;
	}

	public int getOvo() {
		return ovo;
	}

	public void setOvo(int ovo) {
		this.ovo = ovo;
	}

	public int getQueijo() {
		return queijo;
	}

	public void setQueijo(int queijo) {
		this.queijo = queijo;
	}

	@Override
	public String toString() {
		return "Ingredientes [alface=" + alface + ", bacon=" + bacon + ", hamburguer=" + hamburguer + ", ovo=" + ovo
				+ ", queijo=" + queijo + "]";
	}

}
