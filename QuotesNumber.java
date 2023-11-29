public class QuotesNumber {
    public static int findNumberOfQuotes(String text){
        int quotes=0;
        for (int i=0; i<text.length() ; i++){
            if (text.charAt(i) =='"'){
                quotes++;
            }
        }
        return quotes/2;
    }
    
}
