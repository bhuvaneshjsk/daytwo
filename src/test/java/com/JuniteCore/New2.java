package com.JuniteCore;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class New2 {
	@Test
public void sample11() {
		Assert.assertTrue("verify class new2", false);
System.out.println("s 100");
}
	@Test
public void sample22() {
System.out.println("s 200");
}
	@Test
	@Ignore
public void sample33() {
System.out.println("s 300");
}
	
}
