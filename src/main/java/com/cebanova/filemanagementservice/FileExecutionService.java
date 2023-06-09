package com.cebanova.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/com/cebanova/filemanagementservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheTheFileExists(demoFile);
        FileManager.printIfTheInputFileIsADirectory(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReadManager.readDataFromATextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReadManager.readDataFromATextFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New Content \n another line";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Empty11");

        InputFileReadManager.readDataFromATextFile(demoFile);

    }
}