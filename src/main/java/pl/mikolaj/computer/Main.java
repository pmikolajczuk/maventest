package pl.mikolaj.computer;

import pl.mikolaj.computer.drive.HDDDrive;
import pl.mikolaj.computer.drive.SSDDrive;
import pl.mikolaj.computer.usbdevice.MemoryStick;
import pl.mikolaj.computer.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

//        drive.addFile(new File("jnsp.jpg"));
//        drive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");

        computer.addUsbDevice(memoryStick);
        computer.addUsbDevice(mouse);

        //memoryStick.eject();
        computer.removeUsbDevice(memoryStick);
        computer.removeUsbDevice(mouse);
    }
}
