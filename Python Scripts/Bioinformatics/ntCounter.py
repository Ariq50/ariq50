dnaStrand = input("Please enter a DNA strand (no longer than 1000 nt) whose nucleotide count (# of A's, C's, etc.) you would like to know: \n")

valid = 'ACTG'

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

for letter in dnaStrand:
    if(len(dnaStrand) <= 1000 and letter in dnaStrand in valid):
        print(*nt_loop(dnaStrand))
else:
    print("Please enter a valid DNA strand (contains A, C, T, G) with less than 1000 nt")
