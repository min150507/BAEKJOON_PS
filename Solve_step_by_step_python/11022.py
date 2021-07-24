n = int(input())
for i in range(n):
	a, b = map(int, input().split())
	sum = a + b
	print(f'Case #{i + 1}: {a} + {b} = {sum}')
