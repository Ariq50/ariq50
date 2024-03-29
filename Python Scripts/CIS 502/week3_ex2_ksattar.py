# -*- coding: utf-8 -*-
"""week3_ex2_ksattar.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1gAlcg6B-VbvJMF77LhuzMzVeAO8Zq-F7
"""

#Input lists

#countries list contains the names of the countries
countries = ['USA', 'China', 'Cuba', 'India', 'Brazil', 'Canada']

#populations list contains the respective populations of each country
populations = [331, 1441, 11, 1393, 213, 38]

#output dictionary that filters out countries whose population is less than 100 million. The dictionary consists of the name of each country
#not filtered out, alongside the square of its population. This is presented in the form of key:value pairs, with the country as the key and the value
#as the population squared
dict_using_comp = {key:value**2 for (key, value) in zip(countries, populations) if value > 100}

#Print dictionary to the screen/console
print("dict_using_comp = " + str(dict_using_comp))