a = int(input())
for i in range(a, 0, -1):
	print(i)
  
  """
  step을 음수로 지정
  
  다른 방법으로는 reversed()를 이용할 수 있다.
  reversed()는 리스트의 원소를 거꾸로 뒤집고 이를 반환하는 함수이다.
  
  for i in reversed(range(a)):
     print(i + 1)
  """
