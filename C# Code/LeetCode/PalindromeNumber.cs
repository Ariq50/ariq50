public class Solution {
    public bool IsPalindrome(int x) {
        bool validPalindrome = false;
        string s = "";

        s = x.ToString();

        char[] stringArray = s.ToCharArray();
        Array.Reverse(stringArray);
        string reversedStr = new string(stringArray);

        if(reversedStr == s)
        {
            validPalindrome = true;
        }
        return validPalindrome;

    }
}
