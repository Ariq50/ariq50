dnaStrand='GATATATGCATATACTT'

motif='ATAT'

for position in range(len(dnaStrand)):
    if dnaStrand[position:].startswith(motif):
        motifPosition = [position + 1]
        print(*motifPosition)
