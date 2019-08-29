package kim.gwon.su;

public class Practice {

	public static void main(String[] args) {
		int a;
		int b;
		for(a=0 ; a < 7 ; a++) {
			for(b=0 ; b < 7 ; b++) {
				if(a<4) {
					if(3-a<=b && 3+a >= b) {
						System.out.print("*");
					}else
					{System.out.print(" ");
					}
				}
				else if(7+a-10<=b && 9-a>=b){
					System.out.print("*");
				}else {System.out.print(" ");
				}

			}System.out.println("");
		}
	}
}

