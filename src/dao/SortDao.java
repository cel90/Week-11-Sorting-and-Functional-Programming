package dao;

import java.util.ArrayList;
import java.util.List;

import model.Cheese;

public class SortDao {
 static List<Cheese> ch = new ArrayList<>(List.of(new Cheese("Feta"), new Cheese("Mozzarella"),
		                   new Cheese("Emmental"), new Cheese("Cotija"),
		                   new Cheese("Chevre"), new Cheese("Camembert"))) ;
 
 
 public static List<Cheese> getCheese() {
	 
	return ch ;
	 
 }
 
}
