import java.util.*;

public class Conjuntos {
	Collection listaAndroid;
	Collection listaiOS;
	Collection listaJava;
	Collection listaTotal;
	Factory sel;
	Iterator it;
	Iterator it1;
	Iterator it2;
	Iterator it3;
	public Conjuntos(int implementacion){
		listaAndroid= sel.getCollection(implementacion);
		listaiOS= sel.getCollection(implementacion);
		listaJava= sel.getCollection(implementacion);
		listaTotal= sel.getCollection(implementacion);
		it = listaTotal.iterator();
		it1= listaAndroid.iterator();
		it2= listaiOS.iterator();
		it3= listaJava.iterator();
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
	}
	
	public int tres(){
		int x=0;
		while (it.hasNext()){
			if (listaAndroid.contains(it) && listaiOS.contains(it) && listaJava.contains(it)){
				x++;
			}
		}
		
	}
	
	
	
	
}
