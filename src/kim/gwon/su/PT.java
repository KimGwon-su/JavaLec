package kim.gwon.su;

public class PT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for(i=0 ; i <7 ; i++) {
			for(j=0 ; j<7 ; j++ ) {
				if(i<4) {
					if(3-i<= j && j<=3+i) {
						System.out.print("*");
					}else { System.out.print(" ");
					}
				}else if(7+i-10<= j && 7+2-i>= j) {
					System.out.print("*");

				}else { System.out.print(" ");

				}

			}System.out.println();
		}
	}
}









