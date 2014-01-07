public class Final {
	public static void main(String[] args) {
		System.out.println(recombine("apple", "pear"));

		String[] test = {"apple", "pear", "this", "cat"};
		mixedWords(test);
	}

	public static String recombine(String word1, String word2) {
		String finalString = "";
		int halfWord = word1.length()/2;
		finalString += word1.substring(0, halfWord);
		int halfWord2 = word2.length() / 2;
		if (halfWord2 % 2 == 0) {
			finalString += word2.substring(halfWord2, word2.length());
		} else {
			halfWord2 = word2.length() / 2;
			finalString += word2.substring(halfWord2, word2.length());
		}
		return finalString;
	}

	public static String[] mixedWords(String[] words) {
		String[] finishedWords = new String[words.length];
		for (int i=0; i<words.length - 1; i += 2) {
			finishedWords[i] = recombine(words[i], words[i+1]);
			finishedWords[i+1] = recombine(words[i+1], words[i]);
		}

		for (int i=0; i<finishedWords.length; i++) {
			System.out.println(finishedWords[i]);
		}

		return finishedWords;
	}
}