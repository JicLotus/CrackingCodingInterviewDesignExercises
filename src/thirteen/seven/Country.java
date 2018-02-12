package thirteen.seven;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Country {
	
	
	public String getContinent() 
	{
		return "America";
	}
	
	public Integer getPopulation() 
	{
		return 10;
	}
	
	public Integer getPopulation(ArrayList<Country> countries,String continent) 
	{
		Stream<Country> tempC  = countries.stream().filter(c -> { return c.getContinent().equals(continent); });
		Stream<Integer> pops = tempC.map(c->c.getPopulation());
		Integer total = pops.reduce(0,(a,b) -> a+b);
				
		return total;
	}
	
}
