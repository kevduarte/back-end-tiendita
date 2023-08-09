package com.tienda.pedidos.models.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ClienteID")
	private int clienteId;
	
	@Column(name="Nombre")
	private String NombreC;
	
	@Column(name="App")
	private String AppC;
	
	@Column(name="Correo")
	private String CorreoC;
	
	@Column(name="RFC")
	private String RFC;
	

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombreC() {
		return NombreC;
	}

	public void setNombreC(String nombreC) {
		NombreC = nombreC;
	}

	public String getAppC() {
		return AppC;
	}

	public void setAppC(String appC) {
		AppC = appC;
	}

	public String getCorreoC() {
		return CorreoC;
	}

	public void setCorreoC(String correoC) {
		CorreoC = correoC;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}
	

}
