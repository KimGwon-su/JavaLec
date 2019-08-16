package kim.gwon.su;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello world";
		String str2 = new String("Hello world");

		boolean isSame = str1.equals(str2);
		System.out.println(isSame);
		
		String str3 = "Hello world";
		int where = str3.indexOf("world");
		
		System.out.println(where);
		
		String str4 = "Hello world";
		str4 = str4.replaceAll("world","Korea");
		
		System.out.println(str4);
		
		String str5 = "Hello world";
		
		String subResult1 = str1.substring(0,4);
		System.out.println(subResult1);
		
		int startIndex = 0;
		int worldIndex = str1.indexOf("world");
		System.out.println(startIndex);
		System.out.println(worldIndex);
		
		String subResult2 = str5.substring(startIndex,worldIndex);
		System.out.println(subResult2);
				
		String str6 = str1.toUpperCase();
		String str7 = str1.toLowerCase();
		System.out.println(str6 + " and " + str7 );
		
		int str1Length = str1.length();
		System.out.println(str1Length);
		





	}

}
