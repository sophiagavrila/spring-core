package com.revature;

public class AdvancedSpellChecker implements SpellChecker{
	
    private String databaseUri;
	
    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            // Imagine that here is the logic in which the method is...
            // + determining the language of the email Message
            // + checking grammatical errors in the email Message
            // + checking spellings in the email Message
            System.out.println("Spell Checking Completed!!");

            System.out.println("DB URI: " + databaseUri);
        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }

}
