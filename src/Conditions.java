public class Conditions {

    public static void main(String[] args) {


        int aa = 1;
        if (aa == 1) {
            System.out.println(aa + " is 1\\n");

        } else {
            System.out.println(aa + " is not 1\\n");
        }

        int a = 10, b = 20, c = 20;

        boolean condition1 = (a < b);
        boolean condition2 = (b == c);

        if(condition1 && condition2){
            int d = a + b + c;

// Since both the conditions are true
            System.out.println(d+" is value of d ");
        }

    }


}
