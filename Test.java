package Array;
import java.util.Scanner;
class question_2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length of Array");
int n = sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter values in array");

for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
}
int max=arr[0];
int min=arr[0];

for(int i=0; i<n; i++){
    if(max<arr[i]){
        max=arr[i];
    }
}
System.out.println("max "+max);

for(int i=0; i<n; i++){
    if(min>arr[i]){
        min=arr[i];
    }
}
System.out.println("min "+min);

}
}