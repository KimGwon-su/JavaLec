package kim.gwon.su;

import javax.swing.JOptionPane;

public class GuGuDan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int i;
		int total;


		for( i=1 ; i<10 ; i++) {
			for(a=1 ; a<=i ; a++) {

				total = i*a;

				System.out.println(i + "*" + a + "=" + total);
			}System.out.println("____________________");
		}
	}
}