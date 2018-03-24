import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnagramFinder {
	ArrayList<String> words;
	public static void main(String[] args) {
		words = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(new File("dictionary.txt"));
			while(scan.hasNext()) {
				words.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void anagramFinder(String a) {
		for(String b : words) {
			
		}
	}

}
