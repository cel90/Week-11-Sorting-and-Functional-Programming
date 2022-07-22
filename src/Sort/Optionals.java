package Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

import model.Cheese;


public class Optionals {
  
   private Scanner scanner = new Scanner(System.in) ;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Optionals().run() ;
	}

	private void run() {
	
		String str;
		do {
			System.out.println("Please enter a cheese !! ");
			 str = scanner.nextLine() ;
				
			
		}
		while (str.isEmpty()) ;
		methodB(str) ;
		
	}
	 public void methodB(String choice) {
			Cheese test = new Cheese(choice) ;
			Optional<Cheese> oc = Optional.of(test) ;
			// System.out.print(oc.get().getCheeseName());
			System.out.println("The Cheese found is :  ===>  " + chessyMethod(oc)) ;
			}
	 public Cheese chessyMethod(Optional<Cheese> optionalCheese) {
		 
		String search = optionalCheese.get().getCheeseName() ;
		 Optional<Cheese> oCh ;
		 oCh = Optional.empty() ;
		 
		 List<Cheese> ch = new ArrayList<>(List.of(new Cheese("Feta"), new Cheese("Mozzarella"),
                 new Cheese("Emmental"), new Cheese("Cotija"),
                 new Cheese("Chevre"), new Cheese("Camembert"))) ;
		
		 switch(search) {
		 case "Feta" :
			 oCh = Optional.of(ch.get(0)) ;
			 break ;
		 case "Mozzarella" :
			 oCh = Optional.of(ch.get(1)) ;
			 break ;
		 case "Emmental" :
			 oCh = Optional.of(ch.get(2)) ;
			 break ;
		 case "Cotija" :
			 oCh = Optional.of(ch.get(3)) ;
			 break ;
		 case "Chevre" :
			 oCh = Optional.of(ch.get(4)) ;
			 break ;
		 case "Camembert" :
			 oCh = Optional.of(ch.get(5)) ;
			 break ;
		
		 }
		return oCh.orElseThrow(() -> new NoSuchElementException("Cheese Not Found !!!")) ;
		 } }
    
	
   

