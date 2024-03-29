# -*- coding: utf-8 -*-
"""week4_ex1_ksattar.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1waKSzo89dZU4ZGCxviEr8jN1i0Vh02ai
"""
#Meta class for counting attributes
class AttributeCounterMeta(type):
  def __init__(cls, name, bases, dct):
    super().__init__(name, bases, dct)
    cls.attribute_count = len(dct)
    
#Sub-class of meta class
class AttributeCounter(metaclass=AttributeCounterMeta):
  def __init__(self, name, count, length, width):
    self.name = name
    self.count = count
    self.length = length
    self.width = width

# Create an instance of AttributeCounter
my_counter = AttributeCounter("Bob", 5, 4, 3)

# Print the count of attributes defined in the class
print(f"Number of attributes in AttributeCounter: {my_counter.attribute_count}")
