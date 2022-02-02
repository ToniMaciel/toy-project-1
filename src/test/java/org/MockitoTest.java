package org;

import static org.mockito.Mockito.doReturn;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {
    
    @Test
    public void mockitoNameChengeTest(){
        Person person = new Person("Ana", 2000, "Student");
        //Expected to throw an exception due to version of mockito core, which the method changeMockitoCore() will change
        Person spy = Mockito.spy(person);
        doReturn("Vitoria").when(spy).getName();
        Assert.assertEquals("Vitoria", spy.getName());
    }
}
