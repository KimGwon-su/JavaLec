package kim.gwon.su.method;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		/*SungJuk rec = new SungJuk();

			rec.stdNum = JOptionPane.showInputDialog("�й�");
			rec.stdName = JOptionPane.showInputDialog("�̸�");
			rec.kor = Integer.parseInt(JOptionPane.showInputDialog("����"));
			rec.eng = Integer.parseInt(JOptionPane.showInputDialog("����"));
			rec.mat = Integer.parseInt(JOptionPane.showInputDialog("����"));

			System.out.println(rec.stdNum+rec.stdName+"�� �����Դϴ�.");

			rec.sum();
			rec.ave();
			for(int i=0 ; i<5 ; i++) {
				double randomNum = Math.random();
				int random = (int)(randomNum*100)+1;
				System.out.println("randomNum = " + random);
			}*/

		List<Integer>list = new ArrayList<Integer>();

		while(list.size() < 51) {
			System.out.println("list.size(): " + list.size());
			double randomNum = Math.random();
			System.out.println("randomNum: " + randomNum);
			int random = (int)(randomNum*100)+1;
			System.out.println(random);
			if(list.contains(random)) {
				continue;
			}else {
				list.add(random);
			}
		}	
		
		
		for(int i=0 ; i<100 ; i++) {
			
			System.out.println(list.get(i));
		}
		
	}
}


