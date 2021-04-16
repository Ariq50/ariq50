#Reads in a CSV file, parses the file, and write to a new CSV file

import csv

with open('HitPickFile.csv', 'r') as csv_file:
	csv_reader = csv.DictReader(csv_file)

	with open('new_HitPickFile.csv', 'w') as new_file:
		fieldnames = ['Source_Plate', 'Source_Well', 'Result']

		csv_writer = csv.DictWriter(new_file, fieldnames = fieldnames, delimiter = '\t')

		csv_writer.writeheader()

		for line in csv_reader:
			csv_writer.writerow(line)