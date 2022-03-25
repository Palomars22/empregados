package entities;

public class Address {

	
	private String email,phone;

	public Address(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	public Address() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Address [email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
