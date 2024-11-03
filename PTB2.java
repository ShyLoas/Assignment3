
package assignment3;

import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Phuong trinh bac 2: ax^2 + bx + c = 0");
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        
        PTB2.giai(a,b,c);
    }
    //khai bao mot phuong thuc de tinh toan
    public static void giai(double a, double b, double c){
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if(a==0){ //neu a = 0 thi se co 2 truong hop
            if(b==0){// truong hop 1: a = 0, b = 0: pt vo so nghiem
                System.out.println("Phuong trinh vo nghiem");
            }else{ //truong hop 2: a = 0, b bat ky: pt co 1 nghiem la -c/b
                System.out.println("Phuong trinh co 1 nghiem: " +  "x = " + (-c/b));
            }
        }else{
            if (delta > 0) { //tinh delta va chia ra 3 truong hop
            //truong hop 1: delta > 0 => 2 nghiem
            //Math.sqrt la ham can bac hai cua java
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a)); //nghiem 1: (-b + can delta) / (2*a)
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));//nghiem 1: (-b - can delta) / (2*a)
            System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            //truong hop 2: delta = 0 => 1 nghiem la -b/(2*a)
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            //truong hop 3: delta < 0 => vo nghiem
            System.out.println("Phuong trinh vo nghiem");
        }
        }
    }
}
