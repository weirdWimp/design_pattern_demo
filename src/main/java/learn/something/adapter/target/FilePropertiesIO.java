package learn.something.adapter.target;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FilePropertiesIO {

    void loadFromFile(String file) throws IOException;

    void storeToFile(String file) throws IOException;

}
