package kim.gwon.su;

import javax.swing.JOptionPane;

public class InputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		input = JOptionPane.showInputDialog("����");
		System.out.println(input);
		
		int parseInt = Integer.parseInt(input);
		System.out.println(parseInt);

	}

}
