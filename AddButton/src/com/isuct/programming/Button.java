package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Button implements ActionListener {

	public Button(MainGui gui) {
		// TODO Auto-generated constructor stub

	}

	String fName = "test.txt";

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("Чтение");

		File file = new File(fName);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.print(s);
			}
			br.close();
			assertTrue(true);
		} catch (IOException fnfEx) {
			fail("Something bad");
		}
	}

    private void assertTrue(boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void fail(String something_bad) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}