package StructuralPatterns.SP2_Bridge;

import StructuralPatterns.SP2_Bridge.devices.Device;
import StructuralPatterns.SP2_Bridge.devices.Radio;
import StructuralPatterns.SP2_Bridge.devices.Tv;
import StructuralPatterns.SP2_Bridge.remotes.AdvancedRemote;
import StructuralPatterns.SP2_Bridge.remotes.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
