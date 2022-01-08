package StringPkg;

public class StringCode {
    public static void main(String args[]) {
        String City = " Hyderabad ";
        String City2= "Karachi";
        System.out.println(City.toLowerCase());
        System.out.println(City.charAt(4));
        System.out.println(City.toUpperCase());
        System.out.println(City.contains("abad"));
        System.out.println(City.equalsIgnoreCase(City2));
        System.out.println(City.equals("Hyderabad"));
        System.out.println(City2.equals("karachi"));
        System.out.println(City.compareTo(City2));
        System.out.println(City.length());
        System.out.println(City2.length());
        System.out.println(City.endsWith("bad"));
        System.out.println(City.toCharArray());
        for(int i=0; i< args.length; i++) {
            System.out.println(args[5]);
            }
        System.out.println(City.trim());
        System.out.println(City.concat(City2));
        System.out.println(City.indexOf('H'));
        System.out.println(City.isBlank());
        System.out.println(City.isEmpty());
        System.out.println(City.replace('a','A'));
        System.out.println(City.codePointAt(5));
        System.out.println(City.codePointBefore(5));
        System.out.println(City.codePointCount(0,9));
        System.out.println(City.lastIndexOf('d'));
        System.out.println(City.repeat('H'));
        System.out.println(City.equalsIgnoreCase(City2));
    }
}
