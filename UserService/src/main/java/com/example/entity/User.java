package com.example.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	   
	    private String name;
 
	    
	    private String email;

	    
	    private int phoneNumber; 
	    		

	    // Getters and Setters
	

}
