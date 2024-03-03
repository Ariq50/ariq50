# -*- coding: utf-8 -*-
"""Week 2_Exercise 1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1NlxMMy2ZlU91gRFLMdgw6wuRmcXaqQ90
"""
#Rectangle class definition
class Rectangle:
#init function for instantiating objects and
#setting attributes
  def __init__(self, l, w):
    self.length = l
    self.width = w

#calc_area function. Calculates rectangle area
  def calc_area(self):
    return (self.length * self.width)

#Instantiate two Rectangle objects and set
#their length and width attributes
rectangle1 = Rectangle(4, 5)
rectangle2 = Rectangle(5, 6)

#call calc_area function for each rectangle and
#print results to screen
print("Rectangle 1 Area: " + str(rectangle1.calc_area()))
print("Rectangle 2 Area: " + str(rectangle2.calc_area()))
