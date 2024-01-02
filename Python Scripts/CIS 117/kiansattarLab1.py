'''
Course: CIS 117 Python Programming 
Term: Summer 2023 
Student: Kian Sattar
Version: Python 3.11.4
Description: Program that takes in and validates user input, in the form of
their last name and student ID, followed by determining the length of their
last name and the sum of the digits in their student ID. The program then uses
these results to determine the values of a series of expressions and then
appends the values to a list and prints this list to the console, along with
the date and time of the current run of the program. The expressions are as
follows:
   a) expression 1: my_id / 2
   b) expression 2: my_id % 2 
   c) expression 3: 2 + 3 + … + num_let
   d) expression 4: my_id + num_let
   e) expression 5: abs(num_let – my_id)
   f) expression 6: (my_id) / (num_let + 1100)
   g) expression 7: (num_let % num_let) and (my_id * my_id)
   h) expression 8: 1 or (my_id / 0)
   i) expression 9: round(3.15, 1)
Date: 6/27/2023
'''

import datetime

# Take user input for last name and student ID
lastName = str(input('Enter your last name: '))
studentID = int(input('Enter your 8-digit Student ID: '))

#initialize variables my_id, num_let, and e (a datetime object)
my_id = 0
num_let = 0
e = datetime.datetime.now()

# sum the value of the digits in the student ID and assign the value to my_id
# determine the number of letters in the student's last name and assign the value
# to num_let

my_id = sum(int(digit) for digit in str(studentID))
num_let = eval('len(lastName)')

# validate user input (studentID must have 8 digits; lastName must have between
# 2 and 15 characters

if(len(str(studentID)) <= 8):

    if(2 < num_let < 15):

        if(my_id > 0):

# print my_id and num_let

            print("my_id is: " + str(my_id))

            print("num_let is: " + str(num_let))

# initialize list 'expressions'

            expressions = []

# calculate each expression and append them to the list 'expressions'
            expressions.append('%.2f' % (my_id / 2))

            expressions.append(my_id % 2)

            expressions.append(sum(range(2, num_let)))

            expressions.append(my_id + num_let)

            expressions.append(abs(num_let - my_id))

            expressions.append('%.2f' % ((my_id) / (num_let + 1100)))

            expressions.append(bool((num_let % num_let) and (my_id * my_id)))

            expressions.append(bool(1 or (my_id / 0)))

            expressions.append(round(3.15, 2))

# print expressions to the console

            for i in range(len(expressions)):

                print('expression ', i+1, expressions[i])

# if user input is invalid, print the following message

else:
    print("Invalid Input!")

#print date and time of current run to the console
print ('The date and time of the current run is: ' + e.strftime("%Y-%m-%d %H:%M:%S"))

'''
Enter your last name: Sattar
Enter your 8-digit Student ID: 01321258
my_id is: 22
num_let is: 6
expression  1 11.00
expression  2 0
expression  3 14
expression  4 28
expression  5 16
expression  6 0.02
expression  7 False
expression  8 True
expression  9 3.15
The date and time of the current run is: 2023-06-27 17:58:07
'''
