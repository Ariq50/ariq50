#Computing GC Content

#Calculates the GC content of a protein

import os

file_path = input('Enter the file path for the FASTA file of the protein whose GC content you wish to determine: ');

if(os.path.exists(file_path):
#set the values to 0
	gene = open(file_path, 'r')
	g = 0;
	c = 0;
	a = 0;
	t = 0;
	gene.readline()
	
	for line in gene:
		line = line.lower()
		for char in line:
			if char == "g":
				g += 1
			if char == "a":
				a += 1
			if char == "c":
				c += 1
			if char == "t":
				t += 1

	print ("number of g's:" + str(g))
	print ("number of c's:" + str(c))
	print ("number of a's:" + str(a))
	print ("number of t's:" + str(t))

	gc = (g + c + 0.) / (a + t + g + c + 0.)
	
	print ("gc content:" + str(gc))
else:
	print("Please enter a valid file path.")




