package logan.command.simpleremote;

import logan.command.simpleremote.actuator.GarageDoor;
import logan.command.simpleremote.actuator.Light;
import logan.command.simpleremote.command.impl.GarageDoorOpenCommand;
import logan.command.simpleremote.command.impl.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
