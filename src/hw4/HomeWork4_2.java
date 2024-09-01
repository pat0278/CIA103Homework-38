//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)
package hw4;
import java.util.Scanner;
public class HomeWork4_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入一段話:");
		String st = s.nextLine();
		String rv = "";
		for(int i =st.length()-1; i>=0 ; i--) {
			rv+=st.charAt(i);
			
		}
		System.out.println("反轉術式:"+rv);
		

	}
}