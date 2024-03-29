/*Counting Point Mutations

The following script takes input from the user, in the form of two strings representing two different DNA strands.
A function is then used to iterate through both strings and compare the nucleotide bases in them. If the two characters being compared
do not match, the counter is incremented and the result printed to the console.
*/
using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using pointMutationCounter;

namespace pointMutationCounter
{
    class pointMutCount
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Please enter a DNA strand: ");

            string string_1 = Console.ReadLine();

            Console.WriteLine("Please enter another DNA strand: ");

            string string_2 = Console.ReadLine();

            string_1 = string_1.ToUpper();

            string_2 = string_2.ToUpper();

            pointMutCount p = new pointMutCount();

            Console.WriteLine("The number of point mutations between the two DNA strands is:");

            Console.WriteLine(p.p_m_loop(string_1, string_2));

        }

        public string p_m_loop(string string_1, string string_2)
        {
            int p_mutation = 0;
            int i;
            int l = (string_1.Length - 1);

            for(i = 0; i <= l; i++)
            {
                if(string_1[i] != string_2[i])
                {
                    p_mutation++;
                }
            }
            return p_mutation.ToString();
            
        }
    }
}
