'''
Course: CIS 117 Python Programming
Term: Summer 2023 
Student: Kian Sattar
Version: Python 3.11.4 
Description: Program that models a basic email application,
             utilizing OOP techniques..
   a) A Message class
   b) A Demo Python File 
Date: 7/18/2023
'''
#Import Message class
from kiansattarLab2 import Message
#Create instance of Message class and pass parameter values to it
wishList = Message("Kian", "Santa")
wishList.append("For Christmas, I would like:")
wishList.append("Silver")
wishList.append("Gold")
#Print output to console
print(wishList.to_String())

'''
From: Kian
To: Santa
For Christmas, I would like:
Silver
Gold
'''
