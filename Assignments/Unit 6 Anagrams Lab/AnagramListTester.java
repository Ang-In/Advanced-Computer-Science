import java.util.ArrayList;

public class AnagramListTester {
    public static void main(String[] args) {
        AnagramList testList = setup();
        String testKey = "god";
        ArrayList<Word> testAnagrams = testList.searchAnagrams(testKey);
        System.out.println(testAnagrams);
    }

    public static AnagramList setup() {
        Word w1 = new Word("apple");
        Word w2 = new Word("banana");
        Word w3 = new Word("cat");
        Word w4 = new Word("dog");
        Word w5 = new Word("ding");

        AnagramList newList = new AnagramList();
        newList.add(w1);
        newList.add(w2);
        newList.add(w3);
        newList.add(w4);
        newList.add(w5);

        return newList;
    }
}
