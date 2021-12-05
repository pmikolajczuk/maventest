package pl.mikolaj.computer.file.imagefile;

import pl.mikolaj.computer.file.File;
import pl.mikolaj.computer.file.FileType;

public class JPGImageFile extends AbstractImageFile {

    private final int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG");
    }
}
