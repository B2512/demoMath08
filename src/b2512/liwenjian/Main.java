package b2512.liwenjian;

import java.util.Scanner;
    public class Main {
    public static void main(String[]args){
        Scanner date=new Scanner(System.in);
        System.out.print("请输入某年:");
        int year=date.nextInt();
        System.out.print("请输入某月:");
        int month=date.nextInt();
        System.out.print("请输入某日:");
        int day=date.nextInt();
        int number=0;
        switch (month){
            case 1:number=0;break;
            case 2:number=31;break;
            case 3:number=59;break;
            case 4:number=90;break;
            case 5:number=121;break;
            case 6:number=151;break;
            case 7:number=182;break;
            case 8:number=213;break;
            case 9:number=243;break;
            case 10:number=274;break;
            case 11: number=304;break;
            case 12:number=335;break;
        }

        if(year%4==0&&year%100!=0||year%400==0){

            System.out.println(number+day+1+"天");
        }
        else {
            System.out.println(number + day+"天");
        }
    }
}
