public class LC58 {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 =  "   fly me   to   the moon  ";
        String s3 =  "luffy is still joyboy";

        System.out.println(lastWordLength(s1));
        System.out.println(lastWordLength(s2));
        System.out.println(lastWordLength(s3));
    }

    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //
    //A word is a maximal
    //substring
    // consisting of non-space characters only.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "Hello World"
    //Output: 5
    //Explanation: The last word is "World" with length 5.
    //Example 2:
    //
    //Input: s = "   fly me   to   the moon  "
    //Output: 4
    //Explanation: The last word is "moon" with length 4.
    //Example 3:
    //
    //Input: s = "luffy is still joyboy"
    //Output: 6
    //Explanation: The last word is "joyboy" with length 6.
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 104
    //s consists of only English letters and spaces ' '.
    //There will be at least one word in s

    public static int lastWordLength(String s){
        int count = 0;

        int n = s.length() -1;

        if(s.charAt(n) == ' '){
            while(s.charAt(n)==' '){
                n--;
            }
        }

        for(int i = n;i>=0;i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}
