package oops2;

class SmartTelephone extends Telephone {
	
	public String lift() 
	{
		return null;
	}
	public String with(int number) 
	{
		return "Phone Number : "+number;
	}

	public String disconnected(String network) 
	{
		return network+" is disconnected ";
	}
	
}
