
string_1 = input("Please enter a DNA strand:")

string_2 = input("Please enter another DNA strand:")

string_1_upper = string_1.upper()

string_2_upper = string_2.upper()

def p_m_loop(string_1, string_2):
	p_mutation = 0
	for position in range(len(string_1)):
		if string_1[position] != string_2[position]:
			p_mutation += 1
	return p_mutation
print(p_m_loop(string_1, string_2))
	

