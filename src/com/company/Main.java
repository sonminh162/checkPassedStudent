package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("nhap vao so thi sinh du thi:");
            size = scanner.nextInt();
            if(size > 30)
                System.out.print("so luong thi sinh du thi khong qua 30.");
        }while(size>30);
        //nhap phan tu
        int i;
        array = new int[size];
        for(i = 0; i<array.length;i++)
        {
            System.out.print("nhap diem cua cac thi sinh:");
            array[i]= scanner.nextInt();
        }
        System.out.print("diem cua cac thi sinh:\t");
        for(i = 0; i< array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
        //danh sach thi sinh do
        System.out.print("\ndanh sach thi sinh thi do:\n");
        int count = 0;
        for(i = 0; i < array.length; i++)
        {
            if(array[i]>=5 && array[i]<=10)
            {
                System.out.print("cac thi dat co diem dat:"+array[i]+"\n");
                count++;
            }
        }
        System.out.print("so luong thi sinh vuot qua ki thi:\t"+count);


    }
}
