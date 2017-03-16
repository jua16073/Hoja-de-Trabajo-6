import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Conjuntos listas;
		System.out.println("¿Que implementacion desea usar? 1. Hashset, 2.TreeSet, 3.LinkedHashSet");
		int num= teclado.nextInt();
		teclado.nextLine();
		listas= new Conjuntos(num);
		int x=1;
		while (x==1){
			System.out.println("Ingrese un nombre");
			String nombre= teclado.nextLine();
			System.out.println("Ingrese si es desarrollador de 1:Java, 2:iOS, 3:Android");
			String n= teclado.nextLine();
			listas.add(nombre, n);
			System.out.println("¿Desea ingresar otro nombre?: 1: Si 2. No");
			x= teclado.nextInt();
			teclado.nextLine();
		}
		System.out.println("Los desarrolladores que trabajan en las tres plataformas son: ");
		System.out.println(listas.tres());
		System.out.println("Los desarrolladores que trabajan en Java pero no en android son: ");
		System.out.println(listas.NoAndroid());
		System.out.println("Los desarrolladores que no trabajan en Java, pero si en iOS y Android son:");
		System.out.println(listas.noJava());
		System.out.println("Los que desarrollan en Android o iOS pero no en Java son:");
		System.out.println(listas.orNoJava());
		System.out.println("Afirmacion: 'Los desarrolladores Android son subconjunto de Java' es:");
		System.out.println(listas.sub());
		System.out.println("El conjunto que mas desarrolladores tiene es: ");
		System.out.println(listas.Grande());
	}

}
