package com.mgiraud.asciiart;
import com.mgiraud.asciiart.alphabets.*;
import com.mgiraud.asciiart.manager.*;
import com.mgiraud.utils.ScannerProvider;

public class Application {
	static AsciiManager manager = new AsciiManager(new NeoAlphabet());
	static AsciiManager manager2 = new AsciiManager(new BasicAlphabet());
	static AsciiManager manager3 = new AsciiManager(new BasicExtendedAlphabet());
	static String sortie;
	static String entree;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Translate : ");
			entree = ScannerProvider.getInstance().getScanner().nextLine();
			sortie = manager.getUpperAsciiTranslation(entree);
			System.out.println(sortie);
			sortie = manager2.getUpperAsciiTranslation(entree);
			System.out.println(sortie);
			sortie = manager3.getWideAsciiTranslation(entree);
			System.out.println(sortie);
		}
	}

}
