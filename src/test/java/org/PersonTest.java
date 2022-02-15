package org;

import static org.mockito.Mockito.mockConstruction;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockedConstruction;

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
  public void brokenEqualsBuilderTest(){
    Person person = new Person("Ana", 2000, "Student");
    Person person2 = new Person("Vitoria", 2000, "Student");
    //Wrong version of mockito dependency to cause a compilation failure when the tool try to use test-compile
    try (MockedConstruction mocked = mockConstruction(Person.class)){
      Person person3 = new Person("Jooj", 2000, "Student");
    }
    Assert.assertEquals("Ana", person.getName());
    Assert.assertEquals(2000, person.getBirthYear());
    Assert.assertFalse(person.isTeenager());
    Assert.assertNotNull(person.getOccupation());
  }

}
