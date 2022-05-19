package com.jose.tienda.model;

import java.util.Date;
import java.util.Objects;

public class Pedido {
	
	private long id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private float total;
	
	public Pedido() {}

	public Pedido(String numero, Date fechaCreacion, Date fechaRecibida, float total) {
		super();
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, fechaRecibida, id, numero, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(fechaRecibida, other.fechaRecibida)
				&& id == other.id && Objects.equals(numero, other.numero)
				&& Float.floatToIntBits(total) == Float.floatToIntBits(other.total);
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}

}
