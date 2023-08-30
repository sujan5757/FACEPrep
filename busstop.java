import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = sc.nextInt();
		
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<n;){
		    if(a[i]+a[i+1]<=max){
		        count++;
		        i=i+2;
		    }    
		    else{
		        count++;
		        i++;
		    }
		    
		}
		System.out.println(count);
	}
}
