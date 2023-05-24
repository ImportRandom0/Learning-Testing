#Charlie Hudson
#Peroid 6
import random
Numbers = []
for x in range(0,100) :
	ranint = random.randint(0, 10)
	Numbers.append(ranint)
print("The original list:", Numbers)

Pairs = 0
list2 = []
for x in range(0, len(Numbers)):
	if Numbers[x-1] == Numbers[x]:
		Pairs = Pairs + 1
print("We found", Pairs, "Pairs!")
