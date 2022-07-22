package Sort;

import java.util.List;

import model.Cheese;
import service.SortService;
import service.SortType;

public class MySort {

	
	private SortService sortService = new SortService() ;
	
	public static void main(String[] args) {
	
		
		new MySort().runLambda() ;
		new MySort().runMETHOD_REFERENCE() ;

	}

	private void runMETHOD_REFERENCE() {
		// TODO Auto-generated method stub
		List<Cheese> ch = sortService.getCheese(SortType.METHOD_REFERENCE) ;
		print(ch, SortType.METHOD_REFERENCE) ;
		
	}

	private void runLambda() {
		
		List<Cheese> ch = sortService.getCheese(SortType.LAMBDA) ;
		print(ch, SortType.LAMBDA) ;
	}
	
	private void print (List<Cheese> ch, SortType Type) {
		switch(Type) {
		case LAMBDA:
			System.out.println(" ------LAMBDA-----") ;
			ch.forEach(cheese -> System.out.println(cheese.getCheeseName() + " " + cheese.getName()));
			break;
		case METHOD_REFERENCE:
			System.out.println(" ------METHOD_REFERENCE-----") ;
			ch.forEach(System.out::println);
			break;
		default:
			throw new RuntimeException("unhandled sort type" + Type ) ;
		} }}
