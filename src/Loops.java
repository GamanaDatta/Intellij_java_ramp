public class Loops {

    public static void main(String[] args) {


        int a=5;
//this is for loop
        for(int i=1;i<=a;i++){

            for(int j=5;j<=i;j--){

                System.out.print(j);

                if(j<=0){
                    break;
                }

            }
            System.out.print(i);


        }
int p=1;
        //while loop
        while( p<10){
            System.out.println("value of p is "+p);
            p++;
        }
        int k=1;
do{

    System.out.println("value of k is "+k);
    k--;
}while(k>0);
        System.out.print("i was here");
//continue
for(int z=5;z>=0;z--) {

    if(z==2){
        continue;
    }
            System.out.print(z);

        }

    }

    }
