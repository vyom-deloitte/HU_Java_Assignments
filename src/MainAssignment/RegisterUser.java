package MainAssignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import static MainAssignment.Validation.isValid;

public class RegisterUser {
    //    Scanner sc = new Scanner(System.in);
    static HashMap<String, String> loginDetails = new HashMap<>();

    public static void WriteRegData() {//writing user registration login data
        PrintWriter pw = null;
        String fileName = "C:\\Users\\vypant\\IdeaProjects\\HU_Java_Assignments\\src\\MainAssignment\\LoginData.csv";
        try {
            pw = new PrintWriter(fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String key : loginDetails.keySet()) {
            pw.println(key + "," + loginDetails.get(key));
        }
        pw.flush();
        pw.close();
    }

    static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to Login Page---");
        System.out.println("Enter Username : ");
        String userName = sc.nextLine();
        System.out.println("Enter password : ");
        String password = sc.nextLine();

        //if (!loginDetails.containsKey(userName)) throw new InputMismatchException("Invalid details");
        //if (password != loginDetails.get(userName)) throw new InputMismatchException("Invalid details");
    }

    static void registration()throws InvalidPasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String userName = sc.nextLine();
        System.out.println("Enter Password : ");
        String password = sc.nextLine();

        System.out.println("Re-Enter Password : ");
        String password2 = sc.nextLine();
        try{isValid(password);
            System.out.println("Valid password");}
        catch(InvalidPasswordException e){
            System.out.println(e);
            return;
        }
        if (!password.equals(password2)) throw new InputMismatchException("Passwords don't match");
        if (!loginDetails.isEmpty() && loginDetails.containsKey(userName))
            throw new InputMismatchException("Already Registered.");
        loginDetails.put(userName, password);
        System.out.println("Registration successful.");

    }
}





