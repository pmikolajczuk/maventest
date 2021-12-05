package pl.mikolaj.computer.file.imagefile;

import pl.mikolaj.computer.file.File;
import pl.mikolaj.computer.file.FileType;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}
