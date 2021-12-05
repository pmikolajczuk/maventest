package pl.mikolaj.computer;

import pl.mikolaj.computer.drive.HDDDrive;
import pl.mikolaj.computer.drive.SSDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("jnsp.jpg"));
        drive.listFiles();
    }
}
