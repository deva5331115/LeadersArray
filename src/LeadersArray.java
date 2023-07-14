import java.util.Scanner;

public class LeadersArray {
    public static void leadersValues(int array[]){
        int iterator = 0 , iterator1 = 1;
        for (iterator = 0 ;iterator < array.length && iterator1 <array.length; iterator1++ ){
            if (array[iterator] < array[iterator1]){
                iterator++;
                iterator1 = iterator;
            }
            if (iterator1 == array.length - 1) {
                System.out.print(array[iterator] + " ");
                iterator1 = iterator;
                iterator++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        leadersValues(array);
    }
}
