package com.luis.tts.ECommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

@Entity
public class Customer {


		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "customer_id")
		private Long id;

		@Email(message = "Please provide a valid email")
		@NotEmpty(message = "Please provide an email")
		private String email;
		    
		@Length(min = 3, message = "Your username must have at least 3 characters")
		@Length(max = 15, message = "Your username cannot have more than 15 characters")
		@Pattern(regexp="[^\\s]+", message="Your username cannot contain spaces")
		private String username;
		    
		@Length(min = 5, message = "Your password must have at least 5 characters")
		private String password;
		    
		@NotEmpty(message = "Please provide your first name")
		private String firstName;
		    
		@NotEmpty(message = "Please provide your last name")
		private String lastName;
		//active takes the place of a token and it is basically a boolean
		private int active;
		

		@CreationTimestamp 
		private Date createdAt;
		
		
		//no arg constructor for empty repo
		public Customer() {}
		
		//arg constructor to generate Customer objects
		public Customer(String email, String username, String password, String firstName, String lastName, int active) {
			super();
			this.email = email;
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.active = active;
			
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		public int getActive() {
			return active;
		}

		public void setActive(int active) {
			this.active = active;
		}

	//only getters for auto generated fields
		
		public Long getId() {
			return id;
		}

		public Date getCreatedAt() {
			return createdAt;
		}


	//apparently just for debugging?
		@Override
		public String toString() {
			return "Customer [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
					+ ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active + ", createdAt="
					+ createdAt + "]";
		}

	}

