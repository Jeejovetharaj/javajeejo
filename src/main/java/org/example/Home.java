package org.example;

public class Home {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}},i=1,j=1,index=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int finish[]=new int[arr.length*3];
        i=1;j=1;
        for(;j>=0;j--)
        {
            finish[index++]=arr[i][j];
        }
        i--;j++;
        finish[index++]=arr[i][j];
        j++;
        for(;j<=2;j++)
        {
            finish[index++]=arr[i][j];
        }
        j--;i++;
        for(;i<=2;i++)
        {
            finish[index++]=arr[i][j];
        }
        j--;i--;
        for(;j>=0;j--)
        {
            finish[index++]=arr[i][j];
        }
        for(i=0;i<finish.length;i++)
            System.out.print(finish[i]+" ");
    }
}
