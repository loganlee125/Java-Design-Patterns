package logan.command.party;

import logan.command.party.actuator.Hottub;
import logan.command.party.actuator.Light;
import logan.command.party.actuator.Stereo;
import logan.command.party.actuator.TV;
import logan.command.party.command.Command;
import logan.command.party.command.impl.HottubOffCommand;
import logan.command.party.command.impl.HottubOnCommand;
import logan.command.party.command.impl.LightOffCommand;
import logan.command.party.command.impl.LightOnCommand;
import logan.command.party.command.impl.MacroCommand;
import logan.command.party.command.impl.StereoOffCommand;
import logan.command.party.command.impl.StereoOnCommand;
import logan.command.party.command.impl.TVOffCommand;
import logan.command.party.command.impl.TVOnCommand;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        log.info("{}", remoteControl);
        log.info("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        log.info("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
