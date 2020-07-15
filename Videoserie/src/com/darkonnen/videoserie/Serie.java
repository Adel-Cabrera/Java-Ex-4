package com.darkonnen.videoserie;

import java.util.Date;

public class Serie extends VideoSerie implements Entregable {
		
	private String titulo = "";
	private int numTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	private Date fechaEntrega = new Date(System.currentTimeMillis());
	private Date fechaDevolucion = new Date(System.currentTimeMillis());
	
	
	@Override
	public void verresumen() {
		System.out.println("titulo, numTemporadas, entregado, genero, creador, fechaEntrega, fechaDevolucion");	
	}

	
	@Override
	public void entregar(Date fechaEntrega) {
		this.entregado = true;
		this.fechaEntrega = fechaEntrega;
	}

	@Override
	public void devolver(Date fechaDevolucion) {
		this.entregado = false;
		this.fechaDevolucion = fechaDevolucion;
		
			if(this.fechaDevolucion.compareTo(this.fechaEntrega) < 2) {
				TiempoExpiradoException e = new TiempoExpiradoException();
				e.multa();
			}		
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	
	public Serie() {
		this.titulo = "Demo";
		this.numTemporadas = 0;
		this.entregado = false;
		this.genero = "Demo";
		this.creador ="Demo";
		this.fechaEntrega = null;
		this.fechaDevolucion = null;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 0;
		this.entregado = false;
		this.genero = "Demo";
		this.creador = creador;
		this.fechaEntrega = null;
		this.fechaDevolucion = null;
	}
	
	
	public Serie(String titulo, int numTemporadas, String genero, String creador, Date fechaEntrega, Date fechaDevolucion) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
		this.fechaEntrega = fechaEntrega;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	

}
