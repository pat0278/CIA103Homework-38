package hw2;

public class HomeWork2 {

	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int i, sum;
		sum = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}

		}
		System.out.println("1～1000的偶數和為" + sum);
		System.out.println("----------------------------------------------------------------------------------");
//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int x, y;
		y = 1;
		for (x = 1; x <= 10; x++) {
			y *= x;
		}
		System.out.println(y);
		System.out.println("-----------------------------------------------------------------------------------");
//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int a, b;
		a = 1;
		b = 1;
		while (a <= 10) {
			b *= a;
			a++;
		}
		System.out.println(b);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
//		請設計一隻Java程式，輸出結果為以下：
		int q;
		for (q = 1; q <= 10; q++) {
			System.out.print(q * q + "\t");
		}
		System.out.print("\n");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
//		阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int l, total;
		total = 1;
		for (l = 1; l <= 39; l++) {
			if (l % 10 == 4) {
			} else if (l / 10 == 4) {
			} else {
				System.out.print(l + " ");
				total++;
			}

		}
		System.out.print("\n");
		System.out.println("--------------------------------------------------------------------------------");
//		請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int m, n;
		for (m = 10; m >= 1; m--) {
			for (n = 1; n <= m; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------------------");
//		請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int o = 0;
		int p = 0;
		for (o=0;o<=5;o++) {
			for(p=0;p<=o;p++) {
				int t = 65+o;
				char c =(char)t;
				System.out.print(c);
			}System.out.println();
			
		}
			
				

		
	}
}
