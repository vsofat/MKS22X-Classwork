  public class Feb4{
  
    public static ArrayList<String> makeAllSums(int length){
      ArrayList<String> words = new ArrayList<String>();
      return allWords();
    }
    
    public static void allWords(int length, String word, ArrayList<Integer> all) {
    String letters = "abcdefghijklmnopqrstuvwxyz"
    if (word.length() == length) {
      all.add(word);
    }
    else{
      allSums(n - 1, word + charAt.letters, all);
      allSums(n - 1, word, all);
    }
    
  
  }
