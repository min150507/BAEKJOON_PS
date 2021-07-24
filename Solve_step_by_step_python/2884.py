H, M = input().split()
H = int(H)
M = int(M)
if H > 0:
	if M < 45:
		print(H - 1, 60 - (45 - M))
	elif M >= 45:
		print(H, M - 45)
if H == 0:
	if M >= 45:
		print(0, M - 45)
	elif M < 45:
		print(23, 60 - (45 - M))
