package com.tienda.pedidos.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vendedores")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="VendedorID")
	private int vendedorId;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Tienda")
	private String Tienda;
	
	@Column(name="Ip")
	private String Ip;

	public int getVendedorId() {
		return vendedorId;
	}

	public void setVendedorId(int vendedorId) {
		this.vendedorId = vendedorId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTienda() {
		return Tienda;
	}

	public void setTienda(String tienda) {
		Tienda = tienda;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}
	
}
