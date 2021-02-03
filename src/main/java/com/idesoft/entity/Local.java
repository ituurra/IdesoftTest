package com.idesoft.entity;

import java.io.Serializable;

public class Local implements Serializable {


	private static final long serialVersionUID = 3450593973253483496L;
	private String fecha;
	private String local_id;
	private String local_nombre;
	private String comuna_nombre;
	private String localidad_nombre;
	private String local_direccion;
	private String funcionamiento_hora_apertura;
	private String funcionamiento_hora_cierre;
	private String local_telefono;
	private String local_lat;
	private String local_lng;
	private String funcionamiento_dia;
	private String fk_region;
	private String fk_comuna;
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getLocal_id() {
		return local_id;
	}
	public void setLocal_id(String local_id) {
		this.local_id = local_id;
	}
	public String getLocal_nombre() {
		return local_nombre;
	}
	public void setLocal_nombre(String local_nombre) {
		this.local_nombre = local_nombre;
	}
	public String getComuna_nombre() {
		return comuna_nombre;
	}
	public void setComuna_nombre(String comuna_nombre) {
		this.comuna_nombre = comuna_nombre;
	}
	public String getLocalidad_nombre() {
		return localidad_nombre;
	}
	public void setLocalidad_nombre(String localidad_nombre) {
		this.localidad_nombre = localidad_nombre;
	}
	public String getLocal_direccion() {
		return local_direccion;
	}
	public void setLocal_direccion(String local_direccion) {
		this.local_direccion = local_direccion;
	}
	public String getFuncionamiento_hora_apertura() {
		return funcionamiento_hora_apertura;
	}
	public void setFuncionamiento_hora_apertura(String funcionamiento_hora_apertura) {
		this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
	}
	public String getFuncionamiento_hora_cierre() {
		return funcionamiento_hora_cierre;
	}
	public void setFuncionamiento_hora_cierre(String funcionamiento_hora_cierre) {
		this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
	}
	public String getLocal_telefono() {
		return local_telefono;
	}
	public void setLocal_telefono(String local_telefono) {
		this.local_telefono = local_telefono;
	}
	public String getLocal_lat() {
		return local_lat;
	}
	public void setLocal_lat(String local_lat) {
		this.local_lat = local_lat;
	}
	public String getLocal_lng() {
		return local_lng;
	}
	public void setLocal_lng(String local_lng) {
		this.local_lng = local_lng;
	}
	public String getFuncionamiento_dia() {
		return funcionamiento_dia;
	}
	public void setFuncionamiento_dia(String funcionamiento_dia) {
		this.funcionamiento_dia = funcionamiento_dia;
	}
	public String getFk_region() {
		return fk_region;
	}
	public void setFk_region(String fk_region) {
		this.fk_region = fk_region;
	}
	public String getFk_comuna() {
		return fk_comuna;
	}
	public void setFk_comuna(String fk_comuna) {
		this.fk_comuna = fk_comuna;
	}
	
	@Override
	public String toString() {
		return "Local [fecha=" + fecha + ", local_id=" + local_id + ", local_nombre=" + local_nombre
				+ ", comuna_nombre=" + comuna_nombre + ", localidad_nombre=" + localidad_nombre + ", local_direccion="
				+ local_direccion + ", funcionamiento_hora_apertura=" + funcionamiento_hora_apertura
				+ ", funcionamiento_hora_cierre=" + funcionamiento_hora_cierre + ", local_telefono=" + local_telefono
				+ ", local_lat=" + local_lat + ", local_lng=" + local_lng + ", funcionamiento_dia=" + funcionamiento_dia
				+ ", fk_region=" + fk_region + ", fk_comuna=" + fk_comuna + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comuna_nombre == null) ? 0 : comuna_nombre.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((fk_comuna == null) ? 0 : fk_comuna.hashCode());
		result = prime * result + ((fk_region == null) ? 0 : fk_region.hashCode());
		result = prime * result + ((funcionamiento_dia == null) ? 0 : funcionamiento_dia.hashCode());
		result = prime * result
				+ ((funcionamiento_hora_apertura == null) ? 0 : funcionamiento_hora_apertura.hashCode());
		result = prime * result + ((funcionamiento_hora_cierre == null) ? 0 : funcionamiento_hora_cierre.hashCode());
		result = prime * result + ((local_direccion == null) ? 0 : local_direccion.hashCode());
		result = prime * result + ((local_id == null) ? 0 : local_id.hashCode());
		result = prime * result + ((local_lat == null) ? 0 : local_lat.hashCode());
		result = prime * result + ((local_lng == null) ? 0 : local_lng.hashCode());
		result = prime * result + ((local_nombre == null) ? 0 : local_nombre.hashCode());
		result = prime * result + ((local_telefono == null) ? 0 : local_telefono.hashCode());
		result = prime * result + ((localidad_nombre == null) ? 0 : localidad_nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Local other = (Local) obj;
		if (comuna_nombre == null) {
			if (other.comuna_nombre != null)
				return false;
		} else if (!comuna_nombre.equals(other.comuna_nombre))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (fk_comuna == null) {
			if (other.fk_comuna != null)
				return false;
		} else if (!fk_comuna.equals(other.fk_comuna))
			return false;
		if (fk_region == null) {
			if (other.fk_region != null)
				return false;
		} else if (!fk_region.equals(other.fk_region))
			return false;
		if (funcionamiento_dia == null) {
			if (other.funcionamiento_dia != null)
				return false;
		} else if (!funcionamiento_dia.equals(other.funcionamiento_dia))
			return false;
		if (funcionamiento_hora_apertura == null) {
			if (other.funcionamiento_hora_apertura != null)
				return false;
		} else if (!funcionamiento_hora_apertura.equals(other.funcionamiento_hora_apertura))
			return false;
		if (funcionamiento_hora_cierre == null) {
			if (other.funcionamiento_hora_cierre != null)
				return false;
		} else if (!funcionamiento_hora_cierre.equals(other.funcionamiento_hora_cierre))
			return false;
		if (local_direccion == null) {
			if (other.local_direccion != null)
				return false;
		} else if (!local_direccion.equals(other.local_direccion))
			return false;
		if (local_id == null) {
			if (other.local_id != null)
				return false;
		} else if (!local_id.equals(other.local_id))
			return false;
		if (local_lat == null) {
			if (other.local_lat != null)
				return false;
		} else if (!local_lat.equals(other.local_lat))
			return false;
		if (local_lng == null) {
			if (other.local_lng != null)
				return false;
		} else if (!local_lng.equals(other.local_lng))
			return false;
		if (local_nombre == null) {
			if (other.local_nombre != null)
				return false;
		} else if (!local_nombre.equals(other.local_nombre))
			return false;
		if (local_telefono == null) {
			if (other.local_telefono != null)
				return false;
		} else if (!local_telefono.equals(other.local_telefono))
			return false;
		if (localidad_nombre == null) {
			if (other.localidad_nombre != null)
				return false;
		} else if (!localidad_nombre.equals(other.localidad_nombre))
			return false;
		return true;
	}
	

	
}
