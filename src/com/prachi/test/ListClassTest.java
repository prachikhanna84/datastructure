package com.prachi.test;

import com.prachi.ListClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
public class ListClassTest {

    @Mock
    ListClass listClassDisplay;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addElements() {
        ListClass listClass = new ListClass();
        listClass.addElements("one element");
        assertEquals(1,listClass.getSize());
    }

    @Test
    public void remove() {
        ListClass listClass = new ListClass();
        listClass.addElements("one element");
        listClass.addElements("two element");
        listClass.remove("one element");
        assertEquals(1,listClass.getSize());
    }

    @Test
    public void getSize() {
        ListClass listClass = new ListClass();
        listClass.addElements("1");
        assertEquals(1,listClass.getSize());
    }

    @Test
    public void display() {
        doNothing().when(listClassDisplay).display();
    }

    @Test
    public void contains() {
        ListClass listClass = new ListClass();
        listClass.addElements("10");
        assertEquals(0,listClass.contains("10"));
        assertEquals(-1,listClass.contains("11"));

    }
}
