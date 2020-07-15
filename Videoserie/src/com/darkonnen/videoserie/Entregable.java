package com.darkonnen.videoserie;

import java.util.Date;

public interface Entregable {
	
 //	entregar(): cambia el atributo prestado a true y setea la fecha de entrega
//	devolver(): cambia el atributo prestado a false setea la fecha de devolución.
//	isEntregado(): devuelve el estado del atributo prestado.
	
	void entregar(Date fechaEntrega);
	
	void devolver(Date fechaDevolucion);
	
	boolean isEntregado();
		

}
