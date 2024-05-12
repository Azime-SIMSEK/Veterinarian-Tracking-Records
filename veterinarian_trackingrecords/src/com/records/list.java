package com.records;
import java.util.*;
public class list {
    node head=null;
    node tail=null;
    node temp1=null;
    node temp2=null;
    
    
    int petID;
	String petName;
	String petType;
	int birthYear;
	double weight;
	
	
	Scanner scanner =new Scanner(System.in);
	
	void adding_to_the_head() {
		System.out.println("Please enter animals' informations:");
		System.out.println("petID:");      petID =scanner.nextInt();
		System.out.println("petName:");    petName=scanner.next();
		System.out.println("petType:");    petType=scanner.next();
		System.out.println("birthYear:");  birthYear=scanner.nextInt();
		System.out.println("weight:");     weight=scanner.nextDouble();
		
		node animal=new node (petID, petName, petType, birthYear, weight);
		
		if(head==null) {
			head=animal;
			System.out.println("First animal is added.");
		}
		else {
			animal.next=head;
			head=animal;
			System.out.println(petID + " is added to the head.");
		}
	}
	
	void adding_to_the_tail() {
		System.out.println("Please enter animals' informations:");
		System.out.println("petID:");      petID =scanner.nextInt();
		System.out.println("petName:");    petName=scanner.next();
		System.out.println("petType:");    petType=scanner.next();
		System.out.println("birthYear:");  birthYear=scanner.nextInt();
		System.out.println("weight:");     weight=scanner.nextDouble();
		
		node animal=new node (petID, petName, petType, birthYear, weight);
		
		if(head==null) {
			animal.next=null;
			head=animal;
			tail=animal;
			System.out.println("First animal is added");
		}
		else
		{
			animal.next=null;
			tail.next=animal;
			tail=animal;
			System.out.println(petID + " is added to the tail.");
		}
	}
	
	void adding_in_middle(int index) {
		System.out.println("Please enter animals' informations:");
		System.out.println("petID:");      petID =scanner.nextInt();
		System.out.println("petName:");    petName=scanner.next();
		System.out.println("petType:");    petType=scanner.next();
		System.out.println("birthYear:");  birthYear=scanner.nextInt();
		System.out.println("weight:");     weight=scanner.nextDouble();
		
		node animal=new node (petID, petName, petType, birthYear, weight);
		
		System.out.println("Please enter an index for adding in middle");
		index=scanner.nextInt();
		
		
		if(head==null && index==0) {
			head=animal;
			tail=animal;
			System.out.println("First animal is added");
		}
		else if(head!=null && index==0) {
			animal.next=head;
			head=animal;
			System.out.println(index + "added.");
		}
		else {
			int a=0;
			node temp1=head;
			node temp2=head;
			while(temp1.next!=null) {
				a++;
				temp2=temp1;
				temp1=temp1.next;
			}
			if(a==index) {
				temp2.next=animal;
				animal.next=temp1;
				System.out.println(index + " added.");
			}
			else {
				temp1=head;
				temp2=head;
				int b=0;
				while(b!=index) {
					temp2=temp1;
					temp1=temp1.next;
					b++;
				}
				temp2.next=animal;
				animal.next=temp1;
				System.out.println(index + " added.");
			}
		}
	}
	
	void removing() {
		if(head==null) {
			System.out.println("The list is empty.There is no petID for removing");
		}
		else {
			System.out.println("Please enter the petID for removing:");
			 petID =scanner.nextInt();
			if(petID==head.petID && head.next==null) {
				head=null;
				tail=null;
				System.out.println(petID +"Removed from the list.");
			}
			else if(petID==head.petID && head.next!=null) {
				head=head.next;
				System.out.println(petID +"Removed from the list.");
			}
			else {
				temp1=head;
				temp2=head;
				while(temp1.next!=null) {
					if(petID==temp1.petID) {
						temp2.next=temp1.next;
				         System.out.println(petID +"Removed from the list.");
					}
					temp2=temp1;
					temp1=temp2.next;
					if(petID==temp1.petID) {
						temp2.next=null;
						tail=temp2;
					    System.out.println(petID +"Removed from the list.");
					}
				}		
			}		
		}
	
	}
	
	void print() {
		if(head==null) {
			
			System.out.println("There is no record.");
		}
		else {
		    temp1=head;
		while(temp1!=null) {
			
			System.out.println( " Animals' Properties");
			System.out.println("**********************");
			System.out.println("petID: " + temp1.petID);
			System.out.println("Name :" + temp1.petName);
			System.out.println("Type :" + temp1.petType);
			System.out.println("Birthyear :" + temp1.birthYear);
			System.out.println("Weight:" + temp1.weight);
			System.out.println("**********************");
			
			temp1=temp1.next;
		}
	}
}
	
	
}
