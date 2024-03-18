package designpatterns.structuralpatterns.bridge;

import designpatterns.structuralpatterns.bridge.devices.*;
import designpatterns.structuralpatterns.bridge.remotes.*;

public class EjemploBridge {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Pruebas con control remoto básico.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Pruebas con control remoto avanzado.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
