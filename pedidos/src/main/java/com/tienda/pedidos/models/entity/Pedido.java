package com.tienda.pedidos.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PedidoID")
	private int pedidoID;
	
	@Column(name="Fecha")
	private Date fechaPedido;
	
	@Column(name="Status")
	private String Status;
	
	@ManyToOne
	@JoinColumn(name = "Idcliente")
	Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "Idvendedor")
	Vendedor vendedor;
	
	@ManyToOne
	@JoinColumn(name = "Idcamioneta")
	Camioneta camioneta;
	
	

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Pedido(int pedidoID, Date fechaPedido, String status, Cliente cliente, Vendedor vendedor,
			Camioneta camioneta) {
		super();
		this.pedidoID = pedidoID;
		this.fechaPedido = fechaPedido;
		Status = status;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.camioneta = camioneta;
	}



	public int getPedidoID() {
		return pedidoID;
	}

	public void setPedidoID(int pedidoID) {
		this.pedidoID = pedidoID;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Camioneta getCamioneta() {
		return camioneta;
	}

	public void setCamioneta(Camioneta camioneta) {
		this.camioneta = camioneta;
	}



	@Override
	public String toString() {
		return "Pedido [pedidoID=" + pedidoID + ", fechaPedido=" + fechaPedido + ", Status=" + Status + ", cliente="
				+ cliente + ", vendedor=" + vendedor + ", camioneta=" + camioneta + "]";
	}
	
	
}
