package org.samjunitt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class runnerClass {
	@Test
	public void rc() {
		Result q = JUnitCore.runClasses(sample1.class, sample2.class, junitChall.class);
		System.out.println("Running Time" + q.getRunTime());
		System.out.println("Running count  " + q.getRunCount());
		System.out.println("Failure count  " + q.getFailureCount());
		System.out.println("Ignored Count  " + q.getIgnoreCount());
		
  List<Failure> f = q.getFailures();
  for (Failure failed : f) {
	System.out.println(failed);
}
	}
}
