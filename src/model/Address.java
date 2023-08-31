package model;

public class Address {
	
	private String City;
	private String State;
	private String Country;
	
	
	public Address(String city, String state, String country) {
		super();
		City = city;
		State = state;
		Country = country;
	}


	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}
	
	
	

}
