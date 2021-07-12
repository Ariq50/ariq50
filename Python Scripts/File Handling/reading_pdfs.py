import PyPDF2
import os

os.chdir('c:\\users\\sophytes\\documents')

pdfFile = open('Find_the_Phone_Number.pdf')

reader = PyPDF2.PdFileReader(pdfFile)

reader.numPages

page = reader.getPage(0)

page.extractText()

for pageNum in range(reader.numPages):
    print(reader.getPage(pageNum).extractText()
