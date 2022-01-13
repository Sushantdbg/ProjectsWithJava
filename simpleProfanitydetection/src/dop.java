public class dop{
    public static void main(String[] args)
    {
        //Starting a String with the reference array that is to be used later to check on and detect profanity
        String badWords="retard dumb stupid mental idiot";
        String[] badWordsArray=badWords.split(" ");
        /* Here I'm using the input directly but this can be taken from a text file with buffered reader
         as well as this same can be applied to the badWords reference file
         */
        String input="This project is stupid and dumb";
        String[] inputArray= input.split(" ");
        boolean isProfanity =false;
        for(int i=0;i<=inputArray.length-1;i++)
        {
            for(int j=0;j<=badWordsArray.length-1;j++)
            {
                if(inputArray[i].equals(badWordsArray[j]))
                {
                    System.out.println("Found the word ''"+badWordsArray[j]+"'' that exists in our directory as a classified Profanity ");
                    //gives out result via standard output with confirmation of profanity (if found)
                    isProfanity =true;
                }
            }
        }
        if(!isProfanity)
        {
            System.out.println("No profanity found");
        }
    }
}