package com.github.sweetweet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void triangle() throws Exception {
        //Arrange
        Triangle tri = new Triangle(2, 3, 1);

        //Act
        String result = tri.triangle();

        //Assert
        Assert.assertEquals("0", result);
    }

    public void triangle2() throws Exception {
        //Arrange
        Triangle tri = new Triangle(3, 5, 3);

        //Act
        String result = tri.triangle();

        //Assert
        Assert.assertEquals("1", result);
    }

}


