package b2512.yeqingnan;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份:");
        int year = sc.nextInt();
        System.out.print("输入月份:");
        int month = sc.nextInt();
        System.out.print("输入天数:");
        int day = sc.nextInt();
        int sum = 0;
        int plus_1;
        switch (month) {
            case 1:
                sum = 0;break;
            case 2:
                sum = 31;break; //1-2月的天数
            case 3:
                sum = 59;break; //1-3月的天数
            case 4:
                sum = 90;break; //1-4月的天数
            case 5:
                sum = 120;break;//1-5月的天数
            case 6:
                sum = 151;break;//1-6月的天数
            case 7:
                sum = 181;break;//1-7月的天数
            case 8:
                sum = 212;break;//1-8月的天数
            case 9:
                sum = 243;break;//1-9月的天数
            case 10:
                sum = 273;break;//1-10月的天数
            case 11:
                sum = 304;break;//1-11月的天数
            case 12:
                sum = 334;break;//1-12月的天数
            default:
                System.out.println("输入月份错误");
                break;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                plus_1 = 1;
        } else {
            plus_1 = 0;
            if (month == 2 && day == 29) {
                System.out.println("平年的2月没有29天");
                return;
            }
        }
        if (plus_1 == 1 && month > 2) {
            sum++;
        }
        System.out.println(year + "年" + month + "月" + day + "日是今年的第" + (sum+day) + "天");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(6));
    }
}
