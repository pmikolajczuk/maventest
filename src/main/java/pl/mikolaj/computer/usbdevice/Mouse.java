package pl.mikolaj.computer.usbdevice;

public class Mouse implements USBDevice{
    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
