package com.oinym.valdator.spring_validator.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.oinym.valdator.spring_validator.tools.MyConstraint;

public class User {
  @JsonProperty("name")
  @MyConstraint(pattern = "^[a-zA-z]*$",message = "Must match pattern ^[a-zA-Z]$")
  private String name;

  
  public User() {
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


}
