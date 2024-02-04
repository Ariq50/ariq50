# -*- coding: utf-8 -*-
"""week3_ex1_ksattar.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/188pgGG55rzKMPTIZ-7fy9aA_4ntTIQwh
"""
#Create input list, with numbers ranging from 1 to 21
input_list = range(1, 21)

#create output list with numbers from input list which are even and whose squares are divisible by four. Output list will contain the squares of those numbers.
list_using_comp = [var**2 for var in input_list if var % 2 == 0 if var**2 % 4 == 0]

#Print output list
print("Output List using list comprehensions, if number is even and its square is divisible by 4:", list_using_comp)
