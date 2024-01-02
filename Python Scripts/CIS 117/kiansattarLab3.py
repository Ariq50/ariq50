'''
Course: CIS 117 Python Programming 
Term: Summer 2023 
Student: Kian Sattar
Version: Python 3.11.4 
Description: Program that takes the URL of the National Academy of Science
             and a list of topics. Program then computes the number of instances
             of each topic on the NAS website, providing a simple,
             yet complete report.  
Date: 7/25/2023
'''
import datetime
import requests
from bs4 import BeautifulSoup

#Create datetime object
e = datetime.datetime.now()

print("Enter the URL, example(https://en.wikipedia.org/robots.txt): ")

url = input()
#Get HTML Page

response = requests.get(url)

txt = response.text
#Strip the HTML Tags

soup = BeautifulSoup(txt, "lxml")
text = soup.get_text()

#Search for the keywords

topics = ["Sports", "research", "climate", "evolution", "cultural", "news"]
out = []

for topic in topics:
    out.append(text.count(topic))

print("Todays date is " + e.strftime("%Y-%m-%d %H:%M:%S"))
i = 0

for topic in topics:
    if out[i] >= 0:
        print(topic + " appears " + str(out[i]) + " times.")
    i += 1
'''
Todays date is 2023-07-25 19:55:02
Sports appears 0 times.
research appears 3 times.
climate appears 0 times.
evolution appears 0 times.
cultural appears 0 times.
news appears 0 times.
'''
