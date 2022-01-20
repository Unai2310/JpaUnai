package es.iestetuan.uar.vo;

import java.util.Date;

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
@Table(name="T_Tren")
public class Tren {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_tren")
	private int codigoTren;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "anyo_incorporacion")
	private Date anyoIncorporacion;
	
	@Column(name = "empresa_constructora")
	private String empresaConstructora;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_linea", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_linea"))
	private Linea linea;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_cochera", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_cochera"))
	private Cochera cochera;
	
	
	public String getEmpresaConstructora() {
		return empresaConstructora;
	}
	public void setEmpresaConstructora(String empresaConstructora) {
		this.empresaConstructora = empresaConstructora;
	}
	public int getCodigoTren() {
		return codigoTren;
	}
	public void setCodigoTren(int codigoTren) {
		this.codigoTren = codigoTren;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getAnyoIncorporacion() {
		return anyoIncorporacion;
	}
	public void setAnyoIncorporacion(Date anyoIncorporacion) {
		this.anyoIncorporacion = anyoIncorporacion;
	}
	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	public Cochera getCochera() {
		return cochera;
	}
	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}
}
