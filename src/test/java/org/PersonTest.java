package org;

import org.apache.commons.lang3.builder.EqualsBuilder;
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
  public void brokenEqualsBuilderTest(){
    Person person = new Person("Ana", 2000, "Student");
    Person person2 = new Person("Vitoria", 2000, "Student");
    EqualsBuilder equalsBuilder = new EqualsBuilder();
    //Wrong version of commons-lang dependency to cause a compilation failure when the tool try to use test-compile
    equalsBuilder.setTestRecursive(true);
    Assert.assertEquals("Ana", person.getName());
    Assert.assertEquals(2000, person.getBirthYear());
    Assert.assertFalse(person.isTeenager());
    Assert.assertNotNull(person.getOccupation());
  }

}
