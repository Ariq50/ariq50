#Calculates the melting temperature of a protein

import os

file_path = input('Enter the file path for the FASTA file of the protein whose GC content you wish to determine: ');

if(os.path.exists(file_path):
	gene = open(file_path, "r")
	#set the values to 0
	g = 0;
	c = 0;
	a = 0;
	t = 0;
	#skip the first line of header
	gene.readline()

	for line in gene:
		line = line.lower()
		for char in line:
			if char == g:
				g += 1
			if char == a:
				a += 1
			if char == c:
				c += 1
			if char == t:
				t += 1
	
	tm = (2 * (a + t) + .0) + (4 * (g + c) + .0)
	
	print ("melting temperature:" + str(tm))
else:
	print("Please enter a valid file path.")




