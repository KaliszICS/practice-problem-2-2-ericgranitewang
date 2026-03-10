import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	
	public static int[] compareStringSearch(String[] array, String word) {
		int[] sus = new int[2];
		sus[0] = -1;
		sus[1] = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(word)) {
				sus[0] = i + 1;
				break;
			}
		}
		if (sus[0] == -1) {
			sus[0] = array.length;
		}
		int loops = 1;
		int min = 0;
		int max = array.length - 1;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		while (max >= min) {
			int mid = (max+min)/2;
			if (list.get(mid).equals(word)) {
				sus[1] = loops;
				break;
			} else if (list.get(mid).compareTo(word) > 0) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			loops++;
		}
		if (sus[1] == -1) {
			sus[1] = loops - 1;
		}
		return sus;
	}

	public static int[] compareSearch(int[] array, int number) {
		int[] sus = new int[2];
		sus[0] = -1;
		sus[1] = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				sus[0] = i + 1;
				break;
			}
		}
		if (sus[0] == -1) {
			sus[0] = array.length;
		}
		int loops = 1;
		int min = 0;
		int max = array.length - 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		while (max >= min) {
			int mid = (max+min)/2;
			if (list.get(mid) == number) {
				sus[1] = loops;
				break;
			} else if (list.get(mid) > number) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
			loops++;
		}
		if (sus[1] == -1) {
			sus[1] = loops - 1;
		}
		return sus;
	}
}
