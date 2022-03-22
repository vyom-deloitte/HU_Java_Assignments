package MainAssignment;

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