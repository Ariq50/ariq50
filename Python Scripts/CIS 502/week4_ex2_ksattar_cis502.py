# -*- coding: utf-8 -*-
"""week4_ex2_ksattar_cis502.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1jqnnaXWHmP-C3-SLE5-pdBfPbeAb40YF
"""

class AttributeLoggerMeta(type):
    def __new__(cls, name, bases, attrs):
        # Log the creation of class attributes
        for attr_name, attr_value in attrs.items():
            print(f"Attribute created: {attr_name} = {attr_value}")
        return super().__new__(cls, name, bases, attrs)

# Now let's define the base class LoggerBase
class LoggerBase(metaclass=AttributeLoggerMeta):
    pass

# Create a subclass DerivedClass
class DerivedClass(LoggerBase):
    def __init__(self):
        self.example_attribute = 42

# Instantiate DerivedClass
derived_instance = DerivedClass()