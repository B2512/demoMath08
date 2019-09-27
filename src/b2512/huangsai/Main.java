package b2512.huangsai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = sca.nextInt();
        System.out.print("请输入月:");
        int month = sca.nextInt();
        System.out.print("请输入日:");
        int day = sca.nextInt();
        int ont = 0;
        switch (month){
            case 1:ont=day;break;
            case 2:ont=day+31;break;
            case 3:ont=day+59;break; //28
            case 4:ont=day+90;break; //31
            case 5:ont=day+120;break;
            case 6:ont=day+151;break;
            case 7:ont=day+181;break;
            case 8:ont=day+212;break;
            case 9:ont=day+245;break;
            case 10:ont=day+275;break;
            case 11:ont=day+306;break;
            case 12:ont=day+335;break;
        }
        if (year%4==0&&year%100!=0||year%400==0){
            if (month>2){
                ont+=1;
            }
        }
        System.out.println(ont);
    }
}
