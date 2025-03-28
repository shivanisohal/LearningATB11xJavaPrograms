package ArrayPractice;

import java.util.Arrays;

public class SecondLargestNymberinArray {
    public static void main(String[] args) {
        int marks[]={33,44,55,11,33,22,77};
        int SecondMax=0;
       Arrays.sort(marks);
       int n = marks.length;

        for(int i =n-2;i>=0;i--)
        {

            if(marks[i]<marks[n-1])
            {
                 SecondMax=marks[i];
                 break;
            }

        }
        System.out.println(SecondMax);
    }
}
