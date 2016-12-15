package toolsUtils;

public class SortUtil {
	

	/**
	 * 
	 * 冒泡排序 Tools 方法名：BubbleSort 创建人：maerhuan 时间：2016年3月29日-上午12:45:31
	 * 
	 * @param array
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void BubbleSort(Integer[] array) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			boolean mark = true;
			for (int j = 0; j < len - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					mark = false;
				}
			}
			if (mark == true)
				break;
		}

	}

	/**
	 * 
	 * 选择排序 Tools 方法名：SelectSort 创建人：maerhuan 时间：2016年3月29日-上午12:45:47
	 * 
	 * @param array
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public static void SelectSort(Integer[] array) {
		int len = array.length;
		int minIndex = 0;
		for (int i = 0; i < len; i++) {
			minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}

	}

	/**
	 * 
	 * 快速排序 Tools 方法名：quickSort 创建人：maerhuan 时间：2016年3月29日-上午12:46:07
	 * 
	 * @param numbers
	 * @param start
	 * @param end
	 *            void
	 * @exception
	 * @since 1.0.0
	 */

	public static void quickSort(Integer[] numbers, int start, int end) {
		if (start < end) {
			int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
			int temp; // 记录临时中间值
			int i = start, j = end;
			do {
				while ((numbers[i] < base) && (i < end))
					i++;
				while ((numbers[j] > base) && (j > start))
					j--;
				if (i <= j) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
			if (start < j)
				quickSort(numbers, start, j);
			if (end > i)
				quickSort(numbers, i, end);
		}
	}

	/**
	 * 
	 * 插入排序 Tools 方法名：insertSort 创建人：maerhuan 时间：2016年3月29日-上午12:49:07
	 * 
	 * @param numbers
	 *            void
	 * @exception
	 * @since 1.0.0
	 *        <ul>
	 *        <li>从第一个元素开始，该元素可以认为已经被排序</li>
	 *        <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
	 *        <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
	 *        <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
	 *        <li>将新元素插入到该位置中</li>
	 *        <li>重复步骤2</li>
	 *        </ul>
	 */
	public static void insertSort(Integer[] numbers) {
		int size = numbers.length, temp, j;
		for (int i = 1; i < size; i++) {
			temp = numbers[i];
			for (j = i; j > 0 && temp < numbers[j - 1]; j--)
				numbers[j] = numbers[j - 1];
			numbers[j] = temp;
		}
	}

	/**
	 * 
	 * 归并排序 Tools 方法名：mergeSort 创建人：maerhuan 时间：2016年3月29日-上午12:53:46
	 * 
	 * @param numbers
	 * @param left
	 * @param right
	 *            void
	 * @exception
	 * @since 1.0.0
	 *        <ul>
	 *        <li>申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列</li>
	 *        <li>设定两个指针，最初位置分别为两个已经排序序列的起始位置</li>
	 *        <li>比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置</li>
	 *        <li>重复步骤3直到某一指针达到序列尾</li>
	 *        <li>将另一序列剩下的所有元素直接复制到合并序列尾</li>
	 *        </ul>
	 */
	public static void mergeSort(Integer[] numbers, int left, int right) {
		int t = 1;// 每组元素个数
		int size = right - left + 1;
		while (t < size) {
			int s = t;// 本次循环每组元素个数
			t = 2 * s;
			int i = left;
			while (i + (t - 1) < size) {
				merge(numbers, i, i + (s - 1), i + (t - 1));
				i += t;
			}
			if (i + (s - 1) < right)
				merge(numbers, i, i + (s - 1), right);
		}
	}

	/**
	 * 
	 * 归并算法的实现 Tools 方法名：merge 创建人：maerhuan 时间：2016年3月29日-上午12:54:18
	 * 
	 * @param data
	 * @param p
	 * @param q
	 * @param r
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	private static void merge(Integer[] data, int p, int q, int r) {
		int[] B = new int[data.length];
		int s = p;
		int t = q + 1;
		int k = p;
		while (s <= q && t <= r) {
			if (data[s] <= data[t]) {
				B[k] = data[s];
				s++;
			} else {
				B[k] = data[t];
				t++;
			}
			k++;
		}
		if (s == q + 1)
			B[k++] = data[t++];
		else
			B[k++] = data[s++];
		for (int i = p; i <= r; i++)
			data[i] = B[i];
	}

}