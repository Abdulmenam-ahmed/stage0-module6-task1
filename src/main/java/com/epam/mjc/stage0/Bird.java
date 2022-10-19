package com.epam.mjc.stage0;

public class Bird extends Animal {
	public Bird() {
		super("blue", 2, false);

	}
	public String getDescription() {
		 String description; 
		 
		 
		 if(getPaws()!=1) {
			 description = getHasfur()? "This animal is mostly " +getColor()+". It has " + getPaws() + " paws and a fur. "
			 		+ "Moreover, it has " + getPaws() + " wings and can fly." 
	                    : "This animal is mostly " +getColor()+". It has " + getPaws() + " paws and no fur. "
	                    		+ "Moreover, it has " + getPaws() + " wings and can fly.";
		 }
			 else {description = getHasfur()? "This animal is mostly " +getColor()+". It has " + getPaws() + " paw and a fur. "
			 		+ "Moreover, it has " + getPaws() + " wings and can fly." 
                : "This animal is mostly " +getColor()+". It has " + getPaws() + " paw and no fur. "
                		+ "Moreover, it has " + getPaws() + " wings and can fly.";
			 }
		return  description; 
				
		
	}
}
