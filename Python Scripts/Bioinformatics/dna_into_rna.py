#Transcribing DNA into RNA

#The following script transcribes the base DNA strand into RNA, using the replace function of Python

#to replace the T's (thymine's) with U's (uracil's). The result is then printed to the console.

base_str = input("Please enter a DNA strand to convert to its RNA equivalent:")

result = base_str.replace('T', 'U')

print(result)
