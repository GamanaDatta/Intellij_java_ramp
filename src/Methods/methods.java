package Methods;

public class methods {

    //Defining

    public void Mymethods(){

        //statements in a method
        System.out.println("this is a method");
    }

    public static void main(String[] args) {

       //calling
        new methods().Mymethods();

        //another way of calling
        methods x = new methods();
        x.Mymethods();

    }

}
