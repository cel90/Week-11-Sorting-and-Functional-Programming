package service;

import java.util.Comparator;
import java.util.List;

import dao.SortDao;
import model.Cheese;

public class SortService {

	 private SortDao sortDao = new SortDao ();
	 
	 public List<Cheese> getCheese(SortType Type) {
		 List<Cheese> ch = SortDao.getCheese() ;
		
		 Comparator<Cheese> comp = null ;
		 
		 switch(Type) {
		case LAMBDA:
			comp = (c1,c2) ->  Cheese.compare(c1, c2)	; 
			 ;
			break;
		case METHOD_REFERENCE:
			comp = Cheese::compare;
			break;
		default:
			throw new RuntimeException("unhandled sort type" + Type) ;
		 
		 }
		 
		 ch.sort(comp);
		 
		return ch;
	 }
}
