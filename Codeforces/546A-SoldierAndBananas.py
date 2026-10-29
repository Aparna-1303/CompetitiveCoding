k, n, w = map(int, input().split())
total_price = 0
for i in range(1, w + 1):
    total_price += i * k
if(n > total_price):
    print(0)
else:
    print(total_price - n)
