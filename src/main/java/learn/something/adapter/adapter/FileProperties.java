package learn.something.adapter.adapter;

import learn.something.adapter.target.FilePropertiesIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FilePropertiesIO {

    @Override
    public void loadFromFile(String file) throws IOException {
        try (final FileInputStream inputStream = new FileInputStream(file)){
            load(inputStream);
        }
    }

    @Override
    public void storeToFile(String file) throws IOException {
        try (final FileOutputStream outputStream = new FileOutputStream(file)){
            store(outputStream, "Written by FileProperties");
        }
    }
}
