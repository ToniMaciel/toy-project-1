package org;

import static org.mockito.Mockito.description;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoTest {
    
    @Test
    public void mockitoNameChengeTest(){
        Person personMock = Mockito.mock(Person.class);
        personMock.setName("Ana");
        //Expected to throw an exception due to version of mockito core, which the method changeMockitoCore() will change
        doReturn("Vitoria").when(personMock).getName();
        Assert.assertEquals("Vitoria", personMock.getName());
        verify(personMock, description("Vitoria instead of Ana")).getName();
    }
}
