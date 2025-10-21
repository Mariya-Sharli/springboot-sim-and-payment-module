package electronic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import electronic.Sim;
@Primary
@Component
public class Airtel implements Sim {

	public  void call()
	{
		System.out.println("Call through Airtel");
	}
}

