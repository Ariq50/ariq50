public class Solution {
    public int LengthOfLastWord(string s) {
        s = s.Trim(' ');
        string lastWord = s.Split(' ').Last();

        return lastWord.Length;
    }
}
