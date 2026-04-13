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
    }

    // getters
    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    // methods
    public String sortWord() {
        String sortedWord = "";
        String compareWord = originalWord.toLowerCase();
        for (int i = 0; i < originalWord.length() - 1; i++) {
            char smallest = compareWord.charAt(i);
            int swapIndex = -1;

            for(int j = 1; j < originalWord.length(); j++){
                if(smallest >= compareWord.charAt(j)){
                    smallest = compareWord.charAt(j);
                }
            }

            char temp = compareWord.charAt(i);
            compareWord. = arr[min_idx];
            arr[min_idx] = temp;
        }

        this.sortedWord = sortedWord;
        return sortedWord;
    }
}
