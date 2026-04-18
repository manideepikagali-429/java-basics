public class one {
    public static void main(String[] args) {
        byte defaultByte = 0;
        short defaultShort = 0;
        int defaultInt = 0;
        long defaultLong = 0L;
        float defaultFloat = 0.0f;
        double defaultDouble = 0.0;
        char defaultChar = '\u0000'; // null char
        boolean defaultBoolean = false;

        System.out.println("Default byte: " + defaultByte);
        System.out.println("Default short: " + defaultShort);
        System.out.println("Default int: " + defaultInt);
        System.out.println("Default long: " + defaultLong);
        System.out.println("Default float: " + defaultFloat);
        System.out.println("Default double: " + defaultDouble);
        System.out.println("Default char: '" + defaultChar + "'");
        System.out.println("Default boolean: " + defaultBoolean);
    }
}
