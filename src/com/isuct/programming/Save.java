
package com.isuct.programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Save implements ActionListener {
    
    MainGui parent;

    public Save(MainGui gui) {
   
		parent = gui;   
    }
    
    String fName = "test.txt";
    
    @Override
    public void actionPerformed(ActionEvent e) {
   
		System.out.println("Сохранение в файл...");

		String textResult = parent.txtResult.getText();
		File file = new File(fName);
                 	try {
		PrintWriter out = new PrintWriter(file);
		out.println(textResult);
		out.close();
		//assertTrue(true);
		} catch (FileNotFoundException fnfEx) {
		//fail("Something bad");
		}
        
     
    }
}
