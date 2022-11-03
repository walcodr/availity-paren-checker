package com.availity.utils.paren_checker;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ParenChecker {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		
		// takes an input string and checks that parentheses match
		String lispCode = null;
		int openPvalue = 0;
		int closePvalue = 0;
		
		try {
			
				Path path = Paths.get("./lisp_files/sampleLispCode.txt");
				lispCode = Files.readString(path);
			
				
			for (char c : lispCode.toCharArray()) {
				
				if ( c == '(' ) {
					openPvalue++;
					
				} else if ( c == ')' ) {
					closePvalue++;
				}
			}

			if ( openPvalue == closePvalue ) {
				System.out.println("All parentheses match!!! Total open parens: " + 
			openPvalue + ". Total close parens: " + closePvalue);
				
			}
			
			else {
				System.out.println("Parens do NOT match. Total open parens: " + 
						openPvalue + ". Total close parens: " + closePvalue);
				throw new Exception();
			}
			
			
		} catch(Exception e) {
			System.out.println(">> There is a parentheses mis-match. Please ensure the parentheses are in sync.");
			e.printStackTrace();
		}
	}

}
