package assignments4;

import java.util.Scanner;

public class Assignments4 {

    public static float[] Nhap(float[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " : ");
            a[i] = sc.nextFloat();
        }
        return a;
    }

    public static void Xuat(float[] a) {
        System.out.println("Cac phan tu trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " : " + a[i]);
        }
    }

    public static float Max2(float[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    float temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }

    public static float[] Xoa(float[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        float[] b = new float[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                b[index] = a[i];
                index++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        sc.hasNextFloat();
        int n = sc.nextInt();
        float[] a = new float[n];
        a = Nhap(a);
        Xuat(a);
        float max2 = Max2(a);
        System.out.println("Phan tu lon thu hai trong mang la: " + max2);
        float[] b = Xoa(a);
        System.out.println("Mang sau khi xoa cac phan tu le la: ");
        Xuat(b);
    }

}
