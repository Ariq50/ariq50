using System;
using System.Collections.Generic;
using System.Text;

namespace findMotif
{
    class findMot
    {
        
       public static void Main(string[] args)
        {
            string str = "";
            
            Console.WriteLine("Please enter a DNA strand (no longer than 1000 nt in length): ");

            string dnaStrand = Console.ReadLine();

            Console.WriteLine("Please enter a motif to search for in the DNA strand: ");

            string motif = Console.ReadLine();

            findMot f = new findMot();

            Console.WriteLine("The motif start positions in the DNA strand are: ");

            f.fndMot(dnaStrand, motif);
        }

        public void fndMot(string dnaStrand, string motif)
        {
            int d = dnaStrand.Length;
            List<int> motifPosition = new List<int>(); 

            for(int i = 0; i < d; i++)
            {
                if(dnaStrand.Substring(i).StartsWith(motif))
                {
                    motifPosition.Add(i + 1);
                    int[] c = motifPosition.ToArray();
                    foreach(var item in c)
                        {
                            Console.WriteLine(item.ToString());
                        }
                }
            }
        }
    }
}
