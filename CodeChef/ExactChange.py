n = int(input())
count = 0
if n > 5:
    n = n - 5
    count = 1 + n
    print(count)
elif n == 5:
    print(1)
else:
    print(n)
