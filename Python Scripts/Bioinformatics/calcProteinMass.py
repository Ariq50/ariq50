#This script calculates the mass of a protein. The user is requested to enter the protein whose mass they want to calculate. A function
#(calcProteinMass(protein) is called and the protein string is passed to it as a parameter. The function iterates through the string
#parameter and moves through a series of if-else-if statements, summing up the mass of the protein, in accordance with the mass values
#associated with the different components of the protein. The mass of the protein is then printed to the console. 

protein = input("Please enter a protein whose mass you want to determine: ")

def calcProteinMass(protein):
    massProtein = 0

    for i in range(0, len(protein)):
            if protein[i] == 'A':
                massProtein += 71.03711
            elif protein[i] == 'C':
                massProtein += 103.00919
            elif protein[i] == 'D':
                massProtein += 115.02694
            elif protein[i] == 'E':
                massProtein += 129.04259
            elif protein[i] == 'F':
                massProtein += 147.06841
            elif protein[i] == 'G':
                massProtein += 57.02146
            elif protein[i] == 'H':
                massProtein += 137.05891
            elif protein[i] == 'I':
                massProtein += 113.08406
            elif protein[i] == 'K':
                massProtein += 128.09496
            elif protein[i] == 'L':
                massProtein += 113.08406
            elif protein[i] == 'M':
                massProtein += 131.04049
            elif protein[i] == 'N':
                massProtein += 114.04293
            elif protein[i] == 'P':
                massProtein += 97.05276
            elif protein[i] == 'Q':
                massProtein += 128.05858
            elif protein[i] == 'R':
                massProtein += 156.10111
            elif protein[i] == 'S':
                massProtein += 87.03203
            elif protein[i] == 'T':
                massProtein += 101.04768
            elif protein[i] == 'V':
                massProtein += 99.06841
            elif protein[i] == 'W':
                massProtein += 186.07931
            elif protein[i] == 'Y':
                massProtein += 163.06333
            else:
                print("Please enter a valid protein.")
    return(massProtein)

print("The protein's mass is: " + "%3.3f" % calcProteinMass(protein))
