package Shop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BankTransferPayment  implements PayementMode{
	@Override
	public void payment(int amt) {
		System.out.println("Payment of Rs"+ amt+"Success through Bank");
	}

}
