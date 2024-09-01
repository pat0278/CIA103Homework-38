//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)
package hw4;

public class HomeWork4_1 {
	public static void main(String[] args) {
		int[]array={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0 ;
		int avg;
		for(int i=0 ; i<array.length;i++) {
			sum+= array[i];
		}
		
		avg = sum / array.length;
		
		System.out.println("平均值為"+avg+"\n大於平均值的元素有:");
		
		for(int i=0 ; i<array.length;i++) {
			if(array[i]>avg) {
				System.out.print(array[i]+"\t");
			}
		}
		
		
			
	}
}