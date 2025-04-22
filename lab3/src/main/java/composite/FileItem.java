package composite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class FileItem implements FileSystem {
    private String name;

    public FileItem(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name);
    }
    
    @Override
    public void saveToDisk(String path) {
        File file = new File(path, name);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating file: " + name);
        }
    }
}

