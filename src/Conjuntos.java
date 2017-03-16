import java.util.*;

public class Conjuntos {
	AbstractSet<String> listaAndroid;
	AbstractSet<String> listaiOS;
	AbstractSet<String> listaJava;
	AbstractSet<String> listaTotal;
	Factory sel= new Factory();
	
	public Conjuntos(int implementacion){
		listaAndroid = sel.getCollection(implementacion);
		listaiOS= sel.getCollection(implementacion);
		listaJava= sel.getCollection(implementacion);
		listaTotal= sel.getCollection(implementacion);
		
	}
	
	public void add(String nombre, String num){
		if (num.contains("1")){
			listaJava.add(nombre);
		}
		if(num.contains("2")){
			listaiOS.add(nombre);
		}
		if(num.contains("3")){
			listaAndroid.add(nombre);
		}
		listaTotal.add(nombre);
	}
	
	public int tres(){
		Iterator<String> it = listaTotal.iterator();
		int x=0;
		while (it.hasNext()){
			Object nombre= it.next();
			if (listaAndroid.contains(nombre) && listaiOS.contains(nombre) && listaJava.contains(nombre)){
				x++;
			}
		}
		return x;
	}
	
	public int NoAndroid(){
		Iterator<String> it = listaTotal.iterator();
		int x=0;
		while (it.hasNext()){
			Object nombre= it.next();
			if (!listaAndroid.contains(nombre) && listaJava.contains(nombre)){
				System.out.println(nombre);
				x++;
			}
		}
		return x;
	}
	
	public int noJava(){
		Iterator<String> it = listaTotal.iterator();
		int x=0;
		while (it.hasNext()){
			Object nombre= it.next();
			if (listaAndroid.contains(nombre) && listaiOS.contains(nombre) && !listaJava.contains(nombre)){
				System.out.println(nombre);
				x++;
			}
		}
		return x;
	}
	
	public int orNoJava(){
		Iterator<String> it = listaTotal.iterator();
		int x=0;
		while (it.hasNext()){
			Object nombre= it.next();
			if ((listaAndroid.contains(nombre) || listaiOS.contains(nombre)) && !listaJava.contains(nombre)){
				System.out.println(nombre);
				x++;
			}
		}
		return x;
	}
	
	public boolean sub(){
		Iterator<String> it = listaTotal.iterator();
		int x=0;
		while (it.hasNext()){
			Object nombre= it.next();
			if (listaAndroid.contains(nombre) && listaJava.contains(nombre)){
				x++;
			}
		}
		if ( x == listaAndroid.size())
			return true;
		return false;
	}
	
	public String Grande(){
		String cadena="";
		if (listaAndroid.size()>listaiOS.size() && listaAndroid.size()> listaJava.size()){
			cadena= "Android" + "/nlos desarrolladores son: "+ listaAndroid;
		}
		if (listaJava.size()>listaiOS.size() && listaJava.size()> listaAndroid.size()){
			cadena= "Java" + "/nlos desarrolladores son: "+ listaJava;
		}	
		if (listaiOS.size()>listaJava.size() && listaiOS.size()> listaAndroid.size()){
			cadena= "iOS" + "\nlos desarrolladores son: "+ listaiOS;
		}
		return cadena;
	}
	
	
	
	
}
