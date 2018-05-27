package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Person {
  
  @Id @GeneratedValue
  private Long id;
  private String lastname; 
  private String firstname;
  
  protected Person(){/*JPA needs empty constructor*/}
  
  public Person(@NonNull String lastname,@NonNull String firstname){
    this.firstname = firstname;
    this.lastname = lastname;
  }
  
  public String getFirstname() {
    return firstname;
  }
  
  public String getLastname() {
    return lastname;
  }
  
  public Long getId() {
    return id;
  }
  
  @Override
  public String toString() {
    return firstname + ", " + lastname;
  }
}
