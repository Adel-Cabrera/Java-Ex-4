package com.darkonnen.password;
import java.security.SecureRandom;

public class Password {
	
	private int longitud = 8;
	private String contrasena;
	private int counterLower = 0;
	private int counterUpper = 0;
	private int counterNumbers = 0;
	
	public Password() {
		
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.generarPassword();
	}
	
	public boolean esFuerte() {
		
//		esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, 
//		mas de 1 minúscula y mas de 5 números.
		
		boolean myBool;
		
		for(int i = 0; i < this.contrasena.length(); i++) {
			if(Character.isDigit(this.contrasena.charAt(i))) {
				counterNumbers++;
			}
			else if(Character.isLetter(this.contrasena.charAt(i))) {
				if(Character.isUpperCase(this.contrasena.charAt(i))) {
					counterUpper++;
				} else {
					counterLower++;
				}
			}
		}
		
		if(counterLower >= 1 && counterUpper >= 2 && counterNumbers >= 5) {
			
			myBool = true;
		} else {
			
			myBool = false;
		}
//		System.out.println(String.format("%s %s %s", counterLower, counterUpper, counterNumbers));
//		System.out.println(myBool);
		return myBool;
	}
	
	public void generarPassword() {
		
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < this.longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		this.contrasena = sb.toString();
		System.out.println(this.contrasena);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	

}
