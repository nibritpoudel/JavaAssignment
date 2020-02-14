
package Week3project;
public class Recurssive_Function_Reversedstring_Nibriti {

    public static void main(String[] args) {
        String sentence = "Hello, My name is Nibriti Poudel";
        System.out.println("The reversed string of the sentence is " + Sentencereverse(sentence));
    }

    public static String Sentencereverse(String sentence)
    {
        if (sentence.isEmpty())
            return sentence;
        return Sentencereverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
