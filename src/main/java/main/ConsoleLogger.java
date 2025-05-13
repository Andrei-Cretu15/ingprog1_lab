package main;

import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger  implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification received from subject: " + o);
        System.out.println("data: " + arg);

    }

}
