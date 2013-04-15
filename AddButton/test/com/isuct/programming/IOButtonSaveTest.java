package com.isuct.programming;

import static org.junit.Assert.*;

import java.io.*;


import org.junit.Test;

public class IOButtonSaveTest {
	String fName="test.txt";
	@Test
	public void testWrite() {
		String tst="Simple string";
		File file = new File(fName);
		try{
			PrintWriter out = new PrintWriter(file);
			out.println(tst);
			out.close();
			assertTrue(true);
		}catch(FileNotFoundException fnfEx){
			fail("Something bad");
		}


	}
}
