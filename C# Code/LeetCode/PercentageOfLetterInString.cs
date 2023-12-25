public class Solution {
    public int PercentageLetter(string s, char letter) {

        int counter = 0;
        int percentage = 0;

        for(int i = 0; i < s.Length; i++)
        {
            if(s[i] == letter)
            {
                counter++;
            }
        }

        percentage = (int)Math.Round((double)(100 * counter) / s.Length);

        return percentage;
    }
}
