package com.newSpring.App.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    public Customer(long l, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	private Long customerId;

    private String firstName;

    private String lastName;

    private String email;
}
