package class_9_mianshi;

/**
 * 
 * 
 * StringReverse 创建人:maerhuan 时间：2016年4月1日-下午9:53:28
 * 
 * @version 1.0.0
 * 
 */
public class StringReverse {

	public void swap(char[] arr, int begin, int end) {
		while (begin < end) {
			char temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++;
			end--;
		}
	}

	// I love java
	public  String swapWords(String str) {
		char[] arr = str.toCharArray();
		swap(arr, 0, arr.length - 1);
		int begin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ' ') {
				swap(arr, begin, i - 1);
				begin = i + 1;
			}
		}

		return new String(arr);
	}

	public static void main(String[] args) {
		String str = "I love you";
		//System.out.println(new StringReverse().swapWords(str));
		 //System.out.println(reverse(str));

		//
		// for (int i = str.length() - 1; i >= 0; i--) {
		//
		// char c = str.charAt(i);
		//
		// System.out.print(c);
		// }
	}

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}