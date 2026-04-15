public class Word {
    // instance variables
    String originalWord;
    String sortedWord;

    // constructors
    public Word(String originalWord) {
        if (originalWord == null) {
            throw new IllegalArgumentException("Cannot set a word to nothing!");
        }
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    // getters
    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    // inherited methods
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Word)) {
            throw new IllegalArgumentException(
                    "Cannot compare a Word to a different kind of object!");
        }

        Word otherWord = (Word) other;
        if (this.originalWord.equals(otherWord.originalWord)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return originalWord;
    }

    // methods
    public String sortWord() {
        String sortedWord = "";
        char[] compareChars = originalWord.toLowerCase().toCharArray();
        for (int i = 0; i < originalWord.length() - 1; i++) {
            char smallest = compareChars[i];
            int swapIndex = i;

            for (int j = i; j < originalWord.length(); j++) {
                if (smallest > compareChars[j]) {
                    smallest = compareChars[j];
                    swapIndex = j;
                }
            }

            char temp = compareChars[i];
            compareChars[i] = smallest;
            compareChars[swapIndex] = temp;
        }

        for (int i = 0; i < compareChars.length; i++) {
            sortedWord += compareChars[i];
        }

        return sortedWord;
    }
}
