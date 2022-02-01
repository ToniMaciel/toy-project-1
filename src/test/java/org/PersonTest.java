package org;

import org.Person;
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

}
