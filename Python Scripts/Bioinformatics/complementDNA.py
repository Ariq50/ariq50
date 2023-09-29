#Complementing a Strand of DNA

#The following script first request the user to enter a DNA strand. Next the DNA strand entered by the user is reversed and complemented. 
#The result is printed to the console.

string = input("Enter the DNA strand you would like to know the complement of:\n")

DNA_upper = string.upper()

complementDNA = (DNA_upper[::-1])

def complementDNAStrand(complementDNA):
        newDNAStrand = ""
        for i in range(0, len(complementDNA)):
                if complementDNA[i] == "A":
                        newDNAStrand += "T"
                elif complementDNA[i] == "C":
                        newDNAStrand += "G"
                elif complementDNA[i] == "T":
                        newDNAStrand += "A"
                elif complementDNA[i] == "G":
                        newDNAStrand += "C"
        return newDNAStrand[::-1]
print(*complementDNAStrand(complementDNA))

