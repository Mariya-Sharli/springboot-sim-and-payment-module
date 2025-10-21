package Shop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPIPayment implements PayementMode {

	@Override
	public void payment(int amt) {
		System.out.println("Payment of Rs"+ amt+"Success through UPI");
		
	}

}
