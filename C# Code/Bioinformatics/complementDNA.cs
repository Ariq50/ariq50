/*
Complementing a Strand of DNA

The following script first request the user to enter a DNA strand. Next the DNA strand entered by the user is reversed and complemented. 
The result is printed to the console.
*/

using System;
using System.Collections.Generic;
using System.Text;

namespace complementDNA
{
    class compDNA
    {
        static void Main(string[] args) 
        {
            Console.WriteLine("Please enter a DNA strand whose complement you would like to find: ");
            
            string userDNAStrand = Console.ReadLine();

            compDNA c = new compDNA();

            Console.WriteLine("The complement of the DNA strand you entered is:");
            Console.WriteLine(c.complementDNAStrand(userDNAStrand));
        }

        public static string Reverse(string text)
        {
            char[] cArray = text.ToCharArray();
            string reverse = String.Empty;

            for (int i = cArray.Length - 1; i > -1; i--)
            {
                reverse += cArray[i];
            }

        return reverse;
        }

        public string complementDNAStrand(string userDNAStrand)
        {
            string newDNAStrand = "";
            int s = userDNAStrand.Length;

            for (int i = 0; i < s; i++)
            {
                if (userDNAStrand[i] == 'A')
                {
                    newDNAStrand += 'T';
                }
                        
                else if (userDNAStrand[i] == 'C')
                {
                     newDNAStrand += 'G';
                }
                       
                else if (userDNAStrand[i] == 'T')
                {
                    newDNAStrand += 'A';
                }
                        
                else if (userDNAStrand[i] == 'G')
                {
                     newDNAStrand += 'C';
                }
                       
            }        
        return compDNA.Reverse(newDNAStrand) ;
        }
    }
}
