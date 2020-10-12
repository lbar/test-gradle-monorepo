package shared;

import util.Strings;

import java.util.Objects;


public class Customer {

	private String lastName;
	private String firstName;


	public Customer(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Customer customer = (Customer) o;
		return Objects.equals(lastName, customer.lastName) && Objects.equals(firstName, customer.firstName);
	}


	@Override
	public int hashCode() {
		return Objects.hash(lastName, firstName);
	}


	@Override
	public String toString() {
		return Strings.toString(lastName, firstName);
	}
}
