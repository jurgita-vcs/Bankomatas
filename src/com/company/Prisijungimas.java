package com.company;

public class Prisijungimas {

    public void loginPin(String login, int pin) throws InvalidPinExeption {
        final String LOGIN = "User";
        final int PIN = 1234;

        if (LOGIN.equals(login) && (PIN == pin)) {
            //System.out.println("PIN teisingas.");
        }
        else {
            throw new InvalidPinExeption("Neteisingas PIN");
        }
    }



}
