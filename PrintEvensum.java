public class PrintEvensum{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println("Sum of first 100 even numbers is: " + sum);
	} 
}