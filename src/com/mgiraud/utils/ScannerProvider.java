package com.mgiraud.utils;

import java.util.Scanner;

public class ScannerProvider {

	private ScannerProvider() {
		this.scanner = new Scanner(System.in);
	}
	
	private static  ScannerProvider INSTANCE = null;
	
	public static synchronized ScannerProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ScannerProvider();
		}
		return INSTANCE;
	}
	
	private Scanner scanner;
	
	public Scanner getScanner() {
		return scanner;
	}
	
	public int NextInt() {
		int result = this.scanner.nextInt();
		if (this.getScanner().hasNextLine()) {
			this.scanner.nextLine();
		}
		return result;
	}


}
