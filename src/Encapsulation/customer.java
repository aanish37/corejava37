package Encapsulation;

//POJO or model or Entity Class

public class customer {
	private String name;
	private int age;
	private String city;
	private int phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", age=" + age + ", city=" + city + ", phone=" + phone + "]";
	}
	
}
