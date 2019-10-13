package main;


import helpers.UserInputFormatter;
import operations.Operation;

import operations.OperatorFactory;
import ui.CommandLineInterface;
import ui.MessageLogger;
import ui.UserInterface;
import java.io.IOException;


public class Main {
    public static  void main(String[] args) throws IOException {
        UserInterface userInterface = new CommandLineInterface();
        UserInputFormatter userInputFormatter = new UserInputFormatter(userInterface.getUserInputs());
        Operation operation = OperatorFactory.getOperation(userInputFormatter.getOperation());
        int answer = operation.executeOperation(userInputFormatter.getNumbers());
        MessageLogger.logMessage("the "+userInputFormatter.getOperation().toLowerCase()+" ="+answer);
    }
}
