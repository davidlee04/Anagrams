import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnagramFinder {
	static ArrayList<String> words = new ArrayList<String>(); 

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new File("dictionary.txt"));
			while (scan.hasNext()) {
				words.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	ArrayList<String>anagramFinder(String a) {
		boolean isAnagram = true;
		
		String finalAnagram = "";
		
		ArrayList<String> anagrams = new ArrayList<String>();
		ArrayList<Character> anagram = new ArrayList<Character>();
		ArrayList<Character> comparedWord = new ArrayList<Character>();

		for (int i = 0; i < a.length(); i++) {
			anagram.add(a.charAt(i));
		}

		for (String b : words) {
			for (int j = 0; j < b.length(); j++) {
				comparedWord.add(b.charAt(j));
			}
			if (comparedWord.size() == anagram.size()) {
				for (int i = 0; i < anagram.size(); i++) {
					for (int k = 0; k < comparedWord.size(); k++) {
						if (anagram.get(i) == comparedWord.get(k)) {
							comparedWord.set(k, '^');
						}
					}
				}

			}
			for (Character c : comparedWord) {
				if(c != '^') {
					isAnagram = false;
				}
				if(isAnagram == true) {
					for (int i = 0; i < comparedWord.size(); i++) {
						finalAnagram+=comparedWord.get(i);
						anagrams.add(finalAnagram);
					}
				}
			}

		}
		return anagrams;
	}

}
