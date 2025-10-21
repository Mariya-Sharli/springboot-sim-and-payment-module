package electronic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import electronic.Sim;
@Component
//@Primary
public class Jio implements Sim {

	public  void call()
	{
		System.out.println("Call through Jio");
	}
}
