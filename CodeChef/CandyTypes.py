t = int(input())
for _ in range(t):
    n = int(input())
    list1 = list(map(int,input().split()))
    freq = {}
    for x in list1:
        freq[x] = freq.get(x, 0) + 1
    max_freq = max(freq.values())
    answer = min(k for k, v in freq.items() if v == max_freq)
    print(answer)
