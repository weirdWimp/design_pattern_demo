package learn.something.bridge.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class FileDisplayImpl implements DisplayImpl {

    private BufferedReader bufferedReader;

    private String fileName;

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        try {
            Path path = Paths.get(fileName);
            bufferedReader = Files.newBufferedReader(path);
            System.out.println("-------------------------------- open --------------------------------");
        } catch (IOException e) {
            closeReader();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            closeReader();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("-------------------------------- end --------------------------------");
        closeReader();
    }

    private void closeReader() {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
