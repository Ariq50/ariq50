#Counting Point Mutations

#The following script takes input from the user, in the form of two strings representing two different DNA strands.
#A function is then used to iterate through both strings and compare the nucleotide bases in them. If the two characters being compared
#do not match, the counter is incremented and the result printed to the console.

string_1 = input("Please enter a DNA strand:")

string_2 = input("Please enter another DNA strand:")

string_1_upper = string_1.upper()

string_2_upper = string_2.upper()
#function for comparing two strings and counting number of differing characters (Hamming Distance):
def p_m_loop(string_1, string_2):
	p_mutation = 0
	for position in range(len(string_1)):
		if string_1[position] != string_2[position]:
			p_mutation += 1
	return p_mutation
print(p_m_loop(string_1, string_2))
	

