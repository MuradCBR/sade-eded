import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Yoxlamaq istədiyiniz ədədi daxil edin :");
        int number=new Scanner(System.in).nextInt();
        boolean isPrime=true;
        
        if (number<2){
            System.out.println("Uyğun olmayan ədəddir.");
            return;
        }
        if (number==2){
            System.out.println("Sadə ədəddir.");
            return;
        }

        for(int i=2;i<137;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if (isPrime==true){
            System.out.println("Sadə ədəddir.");
        }
        else{
            System.out.println("Sadə ədəd deyil.");
        }

    }

    }
