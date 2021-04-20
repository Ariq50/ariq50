#The following script first request the user to enter a DNA strand. Next the DNA strand entered by the user is reversed and complemented. This result is printed to the console.

string = input("Enter the DNA strand you would like to complement:\n")

DNA_upper = string.upper()

complementDNA = (DNA_upper[::-1])

for i in complementDNA:
	if (i == "A"): print("T")
	elif(i == "T"): print("A")
	elif(i == "G"): print("C")
	elif(i == "C"): print("G") 
