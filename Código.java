import java.util.Scanner;

public class JuegoAdivinaNumero {
 @SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
	 
	 boolean jugarMas = true;
	 int intentosTotales=0;
	 int mejorIntento1 = Integer.MAX_VALUE;
	 int mejorIntento2 = Integer.MAX_VALUE;
	 int mejorIntento3 = Integer.MAX_VALUE;
	 
	 while (jugarMas=true) {
	 int numSecreto= (int)(Math.random() * 100) + 1 ;
	 int numUsuario;
	 int intentos=0;
	 Scanner suNu = new Scanner(System.in);
	 System.out.println("Vamos a jugar, adivina el número entre el 1 y el 100");		
	 System.out.println("Dime que número piensas");		
	 numUsuario = suNu.nextInt();

 
 while (numUsuario != numSecreto) {
	intentos= intentos + 1;	 
	 if (numUsuario<numSecreto)
	 System.out.println("Te has quedado corto");
	 else 
	 System.out.println("Te has pasado");
	 Scanner suNu2 = new Scanner(System.in);
	 System.out.println("intentalo de nuevo");
	 numUsuario = suNu.nextInt(); 
	 } if (numUsuario==numSecreto) {
		 intentos= intentos + 1;
		 intentosTotales++;
		 System.out.println("Has ganado el juego, " + "tus intentos han sido " + intentos + " y veces jugadas " + intentosTotales);}
	 		
	 		if (intentos <= mejorIntento1) {	 	
	 		mejorIntento3 = mejorIntento2;
	 		mejorIntento2 = mejorIntento1;
	 	    mejorIntento1 = intentos;
	 	    
	 			}else if (intentos <= mejorIntento2) {
	 			mejorIntento3 = mejorIntento2;
	 			mejorIntento2 = intentos;
	 				
	 				}else if (intentos <= mejorIntento3) { 
	 				mejorIntento3 = intentos;
	 					
	 					}
	 		
	 				System.out.println("Tus mejores puntuaciones son: ");
	 				System.out.println("Top 1: " + (mejorIntento1 == Integer.MAX_VALUE ? "Nada" : mejorIntento1 ));
	 				System.out.println("Top 2: " + (mejorIntento2 == Integer.MAX_VALUE ? "Nada" : mejorIntento2 ));
	 				System.out.println("Top 3: " + (mejorIntento3 == Integer.MAX_VALUE ? "Nada" : mejorIntento3 ));
	 		
	 				Scanner scanner = new Scanner(System.in);
		System.out.println("¿Quieres jugar de nuevo?, (si o no)");
		
		 int numSecreto2= (int)(Math.random() * 100) + 1 ;
		String respuesta = scanner.next().toLowerCase();
	     if (respuesta.equals("no")) {
			jugarMas=false;
	     System.out.println("Gracias por jugar");
		break;
}
  }
    }	
      }
	 

 
