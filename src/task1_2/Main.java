package task1_2;

import task1_2.client.ClientGUI;
import task1_2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
