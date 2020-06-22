package br.com.lanches.lanches.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ValorIngredientes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "ID dos valores dos ingredientes no banco")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ApiModelProperty(value = "Alface")
	private double alface;
	@ApiModelProperty(value = "Bacon")
	private double bacon;
	@ApiModelProperty(value = "Hamburger")
	private double hamburguer;
	@ApiModelProperty(value = "OVO")
	private double ovo;
	@ApiModelProperty(value = "Queijo")
	private double queijo;

	public ValorIngredientes() {

	}

	public ValorIngredientes(double alface, double bacon, double hamburguer, double ovo, double queijo) {
		this.alface = alface;
		this.bacon = bacon;
		this.hamburguer = hamburguer;
		this.ovo = ovo;
		this.queijo = queijo;
	}

	public double getAlface() {
		return alface;
	}

	public void setAlface(double alface) {
		this.alface = alface;
	}

	public double getBacon() {
		return bacon;
	}

	public void setBacon(double bacon) {
		this.bacon = bacon;
	}

	public double getHamburguer() {
		return hamburguer;
	}

	public void setHamburguer(double hamburguer) {
		this.hamburguer = hamburguer;
	}

	public double getOvo() {
		return ovo;
	}

	public void setOvo(double ovo) {
		this.ovo = ovo;
	}

	public double getQueijo() {
		return queijo;
	}

	public void setQueijo(double queijo) {
		this.queijo = queijo;
	}

	@Override
	public String toString() {
		return "Ingredientes [alface=" + alface + ", bacon=" + bacon + ", hamburguer=" + hamburguer + ", ovo=" + ovo
				+ ", queijo=" + queijo + "]";
	}

	public Long getId() {
		
		return id;
	}

}
