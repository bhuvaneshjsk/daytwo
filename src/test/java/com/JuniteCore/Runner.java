package com.JuniteCore;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
public static void main(String[] args) {
	Result rc = JUnitCore.runClasses(New1.class,New2.class,New3.class);
	int runCount = rc.getRunCount();
	System.out.println("Run Count:"+runCount);
	
	int ignoreCount = rc.getIgnoreCount();
	System.out.println("Ignore Count:"+ignoreCount);
	
	long runTime = rc.getRunTime();
	System.out.println("Run Time:"+runTime);
	
	int failureCount = rc.getFailureCount();
	System.out.println("Failure Count:"+failureCount);
	
	List<Failure> failures = rc.getFailures();
	System.out.println(failures);
	
	for (Failure x : failures) {
		System.out.println(x);
		
	}
}
}
