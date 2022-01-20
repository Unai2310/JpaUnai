package es.iestetuan.uar.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="T_Acceso")
public class Acceso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_acceso")
	private int codigoAcceso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "tiene_acceso_discapacidad")
	private boolean tieneAccesoDiscapacidad;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_estacion", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_estacion"))
	private Estacion estacion;
	
	
	public int getCodigoAcceso() {
		return codigoAcceso;
	}
	public void setCodigoAcceso(int codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isTieneAccesoDiscapacidad() {
		return tieneAccesoDiscapacidad;
	}
	public void setTieneAccesoDiscapacidad(boolean tieneAccesoDiscapacidad) {
		this.tieneAccesoDiscapacidad = tieneAccesoDiscapacidad;
	}
	public Estacion getEstacion() {
		return estacion;
	}
	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
}
