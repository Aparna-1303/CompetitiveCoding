t = int(input())
for _ in range(t):
    n = input()
    if(len(n) <= 10):
        print(n)
    else:
        length = len(n) - 2
        print(n[0]+str(length)+n[-1])
