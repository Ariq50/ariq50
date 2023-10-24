/*
Computing GC Content

Calculates the GC content of a protein
*/

using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace gcContent
{
    class gcCont
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

            Console.WriteLine("The number of Guanines: " + g);
            Console.WriteLine("The number of Cytosines: " + c);
            Console.WriteLine("The number of Adenines: " + a);
            Console.WriteLine("The number of Thiamines: " + t);

            double gc = (g + c) / (g + c + a + t);

            Console.WriteLine("The protein's GC content is: " + gc);
        }
    } 
    
}
