# -*- coding: utf-8 -*-
"""week3_ex2_ksattar.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1gAlcg6B-VbvJMF77LhuzMzVeAO8Zq-F7
"""

countries = ['USA', 'China', 'Cuba', 'India', 'Brazil', 'Canada']

populations = [331, 1441, 11, 1393, 213, 38]

dict_using_comp = {key:value**2 for (key, value) in zip(countries, populations) if value > 100}

print("dict_using_comp = " + str(dict_using_comp))