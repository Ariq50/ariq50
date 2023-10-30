using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using ntCounter;

namespace ntCounter
{
        class ntCount
        {
                public static void  Main(string[] args)
            {
                Console.WriteLine("Please enter a DNA strand (no longer than 1000 nt) whose nucleotide count you would like to know: ");

                string dnaStrand = Console.ReadLine();
                int d = dnaStrand.Length;

                for(int j = 0; j < d; j++)
                {
                    if(d <= 1000 && (dnaStrand.Contains('A') || dnaStrand.Contains('C') || dnaStrand.Contains('T') || dnaStrand.Contains('G')))
                    {
                        Console.WriteLine("The nucleotide counts for the DNA strand entered are (A, C, G, and T): ");
                        ntCount.ntLoop(dnaStrand);
                    } else {
                Console.WriteLine("Please enter a valid DNA strand (contains A, C, T, G) with less than 1000 nt.");
                    }  
                }
            }
            public static void ntLoop(string dnaStrand)
            {
            int nt_A = 0;
            int nt_C = 0;
            int nt_G = 0;
            int nt_T = 0;
            
            int d = dnaStrand.Length;

            for(int i = 0; i < d; i++)
            {
                if(dnaStrand[i] == 'A')
                {
                    nt_A += 1;
                }
                else if(dnaStrand[i] == 'C')
                {
                    nt_C += 1;
                }
                else if(dnaStrand[i] == 'G')
                {
                    nt_G += 1;
                }
                else if(dnaStrand[i] == 'T')
                {
                    nt_T += 1;
                }
            }
            Console.WriteLine("A: " + nt_A);
            Console.WriteLine("C: " + nt_C);
            Console.WriteLine("G: " + nt_G);
            Console.WriteLine("T: " + nt_T);
            }
        }
    }
   
