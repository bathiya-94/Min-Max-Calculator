package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineInterface implements UserInterface {
    @Override
    public void displayMessage(String message) {
        MessageLogger.logMessage(message);
    }

    @Override
    public String getUserInputs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
