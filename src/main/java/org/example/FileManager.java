package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;

public class FileManager {
    public FileManager(String fileName) {
        this.filename = fileName;
    }
    String encryptFileExtension= ".enc";
    String filename;
    String outputFilename;

    public void fileOpener(FileInputStream fileStream) throws FileNotFoundException {
        File file = new File(filename);
        fileStream = new FileInputStream(file);
    }

    public byte[] readData(FileInputStream fileStream, int length) throws IOException {
        return fileStream.readNBytes(length);
    }

    public void fileCloser(FileInputStream fileStream) throws IOException {
        fileStream.close();
    }
    public void writeData(FileOutputStream fileStream, byte[] data) throws IOException {
        fileStream.write(data);
    }
    public FileOutputStream openFile(String fileName) throws IOException {
        selectFileName();
        File file = new File(outputFilename);
        file.createNewFile();
        return new FileOutputStream(file);
    }

    public void closeFile(FileOutputStream fileStream) throws IOException {
        fileStream.close();
    }

    private void selectFileName()
    {
        if(!new File(filename+encryptFileExtension).exists())
        {
            outputFilename=filename+encryptFileExtension;
            return;
        }
        int counter=0;
        do {
            counter++;
        }while (new File(filename+counter+encryptFileExtension).exists());
        outputFilename=filename+counter+encryptFileExtension;
    }

}
