package com.cebanova.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //    createTheFileIdItDoesNotExist(File file)
    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exist, it has to be created");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
                ;
            }
        }
    }

    //    informIfTheTheFileExists(File file)
    public static void informIfTheTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file does not exist");
        }
    }

    //    printTheFileName(File file)
    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    //    printTheFileAbsolutePath(File file)
    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolute path is: " + file.getAbsolutePath());
    }

    //    printIfTheFileIsADirectory(File file)
    public static void printIfTheFileIsADirectory(File file) {
        if (file.isDirectory()) {
            System.out.println("This is a Directory");
        } else {
            System.out.println("This is a file");
        }
    }
    public static void printIfTheInputFileIsADirectory(File inputfile) {
        System.out.println("The file is a Directory: " + inputfile.isDirectory());
    }

    //    deleteTheFileIfExists(File file)
    public static void deleteTheFileIfExists(File file) {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but it was not deleted");
            }
        } else {
            System.out.println("The file does not exist");
        }
    }
}