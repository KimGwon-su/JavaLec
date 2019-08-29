package kim.gwon.su.method;

public class MethodPractice {
	public int method01(int x) {
		int y = 3 + x;
		return y;
	}
	public int method02(int x) {
		int y = 2 * x + 7;
		return y;
	}
	public int method03(int x) {
		int y = 2 * x + x * x;
		return y;
	}
	public int method04(int x,int y) {
		int z = x * x + 2 * y + x * y;
		return z;
	}
	public void gugudan(int x) {

		for(int f = 1 ; f<10 ; f++) {
			int a = x * f;
			System.out.println(x + " * " + f + " = " + a);
		}

	}
	public void gugudan1(int x , int y) {

	
	for(int i = x ;  i <= y  ; i++) {
			for(int j =1 ; j < 10 ; j++) {
				int num1 = i*j;
				System.out.println(i+" * "+j + " = " + num1);
			}
		}
	}public void bubbleSort(int[] input) {
		int length = input.length;
		for(int i=0 ; i<length; i++) {

			for(int j=0; j<length-1; j++) {
				if(input[j] > input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}
	
}
