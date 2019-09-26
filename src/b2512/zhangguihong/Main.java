package b2512.zhangguihong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] strArray={"31","29","31","30","31","30","31","31","30","31","30","31"};
        String[] strArray1={"31","28","31","30","31","30","31","31","30","31","30","31"};
        System.out.print("年:");
        int a=scan.nextInt();
        System.out.print("月:");
        int b=scan.nextInt();
        System.out.print("日:");
        int c=scan.nextInt();
        if(a%400 == 0 || (a %4 == 0 && a %100 != 0)){
            for(int i=0; i<b-1; i++){
                c=c+Integer.parseInt(strArray[i]);
            }
        }else{
            if(b==2 && c==29){
                System.out.print("平月没有29天");
            }else{
                for(int i=0; i<b-1; i++){
                    c=c+Integer.parseInt(strArray1[i]);
                }
            }
        }
        System.out.print(c+"天");
    }
}
