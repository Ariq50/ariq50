using System;
using System.Text.RegularExpressions;

public class Solution {
    public bool IsPalindrome(string s) {
        bool validPalindrome = false;

        s = Regex.Replace(s, "[^a-zA-Z0-9]", String.Empty);
        s = s.ToLower();

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
