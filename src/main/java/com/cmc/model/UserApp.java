package com.cmc.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class UserApp {
	private Long id;
	private String firstName;
	private String lastName;

	private String image;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String age;
	private String address;
	@NotNull
	@Email(message = "are you sure!")
	private String email;
	@NotNull
	private String password;
	private String gender;
	private List<Role> roles;
	public UserApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserApp(Long id, String firstName, String lastName, String image, String age, String address,
			@NotNull @Email(message = "are you sure!") String email, @NotNull String password, String gender,
			List<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.image = image;
		this.age = age;
		this.address = address;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.roles = roles;
	}
	public UserApp(@NotNull @Email(message = "are you sure!") String email, @NotNull String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserApp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", image=" + image
				+ ", age=" + age + ", address=" + address + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", roles=" + roles + "]";
	}
	
	
	
}
