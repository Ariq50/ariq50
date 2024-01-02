'''
Course: CIS 117 Python Programming 
Term: Summer 2023 
Student: Kian Sattar
Version: Python 3.11.4 
Description: Program that creates a database and write data to it, using sqlite3 classes and methods.
             Database contains a table with the following columns:
   a) Region
   b) Population  
Date: 7/25/2023
'''
#Import the required library
import sqlite3

#Set name of database
name_of_db = "sattar.db"

#Create a connection object
conn = sqlite3.connect(name_of_db)

c = conn.cursor()

#Create table - PopByRegion
c.execute('''CREATE TABLE PopByRegion (Region text, Population integer ) ''')

#Insert data into table using sql insert statement
c.execute(''' INSERT INTO PopByRegion(Region, Population)
              VALUES("Central Africa", "330, 993") ''')

c.execute(''' INSERT INTO PopByRegion(Region, Population)
              VALUES("Southeastern Africa", "743, 112") ''')

c.execute(''' INSERT INTO PopByRegion(Region, Population)
              VALUES("Japan", "100, 562") ''')

#executing the commands
conn.commit()

'''
>>>import sqlite3
>>>con = sqlite3.connect('sattar.db')
>>>cur = con.cursor()
>>>cur.execute('SELECT Region, Population FROM PopByRegion')
<sqlite3.Cursor object at 0x000001C85B1C13C0>
>>>cur.fetchall()
[('Central Africa', '330, 993'), ('Southeastern Africa', '743, 112'), ('Japan', '100, 562')]
'''
