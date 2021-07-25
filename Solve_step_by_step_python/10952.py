while 1: # 1로 두면 True로 계속 반복
	a, b = map(int, input().split())
	if a == 0 & b == 0:
		break
	else:
		print(a + b)
