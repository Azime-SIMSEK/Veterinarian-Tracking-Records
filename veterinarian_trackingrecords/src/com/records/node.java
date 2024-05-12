package com.records;

public class node {

	int petID;
	String petName;
	String petType;
	int birthYear;
	double weight;
	
	node next;

	public node(int petID, String petName, String petType, int birthYear, double weight) {
		this.petID = petID;
		this.petName = petName;
		this.petType = petType;
		this.birthYear = birthYear;
		this.weight = weight;
		
		next=null;
	}
}