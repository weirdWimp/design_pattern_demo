package learn.something.adapter.adapter;

import learn.something.adapter.adaptee.OlderPrinter;
import learn.something.adapter.target.StringPinter;

public class StringPrinterAdapter extends OlderPrinter implements StringPinter {

    @Override
    public void weakPrint(String string) {
        parenthesesPrint(string);
    }

    @Override
    public void strongPrint(String string) {
        asteriskPrint(string);
    }
}
