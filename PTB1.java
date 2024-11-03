
package assignment3;

import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phuong trinh bac 1: ax + b = 0");
        
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        
        if(a==0){ //neu a = 0 thi se co 2 truong hop
            if(b==0){ // truong hop 1: a = 0, b = 0: pt vo so nghiem
                System.out.println("Phuong trinh co vo so nghiem");
            }else{// truong hop 2: a = 0, b bat ky: pt vo nghiem
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{ //neu a bat ky, b bat ky, tinh nghiem pt
            double x = -b/a;
            System.out.println("Nghiem cua phuong trinh: " + x);
        }
        
    }
}
