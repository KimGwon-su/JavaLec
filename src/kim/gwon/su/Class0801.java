package kim.gwon.su;

public class Class0801 {

	public static void main(String[] args) {
		

	int num1 = 4;
	int num2 = 130;
	int total = num1 + num2;
	// ����̴� �츮���� ���� �ʹ��ʹ� �ʹ��ʹ� �����Ѵ�
	System.out.println("��ǹ� =" + total + "cm");
		 

		Storage str1 = new Storage();
		str1.num1 = 10;
		str1.num2 = 1;

		int total1 = str1.num1 + str1.num2;
		System.out.println(total1);

		Storage str2 = new Storage();
		str2.num1 = 20;
		str2.num2 = 30;

		int total2 = str2.num1 + str2.num2;
		System.out.println(total2);

		total1 = total1 + str2.num2;
		total1 = total1 + str2.num1;

		System.out.println(total1);

	}
}
