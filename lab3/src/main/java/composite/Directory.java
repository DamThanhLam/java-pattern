package composite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    public void remove(FileSystem component) {
        children.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Directory: " + name);
        for (FileSystem component : children) {
            component.showInfo();
        }
    }
    
    @Override
    public void saveToDisk(String path) {
        File dir = new File(path, name);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getAbsolutePath());
            } else {
                System.out.println("Failed to create directory: " + dir.getAbsolutePath());
            }
        }
        for (FileSystem component : children) {
            component.saveToDisk(dir.getAbsolutePath());
        }
    }
}
