package corejava;

public class Assignment {

	String sentence = "Today is the darkest day";
	String city = "London";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment assign = new Assignment();
		System.out.println("Here is your longest word is: " + assign.longestWord() + " with lenght: "
				+ assign.longestWord().length());

	}

	public String longestWord() {

		String[] words = sentence.split(" ");
		String longestWord = null;
		int wordLength = 0;

		for (int i = 0; i < words.length; i++) {

			int actualWordLength = words[i].length();

			if (actualWordLength > wordLength) {

				longestWord = words[i];
				wordLength = words[i].length();

			}

		}

		return longestWord;

	}

}

