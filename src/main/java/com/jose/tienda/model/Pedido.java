package com.jose.tienda.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private float total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "pedido")
	private DetallePedido detalle;
	
	public Pedido() {}

	public Pedido(String numero, Date fechaCreacion, Date fechaRecibida, float total) {
		super();
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	public Pedido(long id, String numero, Date fechaCreacion, Date fechaRecibida, float total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

	public Pedido(long id, String numero, Date fechaCreacion, Date fechaRecibida, float total, Usuario usuario) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(detalle, fechaCreacion, fechaRecibida, id, numero, total, usuario);
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
		return Objects.equals(detalle, other.detalle) && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(fechaRecibida, other.fechaRecibida) && id == other.id
				&& Objects.equals(numero, other.numero)
				&& Float.floatToIntBits(total) == Float.floatToIntBits(other.total)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + ", usuario=" + usuario + ", detalle=" + detalle + "]";
	}

}
