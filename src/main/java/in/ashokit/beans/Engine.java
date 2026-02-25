package in.ashokit.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	public Engine() 
	{
		System.out.println("Engine :: Constructor");
		
	}
	@PostConstruct
	public void init()
	{
		System.out.println("start Engine");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("stop Engine");
	}

}
