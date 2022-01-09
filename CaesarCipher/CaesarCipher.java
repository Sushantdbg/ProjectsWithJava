import java.util.Scanner;

class CaesarCipher
{
    // Encrypts text using a shift of s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the Text : ");
        String text = in.nextLine();
        System.out.print("Please enter the Shift : ");
        int s = in.nextInt();
        System.out.print("Cipher : " + encrypt(text, s));
    }
}