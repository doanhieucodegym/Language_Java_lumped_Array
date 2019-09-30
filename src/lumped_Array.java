import java.util.Scanner;

public class lumped_Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("nhập số phần tử  mảng  1");
        int pt1 = sc.nextInt();
        int [] array1 =new int[pt1];
        System.out.println("Nhập phần tủ mảng 1");
        for (int i =0;i<array1.length;i++){
            System.out.println("Phần tủ "+(i+1));
            array1[i] = sc.nextInt();
        }
        //
        System.out.println("nhập số phần tử  mảng  2");
        int pt2 = sc.nextInt();
        int [] array2 =new int[pt2];
        System.out.println("Nhập phần tủ mảng 2");
        for (int i =0;i<array2.length;i++){
            System.out.println("Phần tủ "+(i+1));
            array2[i] = sc.nextInt();
        }
        ///
        System.out.println("mảng 3 = mảng 1 +mảng 2");
        int []array3 = new int [array1.length +array2.length];
        int count =0;
        //thêm  phần tử  vào mảng 3
        for(int i =0; i<array1.length;i++){
            array3[i] =array1[i];
            count++;
        }
        for (int j =0;j<array2.length;j++){
            array3[count++] =array2[j];
        }
        // in ra mảng  3
        for(int i =0 ;i<array3.length;i++){
            System.out.print(array3[i] +"\t");
        }
        System.out.println();
    }
}
