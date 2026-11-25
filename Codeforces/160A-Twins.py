n = int(input())
a = list(map(int, input().split()))
a.sort(reverse = True)
total = sum(a)
my_sum = 0
count = 0
for i in range(n):
    my_sum += a[i]
    count += 1
    if my_sum > total - my_sum:
        break
print(count)
