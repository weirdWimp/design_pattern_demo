package learn.something.builder;

import java.time.LocalDate;
import java.time.LocalTime;

public class BuilderMain {

    public static void main(String[] args) {

        final String build = new Builder()
                .root()
                .add("ISSDAT", LocalDate.now()).add("ISSTIM", LocalTime.now()).add("RTNCOD", "")
                .add("ERRMSG", "").add("PRCCOD", "RTNBOX").end()
                .inputX("INFBDY", "RTNBOXX1")
                .add("CLTUID", "CLTUID000001").add("IACID", "IACID000001").end()
                .build();

        System.out.println(build);

    }

}
