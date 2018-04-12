import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnagramFinder {
	static ArrayList<String> words = new ArrayList<String>();
	ArrayList<String> anagrams = new ArrayList<String>();

	public static void main(String[] args) {
		AnagramFinder a = new AnagramFinder();
		try {
			Scanner scan = new Scanner(new File("dictionary.txt"));
			while (scan.hasNext()) {
				words.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.setUI();
	}

	void setUI() {
		String word = JOptionPane.showInputDialog("What word do you want to find anagrams of?");

		anagramFinder(word);

		for (int i = 0; i < anagrams.size(); i++) {
			String str = anagrams.get(i);
			System.out.println(str);
		}
	}

	void anagramFinder(String a) {
		char[] c1 = a.toCharArray();
		Arrays.sort(c1);
		String x = new String(c1);

		for (String y : words) {
			char[] c2 = y.toCharArray();
			String z = y;
			Arrays.sort(c2);
			y = new String(c2);

			if (x.equals(y)) {
				anagrams.add(z);
			}
		}
	}
}