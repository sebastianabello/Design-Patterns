package designpatterns.structuralpatterns.bridge.remotes;

import designpatterns.structuralpatterns.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remoto: mudo");
        device.setVolume(0);
    }
}
