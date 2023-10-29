months = input("Please enter a number of months: ")

months = int(months)

offspring = input("Please enter the number of offspring: ")

offspring = int(offspring)

def wascallyWabbits(months, offspring):
    parent, child = 1, 1
    for itr in range(months - 1):
        child, parent = parent, parent + (child * offspring)
    return child

print(wascallyWabbits(months, offspring))
