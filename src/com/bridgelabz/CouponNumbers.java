package com.bridgelabz;

import java.util.*;

public class CouponNumbers
{
    public static void main(String[] args)
    {
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        StringBuffer sb=new StringBuffer();

        while (random > 0)
        {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=sb.toString();
        System.out.println("Coupon Code: "+couponCode);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distinct coupon numbers");
        int couponNumber = scanner.nextInt();
        scanner.close();
        List<Long> distinctCoupons = new ArrayList<>();
        int totalRandomNumbers = 0;
        while(couponNumber > 0) {
            Random couponGenerator = new Random();
            long coupon = couponGenerator.nextLong();
            totalRandomNumbers++;
            if (!distinctCoupons.contains(coupon)) {
                distinctCoupons.add(coupon);
                couponNumber--;
            }
        }
        System.out.println("Distinct coupons: "+distinctCoupons.toString());
        System.out.println("Total random numbers used: "+totalRandomNumbers);
    }
}