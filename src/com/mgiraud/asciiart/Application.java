package com.mgiraud.asciiart;
import com.mgiraud.asciiart.alphabets.NeoAlphabet;
import com.mgiraud.asciiart.manager.*;
import com.mgiraud.utils.ScannerProvider;

public class Application {
	static AsciiManager manager = new AsciiManager(new NeoAlphabet());
	static String sortie;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		sortie = manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		System.out.println(sortie);
		}
	}

}
