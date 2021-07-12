import PyPDF2

pdf1File = open('Find_The_Phone_Number.pdf', 'rb')

pdf2File = open('Working_Business_Proposal.pdf', 'rb')

reader1 = PyPDF2.PdfFileReader(pdf1File)

reader2 = PyPDF2.PdfFileReader(pdf2File)

writer = PyDF2.PdfFileWriter()

for pageNum in range(reader1.numPages):
    page = reader1.getPage(pageNum)
    writer.addPage(page)

for pageNum in range(reader2.numPages):
    page = reader2.getPage(pageNum)
    writer.addPage(page)

open('combinedPDFs.pdf', 'wb')
writer.write(outputFile)

outputFile.close()
pdf1File.close()
pdf2File.close()
