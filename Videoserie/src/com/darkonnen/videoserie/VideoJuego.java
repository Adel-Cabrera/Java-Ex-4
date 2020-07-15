package com.darkonnen.videoserie;

import java.util.Date;

public class VideoJuego extends VideoSerie implements Entregable{
	
	private String titulo = "";
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String compañia = "";
	private Date fechaEntrega = new Date(System.currentTimeMillis());
	private Date fechaDevolucion = new Date(System.currentTimeMillis());
	
	@Override
	public void verresumen() {
		System.out.println("titulo, horasEstimadas, entregado, genero, compañia, fechaEntrega, fechaDevolucion");
		
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
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}
	
	public VideoJuego() {
		this.titulo = "Demo";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "Demo";
		this.compañia = "Demo";
		this.fechaEntrega = new Date(System.currentTimeMillis());
		this.fechaDevolucion = new Date(System.currentTimeMillis());
	}
	
	public VideoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
		this.fechaEntrega = null;
		this.fechaDevolucion = null;
	}
	
	public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia, Date fechaEntrega, Date fechaDevolucion) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
		this.fechaEntrega = fechaEntrega;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
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
