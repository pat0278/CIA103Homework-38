//有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)
package hw4;

public class HomeWork4_3 {
	public static void main(String[] args) {
		String[]planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int quantity = 0 ;
		for(int i = 0; i<planet.length; i++) {
			for(int a = 0 ; a<planet[i].length(); a++) {
				switch(planet[i].charAt(a)) {
				case 'a','e','i','o','u':
					quantity++;
				    break;
				default:
					break;			
				}
			}
		}
		System.out.println("共有"+quantity+"個母音");
	}	
}
