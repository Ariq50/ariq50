'''
Course: CIS 117 Python Programming
Term: Summer 2023 
Student: Kian Sattar
Version: Python 3.11.4 
Description: Program that translates text messages to English.
I would like the grade for this optional assignment to replace my grade for
Lab Assignment 3.
Date: 8/1/2023
'''
# import punctuations from string
# `punctuation` is just a string containing all the punctuations
from string import punctuation

# open and read the file
f = open(r'C:\Users\kian_\Downloads\testabbrev.txt', 'r')
lines = f.readlines()
# close the file
f.close()

# initialize an empty dictionary to store the abbreviations and phrases
# here, abbreviation will be key and phrase will be its corresponding value
translation_map = dict()

# populate the `translation_map` dictionary
for line in lines:
    # for each line, strip it to remove any new line characters and split it on ':'
    # and store the abbrev and phrase
    abbrev, phrase = line.strip().split(':')
    # add abbrev and phrase to dictionary
    translation_map[abbrev] = phrase


# ask the user to enter the abbreviation to be translated
abbrev = input('Enter a message to be translated:\n')
# clean the abbreviation
# it will remove punctuations (if any) from both ends
# if there are no punctuations, it will be left as such
cleaned_abbrev = abbrev.strip(punctuation)

# check if `abbrev` is present in dictionary
if cleaned_abbrev in translation_map.keys():
    # if true, get the corresponding phrase
    phrase = translation_map[cleaned_abbrev]
    # replace the `cleaned_abbrev` with `phrase` in `abbrev` so that punctuations are left intact
    result = abbrev.replace(cleaned_abbrev, phrase)
else:
    # if `abbrev` is not present in dictionary, set result to be the `abbrev` (the original user input)
    result = abbrev

# print the result
print('The translated text is: ' + result)
'''
Enter a message to be translated:
app
The translated text is: application

Enter a message to be translated:
nbd
The translated text is: no big deal

Enter a message to be translated:
plz
The translated text is: please

Enter a message to be translated:
plz!
The translated text is: please!

Enter a message to be translated:
car
The translated text is: car
'''
