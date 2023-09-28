using System;
using System.Collections.Generic;
using System.Text;
using calcProteinMass;

namespace calcProteinMass
{
    class calcMass 
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter a protein whose mass you want to determine: ");

            string protein = Console.ReadLine();
            double massProtein = 0;

            calcMass c = new calcMass();
            Console.WriteLine("The mass of the protein is:");
            Console.WriteLine("{0:0.00}", c.calcProteinMass(protein));
        }
        public double calcProteinMass(string protein)
        {
            double massProtein = 0;
            int p = protein.Length;

            for (int i = 0; i < p; i++)
            {
                if (protein[i] == 'A')
                {
                    massProtein += 71.03711;
                }
                
                else if (protein[i] == 'C')
                {
                    massProtein += 103.00919;
                }

                else if (protein[i] == 'D')
                {
                    massProtein += 115.02694;
                }

                else if (protein[i] == 'E')
                {
                    massProtein += 129.04259;
                }

                else if (protein[i] == 'F')
                {
                    massProtein += 147.06841;
                }
                
                else if (protein[i] == 'G')
                {
                    massProtein += 57.02146;
                }
                
                else if (protein[i] == 'H')
                {
                    massProtein += 137.05891;
                }
                
                else if (protein[i] == 'I')
                {
                    massProtein += 113.08406;
                }
                
                else if (protein[i] == 'K')
                {
                    massProtein += 128.09496;
                }

                else if (protein[i] == 'L')
                {
                    massProtein += 113.08406;
                }
                
                else if (protein[i] == 'M')
                {
                    massProtein += 131.04049;
                }
                
                else if (protein[i] == 'N')
                {
                    massProtein += 114.04293;
                }
                
                else if (protein[i] == 'P')
                {
                    massProtein += 97.05276;
                }
                
                else if (protein[i] == 'Q')
                {
                    massProtein += 128.05858;
                }
                
                else if (protein[i] == 'R')
                {
                    massProtein += 156.10111;
                }
                
                else if (protein[i] == 'S')
                {
                    massProtein += 87.03203;
                }
                
                else if (protein[i] == 'T')
                {
                    massProtein += 101.04768;
                }
                
                else if (protein[i] == 'V')
                {
                    massProtein += 99.06841;  
                }
                
                else if (protein[i] == 'W')
                {
                    massProtein += 186.07931;
                }
                
                else if (protein[i] == 'Y')
                {
                    massProtein += 163.06333;
                }

                else 
                {
                    Console.WriteLine("Please enter a valid protein.");
                }
            }
        return massProtein;    
        }
    }
}
