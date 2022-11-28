package com.jspiders.atm.app;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperations {

	ATM atm=new ATM();
	Map<Double, String> mini=new HashMap<>();
	
	 public void viewBalance() {
	        System.out.println("Available Balance is : "+atm.getBalance());

	    }

	    @Override
	    public void withdrawAmount(double withdrawAmount) {
	            if (withdrawAmount <= atm.getBalance()) {
	                mini.put(withdrawAmount, " Amount Withdrawn");
	                System.out.println("Collect the Cash " + withdrawAmount);
	                atm.setBalance(atm.getBalance() - withdrawAmount);
	                viewBalance();
	            } else {
	                System.out.println("Insufficient Balance !!");
	            }
	        }
	        

	    @Override
	    public void depositAmount(double depositAmount) {
	        mini.put(depositAmount," Amount Deposited");
	        System.out.println(depositAmount+" Deposited Successfully !!");
	        atm.setBalance(atm.getBalance()+depositAmount);
	        viewBalance();

	    }

	    @Override
	    public void viewMiniStatement() {
	        for(Map.Entry<Double,String> m:mini.entrySet()){
	            System.out.println(m.getKey()+""+m.getValue());
	        }
	    }

	
	
}
