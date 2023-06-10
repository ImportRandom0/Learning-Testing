#Charlie Hudson
#Peroid 6

import random


def RunCard():
	Suit = random.randint(1,4)
	Face = random.randint(1,13)

	if (Suit == 1):
		FinalSuit = "Hearts"
	elif (Suit == 2):
		FinalSuit = "Spades"
	elif (Suit == 3):
		FinalSuit = "Clubs"
	elif (Suit == 4):
		FinalSuit = "Diamonds"

	if (Face == 1):
		FinalFace = "Ace"
	elif (Face == 2):
		FinalFace = "The Two"
	elif (Face == 3):
		FinalFace = "The Three"
	elif (Face == 4):
		FinalFace = "The Four"
	elif (Face == 5):
		FinalFace = "The Five"
	elif (Face == 6):
		FinalFace = "The Six"
	elif(Face == 7):
		FinalFace = "The Seven"
	elif (Face == 8):
		FinalFace = "The Eight"
	elif (Face == 9):
		FinalFace = "The Nine"
	elif (Face == 10):
		FinalFace = "The Ten"
	elif (Face == 11):
		FinalFace = "Jack"
	elif (Face == 12):
		FinalFace = "King"
	elif (Face == 13):
		FinalFace = "Queen"
		
	print(FinalFace + " of " + FinalSuit)
	
RunCard()

