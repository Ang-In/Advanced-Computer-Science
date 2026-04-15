import java.util.AbstractList;
import java.util.ArrayList;

public class AnagramList extends AbstractList {
    // instance variables
    ArrayList<Word> wordList;

    // constructors
    public AnagramList() {
        wordList = new ArrayList<Word>();
    }

    // getters


    // inherited methods
    @Override
    public int size() {
        return wordList.size();
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > wordList.size()) {
            throw new IllegalArgumentException("Invalid Index!");
        }
        return wordList.get(index);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AnagramList)) {
            throw new IllegalArgumentException(
                    "Cannot compare an AnagramList to a different type of object!");
        }

        AnagramList otherList = (AnagramList) other;
        if (wordList.size() != otherList.size()) {
            return false;
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (!(wordList.get(i).equals(otherList.get(i)))) {
                return false;
            }
        }

        return true;
    }



    // methods
    public boolean add(Word word) {
        if (word == null || word.originalWord.isEmpty()) {
            throw new IllegalArgumentException("Cannot add a nonexistent word!");
        }

        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1 == null || word2 == null) {
            throw new IllegalArgumentException("Cannot compare nonexistent words!");
        }
        if (word1.originalWord.isEmpty() || word2.originalWord.isEmpty()) {
            throw new IllegalArgumentException("Cannot compare empty words!");
        }

        if (word1.sortedWord.equals(word2.sortedWord)) {
            return true;
        }

        return false;
    }

    public ArrayList<Word> searchAnagrams(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Cannot search for anagrams to a nonexistent word!");
        }
        if (wordList.isEmpty()) {
            return new ArrayList<Word>();
        }

        ArrayList<Word> anagrams = new ArrayList<Word>();
        Word keyword = new Word(key);
        for (Word word : wordList) {
            if (checkAnagram(keyword, word)) {
                anagrams.add(word);
            }
        }

        return anagrams;
    }
}
