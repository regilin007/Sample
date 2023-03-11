package org.samjunitt;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class junitChall extends baseClass {
	@Ignore
	@Test
	public void tc5() {
		System.out.println("sample 5");

	}

	@Ignore
	@Test
	public void tc4() {
		System.out.println("Test 4 ");
		launchUrl("https://inmakes.com/");

	}

	@Ignore
	@Test
	public void tc3() {
		System.out.println("Test 3 ");
		launchUrl("https://en-gb.facebook.com/");

	}

	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test 2 ");
		launchUrl("https://www.youtube.com/");

	}

	@Test
	public void tc1() {
		System.out.println("Test 1 ");
		launchUrl("https://mail.google.com/");
		

	}

	@BeforeClass
	public static void browserLaunch() {
		launchBrowser();
		windowMaximize();

	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}

}
