package org;

import java.util.Calendar;

public class Person {
  private String name;
  private int birthYear;
  private Occupation occupation;

  public Person(String name, int birthYear, String occupation){
    this.name = name;
    this.birthYear = birthYear;
    this.occupation = new Occupation(occupation);
  }

  public String getName(){
    return this.name;
  }
  
  public void setName(String newName){
    this.name = newName;  
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public boolean isTeenager(){
    return (Calendar.getInstance().get(Calendar.YEAR) - this.birthYear < 18) ? true : false;
  }

  public Occupation getOccupation(){
    return this.occupation;
  }

}
