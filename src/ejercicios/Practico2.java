package ejercicios;

public class Practico2 {

	public static void main(String[] args) {
		//-Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
		//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
		System.out.println(":::::");
		var numeroIf = 40;
		if (numeroIf<0) {
			System.out.println("El número es negativo");
		}else if (numeroIf > 0) {
			System.out.println("El número es positivo");
		}else {
			System.out.println("Es igual a cero");
		}
		
		/*Crea un bucle While, este bucle tendrá que tener como condición que la variable 
		numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
		 	a)Incrementar el valor de la variable en uno cada vez que se ejecute.
		 	b)Mostrarlo por pantalla cada vez que se ejecute.*/
		System.out.println(":::::");
		var numeroWhile = 0;
		while (numeroWhile < 3) {
			numeroWhile = numeroWhile+1;
			System.out.println(numeroWhile);
		}
		
		/*-Para el bucle Do While, deberás crear la misma estructura que en el While, 
		pero solo se debe ejecutar una vez.*/
		System.out.println(":::::");
		do {
			System.out.println(numeroWhile);
		} while (numeroWhile<3);

		/*-Para el bucle For, crea una variable numeroFor, 
		esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, 
		se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
		System.out.println(":::::");
		int numeroFor;
		for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
		}

		/*-Por último, para el Switch, deberás crear la variable estacion, 
		y distintos case para las cuatro estaciones del año. 
		Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola 
		informando de la estación en la que está. 
		También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
		System.out.println(":::::");
		var estacion = "verano";
		switch (estacion) {
		case "verano":
			System.out.println("estamos en "+estacion);
			break;
		case "primavera":
			System.out.println("estamos en "+estacion);
			break;
		case "otoño":
			System.out.println("estamos en "+estacion);
			break;
		case "invierno":
			System.out.println("estamos en "+estacion);
			break;
		default:
			System.out.println("no es una estación");
			break;
		}
		
		

	}

}
