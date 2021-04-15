#Calculates the melting temperature of a protein

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




