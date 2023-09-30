/*
Transcribing DNA into RNA

The following script transcribes the base DNA strand into RNA, using the Replace function of the String class in C#

to replace the T's (thymine's) with U's (uracil's). The result is then printed to the console.
*/
using System;
using System.Collections.Generic;
using System.Text;
using dnaIntoRNA;

namespace dnaIntoRNA
{
    class dnaToRNA
    {
    static void Main(string[] args)
        {
            Console.WriteLine("Please enter a DNA strand to convert to its RNA equivalent: ");

            string base_str = Console.ReadLine();

            dnaToRNA d = new dnaToRNA();

            Console.WriteLine("The RNA equivalent of the DNA strand you entered is: ");
            Console.WriteLine(d.rnaEquivalent(base_str));
        }

    public string rnaEquivalent(string base_str)
        {
            string temp = base_str.Replace("T", "U");
            return temp;
        }
    }    
}
