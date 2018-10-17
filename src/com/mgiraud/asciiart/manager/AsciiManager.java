package com.mgiraud.asciiart.manager;
import com.mgiraud.asciiart.alphabets.*;

public class AsciiManager {

	private DefaultAlphabet alphabet;

	
	
	public AsciiManager (DefaultAlphabet alphabet) {
			this.alphabet = alphabet;
	}
	
	
	public String getAsciiTranslation (String message) {
        
        message = message.toUpperCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < alphabet.getH(); i++) {
            String ROW = alphabet.getDatas()[i];
            System.err.println(ROW);

            // char maj 65 => 90
            for(char letter : message.toCharArray()){
                if(letter >= 65 && letter <= 90){
                    builder.append(ROW.substring((letter-65)*alphabet.getW(),(letter-65)*alphabet.getW()+alphabet.getW()));
                }else{
                    builder.append(ROW.substring(alphabet.getW()*26,(alphabet.getW()*26)+alphabet.getW()));
                }

            }
            builder.append("\n");
        }
        	String retour = builder.toString();
		return retour;
		
	}

}
