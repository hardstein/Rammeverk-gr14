package com.company;
import java.io.File;

public class Folder {

    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }


    public void createFolder() {
        File file = new File(getFolderName());

        boolean bool = file.mkdir();
        if(bool) {
            System.out.println("Folder was created successfully");
        } else {
            System.out.println("Error, folder was not created. It might already exist");
        }
    }

    public boolean folderExists() {
        String folderName = getFolderName();
        File file = new File(folderName);
        return file.exists();
    }
}
