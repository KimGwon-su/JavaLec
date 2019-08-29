package kim.gwon.su.method;

import javax.swing.JOptionPane;

public class MethodPractice01 {

	public static void main(String[] args) {
		MethodPractice practice = new MethodPractice();
		int result = practice.method01(7);
		int result01 = practice.method02(7);
		int result02 = practice.method03(7);
		int result03 = practice.method04(7,4);
		practice.gugudan(Integer.parseInt(JOptionPane.showInputDialog("X°ª")));
		practice.gugudan1(Integer.parseInt(JOptionPane.showInputDialog("X°ª"))
				,Integer.parseInt(JOptionPane.showInputDialog("Y°ª")));
		
		
		
		System.out.println(result);
		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);
		
		
	}

}
