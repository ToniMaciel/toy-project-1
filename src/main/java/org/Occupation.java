package org;

public class Occupation {
  private String name;
  private String description;

  public Occupation(String name){
    this.name = name;
    this.description = "";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
