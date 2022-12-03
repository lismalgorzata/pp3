package AC7;
import java.util.ArrayList;

class Folder{
    private String name;
    private ArrayList<File> fileArray = new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showElements(){
        System.out.println("Files in this folder:");
        for (File file : fileArray){
            System.out.println(file.getName());
        }
    }

    public void deleteFile(String name){
        for (File file : fileArray){
            int index = 0;
            if (file.getName().equals(name)){
                fileArray.remove(index);
            }
            index ++;
        }
    }

    public void addFile(File name){
        fileArray.add(name);
    }

    public static void main(String[] args) {
        Folder folder = new Folder("Folder");
        File f1 = new File("file1", null, 0);
        File f2 = new File("file2", null, 0);
        File f3 = new File("file3", null, 0);

        folder.addFile(f1);
        folder.addFile(f2);
        folder.showElements();
        folder.addFile(f3);
        folder.showElements();
        folder.deleteFile(f1.getName());
        folder.showElements();

    }
}