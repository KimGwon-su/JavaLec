package kim.gwon.su;

import javax.swing.JOptionPane;

public class BossRaid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		int MY_HP;
		MY_HP = Integer.parseInt(JOptionPane.showInputDialog("남은나의체력"));

		int Boss_HP;
		Boss_HP = Integer.parseInt(JOptionPane.showInputDialog("남은보스체력"));

		if( MY_HP > 0 && Boss_HP <=0) {
			result = "WIN";
			System.out.println(result);
		}
		if( MY_HP <= 0 && Boss_HP <= 0) {
			result = "DRAW";
			System.out.println(result);
		}
		if( MY_HP <= 0 && Boss_HP > 0) {
			result = "DEFEAT";
			System.out.println(result);
		}
	}
}
