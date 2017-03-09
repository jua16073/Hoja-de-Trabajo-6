
public class Factory {
	public Collection getCollection(int lol){
		Collection seleccionado=null;
		switch(lol){
		case 1:{
			seleccionado= new HashSet();
			break;
		}
		case 2:{
			seleccionado= new TreeSet();
			break;
		}
		case 3:{
			seleccionado= new LinkedHashSet();
			break;
		}
		}
		return seleccionado;
	}
}
