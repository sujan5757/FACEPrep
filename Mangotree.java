public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		if(n%c == 0 || n<=c || n%c ==1){
		    System.out.println("Yes\n");
		}
		else{
		    System.out.println("No\n");
		}
	}
}
