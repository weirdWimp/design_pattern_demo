package learn.something.prototype;

import learn.something.prototype.framework.Manager;
import learn.something.prototype.framework.Comment;

public class PrototypeMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("pound", new WrapperComment("#", 10));
        manager.register("dash", new WrapperComment("-", 20));
        manager.register("start_pound", new StartComment("#", 10));
        manager.register("slash", new StartComment("//", 10));

        Comment pound = manager.create("pound");
        String commentLine = "On November 14th of 2017, Firefox 57 was released, and JSONView stopped working. This was not unexpected - Mozilla had been warning for a while that they were going to shut off their old extension system completely and move to the WebExtension system pioneered by Google Chrome. All of the Firefox extensions using the old system were silently disabled. I had hoped to have a new version of JSONView available that was compatible with this new system before Firefox 57 released, but unfortunately the deprecation coincided with a crunch period...";
        pound.comment(commentLine);

        System.out.println("\n\n");

        Comment startPound = manager.create("start_pound");
        startPound.comment(commentLine);

        System.out.println("\n\n");
        Comment slash = manager.create("slash");
        slash.comment(commentLine);

        System.out.println("\n\n");
        Comment dash = manager.create("dash");
        dash.comment(commentLine);
    }


}
