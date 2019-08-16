package kim.gwon.su;

import javax.swing.JOptionPane;

public class HackJum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String input = JOptionPane.showInputDialog("입력 해주세요.");
		System.out.println(input);

		int num = 0;*/
		int JumSu;
		char HakJum;
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("점수 입력 : "));

		if(JumSu >= 90) {
			HakJum = 'A';
		}else if ( JumSu >= 80) {
			HakJum = 'B';
		}else if ( JumSu >= 70) {
			HakJum = 'C';
		}else if ( JumSu >= 60) {
			HakJum = 'D';
		}else { HakJum = 'F';

		}
		System.out.println("취득한 학점은 :" + HakJum + "입니다.");



	}

}
