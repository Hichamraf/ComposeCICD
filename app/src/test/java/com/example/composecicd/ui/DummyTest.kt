package com.example.composecicd.ui

import org.junit.Assert
import org.junit.Test


class DummyTest {
    private val subject = Dummy()

    @Test
    fun testAdd() {
        Assert.assertEquals(4, subject.add(2, 2))
    }
}
