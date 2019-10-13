package ui;

import java.io.IOException;

public interface UserInterface {
    void  displayMessage(String message);
    String getUserInputs() throws IOException;
}
