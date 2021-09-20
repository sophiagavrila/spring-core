package com.revature;

public class AdvancedSpellChecker {
	
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            // Imagine that here is the logic in which the method is...
            // + determining the language of the email Message
            // + checking grammatical errors in the email Message
            // + checking spellings in the email Message
            System.out.println("Spell Checking Completed!!");

        } else {
            throw new RuntimeException("An exception occurred while checking spelling");
        }
    }

}
