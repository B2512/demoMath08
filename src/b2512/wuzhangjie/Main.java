package b2512.wuzhangjie;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num=0;
//        System.out.print("请输入年份:");
//        int year = scan.nextInt();
//        System.out.print("请输入月份:");
//        int month = scan.nextInt();
//        System.out.print("请输入日:");
//        int day = scan.nextInt();
//        switch (month){
//            case 1:num = day;break;
//            case 2:num = day + 31;break;
//            case 3:num = day + 59;break;
//            case 4:num = day + 90;break;
//            case 5:num = day + 120;break;
//            case 6:num = day + 151;break;
//            case 7:num = day + 181;break;
//            case 8:num = day + 212;break;
//            case 9:num = day + 243;break;
//            case 10:num = day + 273;break;
//            case 11:num = day + 304;break;
//            case 12:num = day + 334;break;
//        }
//        if (year%4==0&&year%100!=0||year%400==0){
//            if (month>1){
//                num = num+1;
//            }
//        }else{
//            System.out.print("不是闰年");
//        }
//        System.out.println(num);



        String[] strArray={"31","28","31","30","31","30","31","31","30","31","30","31"};
        System.out.print("请输入年份:");
        int year = scan.nextInt();
        System.out.print("请输入月份:");
        int month = scan.nextInt();
        System.out.print("请输入日:");
        int day = scan.nextInt();
        for (int i =0;i<month-1;i++){
            day = day+Integer.parseInt(strArray[i]);
        }
        if (year%4==0&&year%100!=0||year%400==0){
            day =day+1;
        }
        System.out.println(day);


//        System.out.print("请输入年份:");
//        int year = scan.nextInt();
//        System.out.print("请输入月份:");
//        int month = scan.nextInt();
//        System.out.print("请输入日:");
//        int day = scan.nextInt();
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year,month-1,day);//获取
//        System.out.println(calendar.get(6));
    }
}
