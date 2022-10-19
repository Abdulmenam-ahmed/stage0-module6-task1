package com.epam.mjc.stage0;

public class Animal {
private String color;
	private int numberOfPaws;
	private boolean hasFur;
	
	public Animal(String color,int numberOfPaws,boolean hasFur) {  //create constructor , could have input parameters called "parameterised".
		this.color= color;
		this.numberOfPaws= numberOfPaws;
		this.hasFur= hasFur;//(the parameter); //this before name of class field.
	}
	public String getColor() {  
		return color;
	}
	public int getPaws() {
		return numberOfPaws;
	}
	public boolean getHasfur() { 
		return hasFur;
	}
	
	public String getDescription() {
		 String description; 
		 if(numberOfPaws!=1) {
			 description = hasFur? "This animal is mostly " +color+". It has " + numberOfPaws + " paws and a fur." 
	                    : "This animal is mostly " +color+". It has " + numberOfPaws + " paws and no fur.";
		 }
			 else {description = hasFur? "This animal is mostly " +color+". It has " + numberOfPaws + " paw and a fur." 
                 : "This animal is mostly " +color+". It has " + numberOfPaws + " paw and no fur.";
			 }
		return  description;
				
		
	}

	
}

