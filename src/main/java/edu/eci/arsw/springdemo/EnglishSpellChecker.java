package edu.eci.arsw.springdemo;

import org.springframework.stereotype.Component;

@Component("EnglishSpellChecker")
public class EnglishSpellChecker implements SpellChecker {

	@Override
	public String checkSpell(String text) {		
		return "Checked ("+text+") with english checker. ";
		
	}
        
}
