package Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class shop {
	
	@Autowired
	PayementMode mode ;
	
	public void doPayment(int amt)
	{
		System.out.println("Initiated of the payment of Rupees "+ amt);
	
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e){
//		e.printStackTrace();
	}
	mode.payment(amt);
	}
}
