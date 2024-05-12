package com.records;
import java.util.*;
public class main_application {

	public static void main(String[] args) {

		int n=-1;
		int index=0;
		
		list records=new list();
		
		try (Scanner scanner = new Scanner(System.in)) {
			while(n!=0) {
			System.out.println("   Veterinarion Tracking Records ");
			System.out.println("1) Add a new pet record to the head:");
			System.out.println("2) Add a new pet record to the tail:");
			System.out.println("3) Add a new pet record in middle:");
			System.out.println("4) Remove a pet record:");
			System.out.println("5) Print all pet records:");
			System.out.println("6) Exit:");
			
			n=scanner.nextInt();
			
			if(n==1) {
				records.adding_to_the_head(); 
			}
			else if(n==2) {
				records.adding_to_the_tail();
			}
			else if(n==3) {
				records.adding_in_middle(index);
			}
			else if(n==4) {
				records.removing();
			}
			else if(n==5) {
				records.print();
			}
			else if(n==6) {
				n=0;
			}
			else 
				System.out.println("You should enter n between 1-6 ");
			
			}
		}
			
	}

}
