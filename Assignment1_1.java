package programmes;

public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Sum of 110 add 200 is : " + add(110, 200));
	       System.out.println(" Sum of 0 and 0 is : " + add(0, 0));
	       System.out.println(" Sum of -10 and +10 is : " + add(-10, 10));
	       System.out.println(" Sum of -10 + 200 is : " + add(-10, 200));
	       System.out.println(" Sum of 0 + 200 is : " + add(0, 200));


	
	}public static int add(int a, int b){
        if(b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
    }



}
