package learn.something.adapter;

import learn.something.adapter.adapter.FileProperties;
import learn.something.adapter.adapter.StringPrinterAdapter;
import learn.something.adapter.target.StringPinter;

import java.io.IOException;

public class AdapterMain {

    public static void main(String[] args) throws IOException {
        StringPinter printer = new StringPrinterAdapter();
        printer.weakPrint("Hello");
        printer.strongPrint("Hello");

        final FileProperties fileProperties = new FileProperties();
        fileProperties.setProperty("Hello", "World");
        fileProperties.setProperty("Max", String.valueOf(Integer.MAX_VALUE));
        fileProperties.setProperty("Name", "郭鹏辉");

        fileProperties.storeToFile("C:\\Users\\guo\\Desktop\\fileFromJava.properties");
    }
}
