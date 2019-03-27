package offer;

import java.util.Scanner;

/**
 * 将字符串的每个空格换成"%20"
 * 例如： We Are Happy  变成 We%20Are%20Happy
 * @author Administrator
 *
 */
public class ReString {

	String string;
	
	String getString() {
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		sc.close();
		return string;
		
	}
	
	StringBuffer replace() {
		StringBuffer buffer = new StringBuffer();
		char[] chs = getString().toCharArray();
		for(char c : chs) {
			if(c == ' ') {
				buffer.append("%20");
				
			}
			else {
				buffer.append(c);
			}
		}
		
		return buffer;
	}
	public static void main(String[] args) {
		ReString rs = new ReString();
		System.out.println(rs.replace());

	}

}
