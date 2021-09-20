package com.revature;

public class EmailApplication {

	public static void main(String[] args) {
		
		EmailClient emailClient = new EmailClient();
		
		// Send 1st email with Email Client obj
		emailClient.sendEmail("Hey, " +
				"This is my first email message.");
		
		// Send 2nd email with Email Client obj
		emailClient.sendEmail("Hey, " +
				"This is my second email message.");
		
	}

}
