package Sort;

import java.util.stream.Collectors;
import dao.SortDao;
import model.Cheese;

public class Streaming {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Streaming().run() ;
		
	}
	private void run() {
		
		//Map<String, List<Cheese>> runStream() {
		      
			 System.out.println( SortDao.getCheese().stream().map(Cheese::toString)
					 .sorted()
					 .collect(Collectors.joining(",")) ) ;
		}
	 
	 
		
		
	      
		
	
		
	}


