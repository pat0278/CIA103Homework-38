//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

//進階挑戰使用Hashset等之後學完再回來寫
//import java.util.Random;

package hw3;

import java.util.Scanner;
import java.util.ArrayList;

public class HomeWork3_3 {

	public static void main(String[] args) {
        int hateNum;
        int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文,你討厭哪個數字跟我說(1~9)");

		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			lotto.add(0);
		}

		while (true) {
			hateNum = sc.nextInt();
			if (hateNum < 0 || hateNum > 9) {
				System.out.println("阿文,輸入1~9");
			} else {
				break;
			}
		}

		for(int lonum = 1 ; lonum<=49 ; lonum++) {
			if(lonum / 10 != hateNum && lonum % 10 != hateNum) {
				 System.out.print(lonum + " ");
				 sum++;
			}
		}
		System.out.println("\n總共可以選 " + sum + "個數字 ");
		
	}

}
