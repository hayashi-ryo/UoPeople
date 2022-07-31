
sports_Before = "basketball soccer tennis baseball"
print("sports_Before:",sports_Before)
# create list method
sports_list = sports_Before.split(" ")

# delete method 1
sports_list.pop(0)

# delete method 2
sports_list.remove("tennis")

# delete method 3
del sports_list[1]

# add method 1
sports_list.append("tennis")

# add method 2
sports_list.insert(2,"baseball")

# add method 3
sports_list = ["basketball"] + sports_list

# join method
delimiter = " "
sports_after = delimiter.join(sports_list)
print("sports_after:",sports_after)