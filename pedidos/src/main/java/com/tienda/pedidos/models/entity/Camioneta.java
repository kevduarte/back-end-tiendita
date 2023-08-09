package com.tienda.pedidos.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Camionetas")
public class Camioneta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CamionetaID")
	private int camionetaId;
	
	@Column(name="Hawa")
	private String hawa;
	
	@Column(name="Marca")
	private String Marca;
	
	@Column(name="Precio")
	private String PrecioLista;
	
	@Column(name="Descuento")
	private String Descuento;
	
	@Column(name="Existencia")
	private int Existencia;
	

	public int getCamionetaId() {
		return camionetaId;
	}

	public void setCamionetaId(int camionetaId) {
		this.camionetaId = camionetaId;
	}

	public String getHawa() {
		return hawa;
	}

	public void setHawa(String hawa) {
		this.hawa = hawa;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getPrecioLista() {
		return PrecioLista;
	}

	public void setPrecioLista(String precioLista) {
		PrecioLista = precioLista;
	}

	public String getDescuento() {
		return Descuento;
	}

	public void setDescuento(String descuento) {
		Descuento = descuento;
	}

	public int getExistencia() {
		return Existencia;
	}

	public void setExistencia(int existencia) {
		Existencia = existencia;
	}
	

}
