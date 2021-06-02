package castingdata;

public class castingData {
	public static void main(String[] args){
		// TODO Auto-Generated Method Stub
		byte a = 50;
		int b = 5;
		float c = 2;
		
		int d = (int) (a*b/c);
		int e = (int) ((a*b)/251); // Hasil operasi di casting ke int
		
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		System.out.println("e = " + e);
	}
}
