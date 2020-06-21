package br.com.lanches.lanches.dto;

public class PedidoDTO {
	private IngredientesDTO ingredientes;
	private int xbancon;
	private int xburguer;
	private int xegg;
	private int xeggbacon;

	public PedidoDTO() {

	}

	public PedidoDTO(IngredientesDTO ingredientes, int xbancon, int xburguer, int xegg, int xeggbacon) {
		super();
		this.ingredientes = ingredientes;
		this.xbancon = xbancon;
		this.xburguer = xburguer;
		this.xegg = xegg;
		this.xeggbacon = xeggbacon;
	}

	public IngredientesDTO getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(IngredientesDTO ingredientes) {
		this.ingredientes = ingredientes;
	}

	public int getXbancon() {
		return xbancon;
	}

	public void setXbancon(int xbancon) {
		this.xbancon = xbancon;
	}

	public int getXburguer() {
		return xburguer;
	}

	public void setXburguer(int xburguer) {
		this.xburguer = xburguer;
	}

	public int getXegg() {
		return xegg;
	}

	public void setXegg(int xegg) {
		this.xegg = xegg;
	}

	public int getXeggbacon() {
		return xeggbacon;
	}

	public void setXeggbacon(int xeggbacon) {
		this.xeggbacon = xeggbacon;
	}

}
