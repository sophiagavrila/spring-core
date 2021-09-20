package com.revature;

public class EmailClient {
	
    private BasicSpellChecker basicSpellChecker;

    public EmailClient() {
    	this.basicSpellChecker = new BasicSpellChecker();
    }

    void sendEmail(String emailMessage) {
        basicSpellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }

}
