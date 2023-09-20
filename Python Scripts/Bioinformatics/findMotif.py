dnaStrand = input('Please enter a DNA strand (no longer than 1000 nt in length):')

motif = input('Please enter a motif to search for in the DNA strand:')

def findMotif(dnaStrand, motif):
    for position in range(len(dnaStrand)):
        if dnaStrand[position:].startswith(motif):
            motifPosition = [position + 1]
            print(*motifPosition)

findMotif(dnaStrand, motif)
