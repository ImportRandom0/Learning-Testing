#Charlie Hudson
#Peroid 6
import random
Numbers = []
for x in range(0,10) :
	ranint = random.randint(-50,50)
	Numbers.append(ranint)
print("The original list:", Numbers)

list2 = []
for x in range(0, len(Numbers), 2):
	list2.append(Numbers[x] + Numbers[x+1])
print("Each pair added together:", list2)
