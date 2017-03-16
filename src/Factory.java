import java.util.*;
public class Factory {
	// Se crea el tipo de lista segun el usuario desee
	public AbstractSet getCollection(int lol){
		AbstractSet seleccionado=null;
		switch(lol){
		case 1:{
			seleccionado= new HashSet<String>();
			break;
		}
		case 2:{
			seleccionado= new TreeSet<String>();
			break;
		}
		case 3:{
			seleccionado= new LinkedHashSet<String>();
			break;
		}
		}
		return seleccionado;
	}
}
