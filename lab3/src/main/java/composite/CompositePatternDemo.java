package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {

        FileItem file1 = new FileItem("Document.txt");
        FileItem file2 = new FileItem("Image.png");


        Directory folder1 = new Directory("My Documents");
        Directory folder2 = new Directory("Pictures");
        Directory root = new Directory("Root");


        folder1.add(file1);
        folder2.add(file2);
        root.add(folder1);
        root.add(folder2);


        root.showInfo();
  
        String savePath = "D:/2025/KTPM/LAB3"; 
        root.saveToDisk(savePath);
    }
}

