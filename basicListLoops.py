#Charlie Hudson
#Peroid 6
blista = [6,2,14,69,20,6,5,27,96,63]
count = 0
Av = 0
while count < len(blista):
	Av = Av + blista[count]
	count = count + 1
Average = Av/len(blista)
print("Average Number Length: ", Average)


pista = ["potato", "pasta", "corn", "iron", "lost"]
count = 0
Total = 0
while count < len(pista):
	Total = Total + len(pista[count])
	count = count + 1
Average = Total/len(pista)
print("Average Word Length: ", Average)
