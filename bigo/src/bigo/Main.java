package bigo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// O(N)
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		for (Integer s : list) {
			System.out.println("Number: " + s);
		}

		// O(n^2)
		int[][] array = new int[4][4];
		// let's loop through array to populate board
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = row * col;
			}
		}
		// Let's loop through array to print each row and column
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = row * col;
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}

		// O(log n) Help with this.
		ArrayList<Integer> logList = new ArrayList<Integer>();
		int num = 15;
		int j = logList.size() / 2;
		for (int i = 0; i < logList.size(); i++) {
			if (logList.get(j) > num) {
				j = j / 2;
			} else if (logList.get(j) < num) {
				j = (j / 2) + (logList.size() / 2);
			} else {
				System.out.println(j);
				break;
			}
		}

	}

}

// References:
// https://www.journaldev.com/33297/java-list-add-addall-methods 
// https://www.youtube.com/watch?v=CB8JPjg_3cM&list=TLPQMTgwNjIwMjHa2hZ8z1lgiA&index=1
// https://www.youtube.com/watch?v=V6mKVRU1evU&list=TLPQMTgwNjIwMjHa2hZ8z1lgiA&index=6
// Done!