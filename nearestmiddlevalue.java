//Write a java program to find the middle value or nearest middle value in the given array of integers
/*Find the middle value of the array.
In the above integer array the minimum value = 5 and maximum value = 30 So (30+5)/2 = 17.5.
Nearest to 17.5 values are 16 and 21. The difference between 16 and 17.5 = 1.5 and difference between 21 and 17.5 = 3.5 So the output should be 16 as it is the nearest value.*/
//ip:8
      10 8 5 6 25 30 16 21
//op:16


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        float avg=(a[0]+a[n-1])/2;
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<avg)
            {
                min=a[i];
            }
            else
            {
                max=a[i];
                break;
            }
        }
        float c=avg-min;
        float b=max-avg;
        if(c<b)
            System.out.println(min);
        else
            System.out.println(max);
    }
}
