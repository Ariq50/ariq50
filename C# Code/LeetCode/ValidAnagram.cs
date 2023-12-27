public class Solution {
    public bool IsAnagram(string s, string t) {
        bool isAnagram = false;

        char[] S = s.ToArray();
        Array.Sort<char>(S);

        char[] T = t.ToArray();
        Array.Sort<char>(T);

        if(T.SequenceEqual(S))
        {
            isAnagram = true;
        }

        return isAnagram;
    }
}
