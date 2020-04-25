package learn.something.bridge.impl;

public class CharDisplayImpl implements DisplayImpl {

    private String start;
    private String body;
    private String end;

    public CharDisplayImpl(String start, String body, String end) {
        this.start = start;
        this.body = body;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(body);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
