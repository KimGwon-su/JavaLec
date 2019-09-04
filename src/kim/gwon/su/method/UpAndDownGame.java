package kim.gwon.su.method;

public class UpAndDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double random = Math.random();
		int goal = (int)(random*100)+1;
		int answer = (int)(random*100)+1;
		int Max = 100;
		int Min = 0;
		boolean result = false;
		
		while(result == false) {
			answer = (Max+Min)/2;
			if(answer > goal) {
				Max = answer;
				System.out.println(Min+ "<" +goal+ "<"+Max );
			}else if(answer < goal) { 
				Min = answer;
				System.out.println(Min+ "<" +goal+ "<"+Max );
			}else if(answer == goal) {
				result = true;
				
			}
		}
	}
}
