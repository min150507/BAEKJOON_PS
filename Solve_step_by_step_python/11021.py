n = int(input())
for i in range(n):
	a, b = map(int, input().split())
	num = a + b
	print("Case #%d: %d"%(i + 1, num))
