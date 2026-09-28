public class SplitSentence
{
    public static void main(String args[])
    {
        String sentence = "Java is very easy";

        String[] words = sentence.split(" ");

        System.out.println("Words:");
        for(int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }

        String newSentence = String.join("-", words);

        System.out.println("New format: " + newSentence);
    }
}
