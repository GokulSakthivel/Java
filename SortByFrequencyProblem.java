import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class SortByFrequencyProblem{

	private static void sortByFrequency(int[] arr) {
		Map<Integer, Integer> frequencyMap = createFrequencyMap(arr);

		List<Entry<Integer, Integer>> entryList = sortByValue(frequencyMap);

		putSortedElementsBackInArray(arr, entryList);
	}

	private static Map<Integer, Integer> createFrequencyMap(int[] arr) {
		Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (frequencyMap.containsKey(key)) {
				frequencyMap.put(key, frequencyMap.get(key) + 1);
			} else {
				frequencyMap.put(key, 1);
			}
		}
		return frequencyMap;
	}

	private static List<Entry<Integer, Integer>> sortByValue(
			Map<Integer, Integer> frequencyMap) {
		List<Entry<Integer, Integer>> entryList = new ArrayList<Entry<Integer, Integer>>(
				frequencyMap.entrySet());
		Collections.sort(entryList,
				new Comparator<Map.Entry<Integer, Integer>>() {

					@Override
					public int compare(Entry<Integer, Integer> o1,
							Entry<Integer, Integer> o2) {
						return o2.getValue().compareTo(o1.getValue());
					}
				});
		return entryList;
	}

	private static void putSortedElementsBackInArray(int[] arr,
			List<Entry<Integer, Integer>> list) {
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : list) {
			for (int i = 0; i < entry.getValue(); i++) {
				arr[index++] = entry.getKey();
			}
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
		sortByFrequency(arr);
		printArray(arr);
	}
}
