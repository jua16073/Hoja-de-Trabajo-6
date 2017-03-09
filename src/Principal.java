import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Conjuntos listas;
		System.out.println("Que implementacion va a usar? 1. Hashset, 2.TreeSet, 3.LinkedHashSet");
		int num= teclado.nextInt();
		teclado.nextLine();
		listas= new Conjuntos(num);
		System.out.println("Ingrese un nombre");
	}

}
