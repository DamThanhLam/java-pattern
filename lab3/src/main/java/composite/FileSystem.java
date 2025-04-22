package composite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface FileSystem {
    void showInfo();
    void saveToDisk(String path);
}