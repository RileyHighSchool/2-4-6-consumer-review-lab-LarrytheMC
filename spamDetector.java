public class spamDetector

{
    public static void main(String[] args)
    {
        System.out.println(spamDetect("spamSample.txt"));
    }

    public static double spamDetect(String fileName)
    {
        String review = Review.textToString(fileName);
        double spamCount = 0.0;
        int wordCount = 0;
    
        while (review.indexOf(" ") > 0)
        {
          int space = review.indexOf(" ");
          String word = review.substring(0, space);
          
          if (word.equals("free") || 
                word.equals("buy") ||
                word.equals("deal") ||
                word.equals("order") ||
                word.equals("cash") ||
                word.equals("money") ||
                word.equals("click") ||
                word.equals("passive") ||
                word.equals("price") ||
                word.equals("fast"))
            {
            spamCount++;
            }
    
          review = review.substring(space+1);
          wordCount++;
          
    
        }
        double totalSpamValue = (spamCount / wordCount);
        return totalSpamValue;


    }
    



}

// look for key words of spam comments
//    - get comment example

//    - run through it and compare it to common spam key words

//    - count total number of words

//    - if a spam word is detected add 1 to a counter and continue looking untill the string is over

//    - divide the spam word counter by the total number of words

//    - determine the likelyhood of spam by the spam value     ex: >.25 or <.25

//    - Print weather the comment is spam or not

//    -
//    -
//    -
//    -


