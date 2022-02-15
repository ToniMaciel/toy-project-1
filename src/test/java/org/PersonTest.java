package org;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

  @Test
  public void expectPassedTest(){
    Person person = new Person("Ana", 2000, "Student");
    Assert.assertEquals("Ana", person.getName());
    Assert.assertEquals(2000, person.getBirthYear());
    Assert.assertFalse(person.isTeenager());
    Assert.assertNotNull(person.getOccupation());
  }

  @Test
  public void expectedPassedTest(){
    Person person = new Person("Ana", 2000, "Student");
    Person person2 = new Person("Vitoria", 2000, "Student");
    Assert.assertEquals("Ana", person.getName());
    Assert.assertEquals(2000, person2.getBirthYear());
    Assert.assertFalse(person.isTeenager());
    Assert.assertNotNull(person.getOccupation());
    Assert.assertNotEquals(person, person2);
  }

}
