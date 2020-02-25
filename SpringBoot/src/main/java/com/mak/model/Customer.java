package com.mak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer_table")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;

	@NotNull
	@NotEmpty(message="Customer Name should not be empty")
	private String customerName;

	@Max(value=25, message="must be lesser than 25")
	@Min(value=15, message="must be greater than 15")
	@NotEmpty(message="Age should not be empty")
	private String customerAge;


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}
}
