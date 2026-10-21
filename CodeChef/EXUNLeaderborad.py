x, y = map(int, input().split())
result = 0
if(x > y):
    result = x - y - 1
else:
    result = y - x - 1
print(result)
