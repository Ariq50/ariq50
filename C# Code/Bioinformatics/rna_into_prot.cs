/*Translating RNA into Protein

The following script takes user input, in the form of a string representing an RNA strand and converts it into the corresponding protein string, 
using a switch-case statement to represent the RNA Codon Table and a for loop to iterate through the RNA strand, breaking it into three element
substrings to check in the switch-case statement, for building a new string representing the corresponding proteins. 
The result is then printed to the console.
*/
using System;
using System.Collections.Generic;
using System.Text;
using rnaIntoProtein;

namespace rnaIntoProtein
{
    class rnaIntoProt
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter the RNA strand you would like to convert into a Protein:");

            string rna = Console.ReadLine();

            string strand = rna.ToUpper();
            
            string protein = "";
           
           for (var i = 0; i < strand.Length; i += 3)
            {
                 var codon = strand.Substring(i, Math.Min(3, strand.Length - i));
                 switch (codon)
                {
                    case "GCU": 
                    case "GCC": 
                    case "GCA": 
                    case "GCG": 
                    
                    protein += "A";
                    break;

                    case "UGU":
                    case "UGC":
                    
                    protein += "C";
                    break;

                    case "GAU": 
                    case "GAC": 

                    protein += "D";
                    break;

                    case "GAA": 
                    case "GAG":

                    protein += "E";
                    break;

                    case "UUU":
                    case "UUC":

                    protein += "F";
                    break;

                    case "GGU": 
                    case "GGC": 
                    case "GGA": 
                    case "GGG":

                    protein += "G";
                    break;

                    case "CAU": 
                    case "CAC":

                    protein += "H";
                    break;

                    case "AUA": 
                    case "AUU": 
                    case "AUC":

                    protein += "I";
                    break;

                    case "AAA": 
                    case "AAG":

                    protein += "K";
                    break;

                    case "UUA":
                    case "UUG":
                    case "CUU":
                    case "CUC":
                    case "CUA":
                    case "CUG":

                    protein += "L";
                    break;

                    case "AUG":
                    
                    protein += "M";
                    break;

                    case "AAU": 
                    case "AAC":

                    protein += "N";
                    break;

                    case "CCU": 
                    case "CCC": 
                    case "CCA": 
                    case "CCG":

                    protein += "P";
                    break;

                    case "CAA": 
                    case "CAG":

                    protein +="Q";
                    break;

                    case "CGU":
                    case "CGC":
                    case "CGA":
                    case "CGG":
                    case "AGA":
                    case "AGG": 
                    
                    protein += "R";
                    break;

                    case "UCU":
                    case "UCC":
                    case "UCA":
                    case "UCG":
                    case "AGU":
                    case "AGC":

                    protein += "S";
                    break;

                    case "ACU": 
                    case "ACC": 
                    case "ACA": 
                    case "ACG":

                    protein += "T";
                    break;

                    case "GUU": 
                    case "GUC": 
                    case "GUA": 
                    case "GUG":

                    protein += "V";
                    break;

                    case "UGG":

                    protein += "W";
                    break;
                    
                    case "UAU":
                    case "UAC":

                    protein += "Y";
                    break;
                    
                    case "UAA": 
                    case "UAG": 
                    case "UGA":
                    
                    protein += "*";
                    break;
                }
            }
            Console.WriteLine(protein);
        }
    }
}
