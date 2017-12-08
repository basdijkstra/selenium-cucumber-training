package helpers;

import globals.Globals;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class MYTestDataUtil {
	
	private static String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String lowercase = capitals.toLowerCase();

    private static int getRandomValue(int min, int max) {
    	
    	return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    
    private static int floor(double d) {
        return (int) d;
    }
    
    public static String generateUsername() {
    	
    	Calendar calendar = Calendar.getInstance();
    	
    	String username = Globals.USERNAME_PREFIX + 
    			calendar.get(Calendar.YEAR) + 
    			String.format("%02d", calendar.get(Calendar.MONTH) +1) +
    			String.format("%02d", calendar.get(Calendar.DAY_OF_MONTH)) + 
    			String.format("%02d", calendar.get(Calendar.HOUR_OF_DAY)) + 
    			String.format("%03d", calendar.get(Calendar.MILLISECOND)); 
    	
    	System.out.println("Username generated: " + username);
    	
    	return username;
    }
    
    public static String generateDateOfBirth() {
    	
    	return String.format("%02d", getRandomValue(1,28)) + String.format("%02d", getRandomValue(1,12)) + String.format("%02d", getRandomValue(1930,1998));
    }
    
    // Generate a RijksRegisterNummer (Belgium only) based on a date of birth
    // Date of birth needs to be in DDMMYYYY format! 
    public static String generateRijksRegisterNummer(String dateOfBirth) {
    	
    	// Format date of birth for RRN calculation
    	String dateOfBirthForRrn = dateOfBirth.substring(6) + dateOfBirth.substring(2,4) + dateOfBirth.substring(0,2);
    	
    	// Generate random value to be appended to the formatted date of birth
    	String random = String.format("%03d", getRandomValue(2,998));
    	
    	// Do a MOD 97 on the result
    	int modrest = Integer.parseInt(dateOfBirthForRrn + random) % 97;
    	
    	// Subtract this from 97
    	int pad = 97 - modrest;
    	    	    	
    	// Add the result to the previous number to return a valid RRN
    	return dateOfBirthForRrn + random + String.format("%02d", pad);
    }
    
    public static String generateRandomIntegerString(int max) {
    	
    	return Integer.toString(getRandomValue(0,max));
    }
    
    public static String generateRandomName(int length) {
    	
    	Random rnd = new Random();
    	StringBuilder name = new StringBuilder();
    	
    	int index = (int) (rnd.nextFloat() * capitals.length());
    	name.append(capitals.charAt(index));
    	
    	while(name.length() < length) {
    		index = (int) (rnd.nextFloat() * lowercase.length());
    		name.append(lowercase.charAt(index));
    	}
    	
    	return name.toString();
    }
    
    public static String generateEmailAddress() {
    	
    	return UUID.randomUUID().toString() + Globals.DEFAULT_EMAIL_DOMAIN;
    }
}
