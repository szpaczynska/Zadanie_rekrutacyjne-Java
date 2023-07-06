package Reszty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wydaj {
	
	public static void obliczResztę(List<Double> lista, double reszta)
	{
		int i =0;
	    //dopóki reszta ma wartość większą od zera oraz licznik jest mniejszy niż rozmiar listy monet odejmujemy od reszty nominały z listy
	     while(reszta >0 && i<lista.size())
	     {
	    	 if(reszta >= lista.get(i))
	    	 {
	    		 int licznik = (int)(reszta / lista.get(i));
	    		 reszta = reszta - (lista.get(i)) * licznik;
	    		 System.out.println("Wydaj " +licznik+ " monet " + lista.get(i));
	    		 lista.remove(i);
	    	}
	    	 if(i<lista.size())
	    	 i++;
	     }
		
	}
	
	
	public static void main(String[] args) {
	//Deklaracja listy dostępnych monet
	List<Double> lista = new ArrayList<Double>();
	
	//Uzupełnienie listy
	lista.add(5.0);
	lista.add(2.0);
	lista.add(2.0);
	lista.add(2.0);
	
	for(int i = 0; i<5; i++) {
		lista.add(1.0);
	}
	for(int i = 0; i<10; i++) {
		lista.add(0.5);
	}
	for(int i = 0; i<20; i++) {
		lista.add(0.2);
	}
	for(int i = 0; i<200; i++) {
		lista.add(0.1);
	}
	for(int i = 0; i<100; i++) {
		lista.add(0.05);
	}
	for(int i = 0; i<100; i++) {
		lista.add(0.02);
	}
	for(int i = 0; i<10000; i++) {
		lista.add(0.01);
	}
	
	//Deklaracja skanera do pobrania wartości od użytkownika
	 Scanner scan = new Scanner(System.in);
     System.out.println("Podaj resztę");
     String reszta_string = scan.nextLine();
     
     //zmiana pobranego ciągu znaków na wartość liczbową
     Double reszta = Double.parseDouble(reszta_string);
     
     //wywołanie funkcji obliczającej ile monet potrzeba
     obliczResztę(lista, reszta);
    
	}
	

}
