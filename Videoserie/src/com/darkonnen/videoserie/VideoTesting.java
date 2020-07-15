package com.darkonnen.videoserie;

import java.util.ArrayList;
import java.util.Date;

public class VideoTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		Date tomorrow = new Date(new Date().getYear(), new Date().getMonth(), new Date().getDay()+13);
		Date dayAfterTomorrow = new Date(new Date().getYear(), new Date().getMonth(), new Date().getDay()+15);
		Date late = new Date(new Date().getYear(), new Date().getMonth(), new Date().getDay()+19);
		int counter = 0;
		VideoJuego currentMaxVideo;
		Serie currentMaxSerie;

		
		Serie serieUno = new Serie();
		Serie serieDos = new Serie("Serie 2", "Creador 2");
		serieDos.entregar(tomorrow);
		
		Serie serieTres = new Serie("Serie 3", "Creador 3");
		serieTres.entregar(dayAfterTomorrow);
		
		Serie serieCuatro = new Serie("Serie 4", 4, "Genero 4", "Creador 4", today, tomorrow);
		Serie serieCinco = new Serie("Serie 5", 5, "Genero 5", "Creador 5", today, dayAfterTomorrow);
		
		VideoJuego juegoUno =  new VideoJuego();
		VideoJuego juegoDos =  new VideoJuego("Video 2", 2);
		juegoDos.entregar(tomorrow);
		
		VideoJuego juegoTres =  new VideoJuego("Video 3", 3);
		juegoTres.entregar(dayAfterTomorrow);
		
		VideoJuego juegoCuatro =  new VideoJuego("Video 4", 4, "Genero 4", "Compañía 4", today, tomorrow);
		VideoJuego juegoCinco =  new VideoJuego("Video 5", 5, "Genero 5", "Compañía 5", today, dayAfterTomorrow);
		
		ArrayList<Serie> series= new ArrayList<Serie>();
		series.add(serieUno);
		series.add(serieDos);
		series.add(serieTres);
		series.add(serieCuatro);
		series.add(serieCinco);
		
		ArrayList<VideoJuego> videojuegos= new ArrayList<VideoJuego>();
		videojuegos.add(juegoUno);
		videojuegos.add(juegoDos);
		videojuegos.add(juegoTres);
		videojuegos.add(juegoCuatro);
		videojuegos.add(juegoCinco);

//		System.out.println(series.get(0).isEntregado());
//		System.out.println(series.get(1).isEntregado());
//		System.out.println(series.get(2).isEntregado());
//		System.out.println(series.get(3).isEntregado());
//		System.out.println(series.get(4).isEntregado());
//		// 2 en total
//		
//		System.out.println("*****************");
//		
//		System.out.println(videojuegos.get(0).isEntregado());
//		System.out.println(videojuegos.get(1).isEntregado());
//		System.out.println(videojuegos.get(2).isEntregado());
//		System.out.println(videojuegos.get(3).isEntregado());
//		System.out.println(videojuegos.get(4).isEntregado());
//		// 2 en total
		
		
		for(Serie s: series){
			if(s.isEntregado() == true){
				counter++;
			}
		}
		
		for(int i = 0; i < videojuegos.size(); i++) {
			
			if(videojuegos.get(i).isEntregado() == true) {
				counter++;
			}
			
			
			for(int j = 0; j < videojuegos.size() - 1; j++) { 
				
				if(videojuegos.get(j).getHorasEstimadas() > videojuegos.get(j).getHorasEstimadas()) {
                    VideoJuego temp = videojuegos.get(j);
                    videojuegos.set(j+1, videojuegos.get(i));
                    videojuegos.set(i, temp);
				}
				
			}			
		}
		
		for(int i = 0; i < series.size(); i++) {
			
			for(int j = 0; j < series.size() - 1; j++) { 
				
				if(series.get(j).getNumTemporadas() > series.get(j).getNumTemporadas()) {
                    Serie temp = series.get(j);
                    series.set(j+1, series.get(i));
                    series.set(i, temp);
				}
				
			}			
		}

		
		currentMaxVideo = videojuegos.get(videojuegos.size() - 1);
		currentMaxSerie = series.get(series.size() - 1);
				
		
		System.out.println(String.format("Hay en total %s artículos entregados", counter));
		// Son 4, perfecto.
		
		System.out.println(String.format("La serie con más temporadas es de %s.", currentMaxSerie.getNumTemporadas()));
		// Es 5, correcto.
		
		System.out.println(String.format("El videojuego con más cantidad de horas estimadas es de %s.", currentMaxVideo.getHorasEstimadas()));
		// Es 5, correcto.

		
//		System.out.println(today);
//		System.out.println(tomorrow);
//		System.out.println(dayAfterTomorrow);
		
		System.out.println(juegoCinco.getFechaEntrega());

		serieCinco.devolver(late);
		
		System.out.println(juegoCinco.getFechaDevolucion());
		
		//TODO fix this
		
		
		


	}

}
