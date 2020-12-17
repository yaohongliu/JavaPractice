package stringBuffer;

public class TitleCase {

	public static void main(String[] args) {
		String s = "hello everyone how are you doing";
		
		StringBuilder sb = new StringBuilder();
		String arr[]=s.split(" ");
		for(int i = 0; i < arr.length; i++)
			sb.append(arr[i]);
		System.out.println(sb);
		for(int i = 0; i < arr.length; i++)
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			System.out.println(sb.toString().trim());
			for(int i = 0; i < arr.length; i++)
				sb.append(Character.toUpperCaseCharArray(arr[i]));
			System.out.println(sb.toString);
	}

}
//task: convert every word's last character to upper and print bacl the sentence
