dnaStrand = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"

def nt_loop(dnaStrand):
    nt_A = 0
    nt_C = 0
    nt_G = 0
    nt_T = 0
	
    for position in range(len(dnaStrand)):
        if dnaStrand[position] == "A":
            nt_A += 1
        elif dnaStrand[position] == "C":
            nt_C += 1
        elif dnaStrand[position] == "G":
            nt_G += 1
        elif dnaStrand[position] == "T":
            nt_T += 1
        nt_num = [nt_A, nt_C, nt_G, nt_T]
    return nt_num

print(*nt_loop(dnaStrand))
