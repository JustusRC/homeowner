package homeowner;

import java.util.Stack;


public class Driveway {
	//Variable declaration
    Stack<Integer> streetway ;
    Stack<Integer> driveway ;
    //Constructor that initialize the stacks
    public Driveway() {
    	this.streetway = new Stack<>();
    	this.driveway = new Stack<>();
    }
    //Add method
	public void add(int licensePlate) {
		//If number is already in driveway
		if(driveway.contains(licensePlate)) {
			System.out.println("This car is already in the driveway");
		}
		else {//Else it adds
			driveway.push(licensePlate);
		}	//Calls print method
			print();	
	}
	//remove method
	public void remove(int licensePlate) {
		//if driveway contains that number
		if (driveway.contains(licensePlate)) 
	    {
			//for loop that removes the car then pushes them into the street
	        for (int i = 0; i<driveway.size()+1;i++){

	                licensePlate = driveway.pop();

	                streetway.push(licensePlate);
	        		print();  
	            }
	        
		
	    }
	    else 
	    {//else the car is not in the driveway
	        System.out.println("That car is not in the driveway.");
	    }
		//pops the top car
		streetway.pop();
		//while street is not empty push them back into driveway
		while(!streetway.isEmpty()) {			
			driveway.push(streetway.pop());
		}
					
					print();
	}
	//print method
	public void print() {
		System.out.println("In Driveway, starting at first in (one lincense plate per line): ");
        System.out.println(driveway);
        //if street is empty
        if(streetway.empty()) {
        	System.out.println("There are no cars in streetway");
        }
        else {//else print this
        System.out.println("In Street, starting at first in (one lincense plate per line): ");
        System.out.println(streetway);
        }
		
	}

}
