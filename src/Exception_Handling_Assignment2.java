// Using exception handling create a function for password validation.   

//      Note: Password should be in a range of 5 to 10 characters with below combination   

//      At least one Uppercase alphabet   

//      At least one Lowercase alphabet   

//      At least one special characters “@ #  &  % * ! ”   

//      At least one digit 1,2,3,….  


class InvalidPasswordException extends Exception {

	int ConditionsViolated = 0;

	public InvalidPasswordException(int cv)
	{
		super("Invalid Password: ");
		ConditionsViolated = cv;
	}

	public String printMessage()
	{
		
		switch (ConditionsViolated) {

		// Password length should be betwwn 5-10 characters
		case 1:
			return ("Password length should be"
					+ " between 5 to 10 characters");

		// Password should contain// at least one digit(0-9)
		case 2:
			return ("Password should contain"
					+ " at least one digit(0-9)");

		// Password should contain at least one special character
		case 3:
			return ("Password should contain at "
					+ "least one special character");

		// Password should contain at least one uppercase letter
	
		case 4:
			return ("Password should contain at"
					+ " least one uppercase letter(A-Z)");

		// Password should contain at least one lowercase letter
		
		case 5:
			return ("Password should contain at"
					+ " least one lowercase letter(a-z)");
		}

		return ("");
	}
}

public class Exception_Handling_Assignment2 {


	public static void isValid(String password)
		throws InvalidPasswordException
	{

		// check password length
		
		if (!((password.length() >= 5)
			&& (password.length() <= 10))) {
			throw new InvalidPasswordException(1);
		}

		
		if (true) {
			int count = 0;

			// check digits from 0 to 9
			for (int i = 0; i <= 9; i++) {

				// to convert int to string
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(2);
			}
		}

		// check special characters
		if (!(password.contains("@") || password.contains("#")
			|| password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) {
			throw new InvalidPasswordException(3);
		}

		if (true) {
			int count = 0;

			// check capital letters
			for (int i = 65; i <= 90; i++) {
				char c = (char)i;
                String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(4);
			}
		}

		if (true) {
			int count = 0;

			// checking small letters
			for (int i = 90; i <= 122; i++) {
				char c = (char)i;
				String str1 = Character.toString(c);
                if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(5);
			}
		}

		// The password is valid
	}

	public static void main(String[] args)
	{

		String pass1 = "WrongPassword";

		try {
			System.out.println("Is Password "
							+ pass1 + " valid?");
			isValid(pass1);
			System.out.println("Valid Password");
		}
		catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}

		String pass2 = "Poijkl14@";
		try {
			System.out.println("\nIs Password "
							+ pass2 + " valid?");
			isValid(pass2);
			System.out.println("Valid Password");
		}
		catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
	}
}

