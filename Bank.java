import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double m = sc.nextDouble();
        int count1000 = 0, count500 = 0, count100 = 0, count20 = 0, count10 = 0, count5 = 0, count1 = 0;
        while(m > 0){
            if(m >= 1000){
                m -= 1000;
                count1000++;
            }
            else if( m >= 500){
                m -= 500;
                count500++;
            }
            else if( m >= 100){
                m -= 100;
                count100++;
            }
            else if( m >= 20){
                m -= 20;
                count20++;
            }
            else if( m >= 10){
                m -= 10;
                count10++;
            }
            else if( m >= 5){
                m -= 5;
                count5++;
            }
            else if( m >= 1){
                m -= 1;
                count1++;
            }
        }
        System.out.println(count1000);
        System.out.println(count500);
        System.out.println(count100);
        System.out.println(count20);
        System.out.println(count10);
        System.out.println(count5);
        System.out.println(count1);
    }
}
