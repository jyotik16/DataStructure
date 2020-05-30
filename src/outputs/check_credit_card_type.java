package outputs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check_credit_card_type {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		long card_num = sc.nextLong();
//		check(card_num);
		
		ArrayList<String> cards = new ArrayList<String>();
		 
		//Valid Credit Cards
		cards.add("5500-0000-0000-1204");  //mastercard
		cards.add("3000-0000-0000-04"); //diners
		cards.add("4111-1111-1111-1111"); //visa
		//Invalid Credit Card
		cards.add("xxxx-xxxx-xxxx-xxxx"); 
		 
		String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
		        "(?<mastercard>5[1-5][0-9]{14})|" +
		        "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
		        "(?<amex>3[47][0-9]{13})|" +
		        "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
		        "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for (String card : cards)
		{
		    //Strip all hyphens
		    card = card.replaceAll("-", "");
		 
		    //Match the card
		    Matcher matcher = pattern.matcher(card);
		 
		    System.out.println(matcher.matches());
		 
		    if(matcher.matches()) {
		        //If card is valid then verify which group it belong 
		    	if(matcher.group("mastercard")!=null)
		    		System.out.println("MasterCard!!!");
		    	else if(matcher.group("visa")!=null)
		    		 System.out.println("Visa!!!");
		    	else if(matcher.group("discover")!=null)
		    		 System.out.println("Discover!!!");
		    	else if(matcher.group("diners")!=null)
		    		 System.out.println("Diners!!!");
		    	
		    	
		    }
	}
}
	
}
