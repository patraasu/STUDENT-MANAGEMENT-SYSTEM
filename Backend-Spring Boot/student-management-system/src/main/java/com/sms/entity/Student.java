package com.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "students_info")
public class Student {

	// f.name, l.name, dob, parent's name, address, city, phone#
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer s_id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String dob;
	@Column
	private String parentsName;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String phone;
	
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getParentsName() {
		return parentsName;
	}
	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", parentsName=" + parentsName + ", address=" + address + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
}
