package Ejercicios;
import java.util.Scanner; 
import java.util.Random;


public class Main {
	public static void main(String[] args) { 
	
	      Random rand = new Random();
		
		String[] personajes = {"Emilio", "Lamoyi", "Dario", "Marcelo", "Josue", "Mau", "Diego", "Pepe", "Mario", "Antonio"};
		
		Personas arrayPersonas[] = new Personas[10];
		arrayPersonas[0] = new Personas("Emilio");
		arrayPersonas[1] = new Personas("Lamoyi");
		arrayPersonas[2] = new Personas("Dario");
		arrayPersonas[3] = new Personas("Marcelo");
		arrayPersonas[4] = new Personas("Josue");
		arrayPersonas[5] = new Personas("Mau");
		arrayPersonas[6] = new Personas("Diego");
		arrayPersonas[7] = new Personas("Pepe");
		arrayPersonas[8] = new Personas("Mario");
		arrayPersonas[9] = new Personas("Antonio");



		
		for(int i = 0; i < arrayPersonas.length; i++) {    
		    arrayPersonas[i].setZap();
		    arrayPersonas[i].setMateria();
		    arrayPersonas[i].setAdulto();
		    arrayPersonas[i].setIphone();
		    
		    // Asegurarse que los atributos no sean iguales para todas las personas
		    if (i > 0) {
		        while (arrayPersonas[i].getZap() == arrayPersonas[i-1].getZap() &&
		               arrayPersonas[i].getMateria() == arrayPersonas[i-1].getMateria() &&
		               arrayPersonas[i].getAdulto() == arrayPersonas[i-1].getAdulto() &&
		               arrayPersonas[i].getIphone() == arrayPersonas[i-1].getIphone()) {
		            
		            arrayPersonas[i].setZap();
		            arrayPersonas[i].setMateria();
		            arrayPersonas[i].setAdulto();
		            arrayPersonas[i].setIphone();
		        }
		    }

		    System.out.println("Personaje " + i +  " - " + personajes[i]);
		    System.out.println("Tiene zapatos: " + arrayPersonas[i].getZap());
		    System.out.println("Paso la materia: " + arrayPersonas[i].getMateria());
		    System.out.println("Es adulto: " + arrayPersonas[i].getAdulto());
		    System.out.println("Tiene Iphone: " + arrayPersonas[i].getIphone());
		    System.out.println("\n");
		} 

		
		Scanner scanner = new Scanner(System.in);
        int opcion;

    	int indiceAleatorio = rand.nextInt(10);
    	Personas persona_elegida = arrayPersonas[indiceAleatorio];
    	
        do {
        	
        	System.out.println("\n¿Qué pregunta quieres hacer?");
            System.out.println("1. Tiene zapatos?");
            System.out.println("2. Paso la materia?");
            System.out.println("3. Es adulto?");
            System.out.println("4. Tiene Iphone?");
            System.out.println("5. Elegir personaje");
            System.out.println("6. Salir.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	for(int i=0; i<arrayPersonas.length; i++) {
                		if(arrayPersonas[i].getZap() == true) {
                			System.out.println("Tiene zapatos: " + arrayPersonas[i].nombre);
                		}else {
                			System.out.println(arrayPersonas[i].nombre + " - x - ");
                		}
                	}
                	break;
                	
                case 2:
                	for(int i=0; i<arrayPersonas.length; i++) {
                		if(arrayPersonas[i].getMateria() == true) {
                			System.out.println("Paso la materia: " + arrayPersonas[i].nombre);
                		}else {
                			System.out.println(arrayPersonas[i].nombre + " - x - ");
                		}
                	}
                	break;
                    
                case 3:
                	for(int i=0; i<arrayPersonas.length; i++) {
                		if(arrayPersonas[i].getAdulto() == true) {
                			System.out.println("Es adulto: " + arrayPersonas[i].nombre);
                		}else {
                			System.out.println(arrayPersonas[i].nombre + " - x - ");
                		}
                	}
                	break;
                	
                case 4:
                	for(int i=0; i<arrayPersonas.length; i++) {
                		if(arrayPersonas[i].getIphone() == true) {
                			System.out.println("Tiene Iphone: " + arrayPersonas[i].nombre);
                		}else {
                			System.out.println(arrayPersonas[i].nombre + " - x - ");
                		}
                	}
                	break;
                                        
                case 5:
                    System.out.println("¿Qué personaje crees que es? ");
                    scanner.nextLine(); 
                    String eleccion_personaje = scanner.nextLine();
                    if(eleccion_personaje.equals(persona_elegida.nombre)) {
                        System.out.println("GANASTE");
                    } else {
                        System.out.println("PERDISTE, el personaje era: " + persona_elegida.nombre);
                    }
                    break;


                    
                case 6:
                	System.out.println("Fin del juego");
                	break;
                 
                default:
                    System.out.println("Opción inválida. Introduce un número del 1 al 6.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
			
}



