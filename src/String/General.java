package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[0-9]+");
//        Pattern p2 = Pattern.compile("123");
//        String s = "1324646";
//        Matcher m = p.matcher(s);
//        System.out.println(m.matches());
//        m.reset();
//        System.out.println(m.find() + " start = " + m.start() + " end = " + m.end());
//        System.out.println(m.find() + " start = " + m.start() + " end = " + m.end());
//        System.out.println(m.find() + " start = " + m.start() + " end = " + m.end());
//        System.out.println(m.find() + " start = " + m.start() + " end = " + m.end());
//        System.out.println(m.find() + " start = " + m.start() + " end = " + m.end());
//        System.out.println();

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        String test = "Ivanov";
        Matcher matcher = pattern.matcher(test);
        System.out.println(matcher.matches());
    }
}
