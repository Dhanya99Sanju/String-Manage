public class RepeatedWordsCount {
    public static int findWordCount(String text,String word){
        int wordCount =0;
        for (int i=0; i<text.length() - word.length() ; i++){
            if (text.substring(i, i + word.length()).equalsIgnoreCase(word)){
                wordCount++;
            }
        }

        return wordCount;

    }
    
}
