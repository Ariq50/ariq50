#Computing GC Content

#Calculates the GC content of a protein

gene = open("BRCA1_SP1.txt", "r")

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




