package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BijayaTest {
	Bijaya bijaya;
	Niraj niraj;

	@Before
	public void setUp() throws Exception {
		bijaya = new Bijaya();
		niraj = new Niraj();
	}

	@Test
	public void test() {
		niraj.setName("Niraj");
		bijaya.setName("bijaya");
		bijaya.setFriendNameSize(niraj.getSize());
		assertEquals(new Integer(5), bijaya.getFriendNameSize());
	}

}
