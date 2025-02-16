public class Strings {

    public static void main(String[] args) {


        String  name = "ramp";
        System.out.println(name);

        int i = name.length();
        System.out.println(i);
        //string length

        String a = name.toUpperCase();
        System.out.println(a);
        //string in uppercase

        System.out.println(a.substring(0,3));
        //for selected range

        System.out.println(a.replace('R','D'));
        //for replacing chars

        String z = "G A M A N";
        System.out.println(z.replace(" ","_"));
        System.out.println(z.indexOf('A'));

    }

}
