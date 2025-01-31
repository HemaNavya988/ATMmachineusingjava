package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationimpl implements Atminterface {

	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	public void viewBlance() {
		System.out.println("AvailableBalance:"+atm.getBalance());
		
	}

	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
			    System.out.println("collect the cash"+withdrawAmount);	
			    atm.setBalance(atm.getBalance()-withdrawAmount);
			    ministmt.put(withdrawAmount, "Amount withdraw");
			    viewBlance();
				
		}
			else {
			System.out.println("insufficient Balance");
		  }
		}	
		else {
		System.out.println("enter the amount in terms of 500 ");
		}
		
	}

	
	public void depositAmount(double depositAmount) {
		System.out.println("depositedAmount is:"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		ministmt.put(depositAmount, "Deposited Successfull");
		viewBlance();
		
		
	}
		
		
	
	public void viewMinistatement() {
		Set<Double> set=ministmt.keySet();
		for(Double d:set ) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
	}

}
