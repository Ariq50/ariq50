//Calculates the melting temperature of a protein

using System;
using System.Collections.Generic;
using System.Text;
using proteinMeltTemp;

namespace proteinMeltTemp
{
    class protMT
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a valid path for the FASTA file of a Protein: ");

            string path = Console.ReadLine();

            string gene = File.ReadAllText(path);

            int g = 0;
            int c = 0;
            int a = 0;
            int t = 0;

            int l = gene.Length;

            for (int i = 0; i < l; i++ )
            {
                if (gene[i] == 'g')
                {
                    g++;
                }
                else if(gene[i] == 'c')
                {
                    c++;
                }
                else if(gene[i] == 'a')
                {
                    a++;
                }
                else if(gene[i] == 't')
                {
                    t++;
                }
            }

            double tm = (2 * (a + t)) + (4 * (g + c));

            Console.WriteLine("The protein's Melting Point is: " + tm);
        }
    } 
    
}
