package org.echocat.kata.java.part1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainUnitTest {

    @Test
    public void testGetHelloWorldText() throws Exception {
        assertThat(Main.getHelloWorldText(), is("Hello world!"));
    }

}
