//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
package hw3;

import java.util.Scanner;
import java.util.Random;

public class HomeWork3_2 {
	public static void main(String[] args) {

		Random rd = new Random();
		int rdn = rd.nextInt(101);

		while (true) {
			Scanner sc = new Scanner(System.in);/* 這三行要放在while迴圈內才能連續輸入 */
			System.out.println("請猜猜看數字1~100:");/* 這三行要放在while迴圈內才能連續輸入 */
			int guess = sc.nextInt();/* 這三行要放在while迴圈內才能連續輸入 */
			
			if (guess > rdn) {
				System.out.println("猜小一點");
			
			} else if (guess < rdn) {
				System.out.println("猜大一點");
			
			} else {
				System.out.println("恭喜你答對了");
				break;
			}

		}

	}

}
