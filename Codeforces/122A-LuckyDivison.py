 = int(input())
lucky = [4, 7, 44, 47, 74, 77, 474, 744, 774, 777, 444, 447, 477, 747]
found = False
for i in lucky:
    if n % i == 0:
        found = True
        break
if(found):
    print("YES")
else:
    print("NO")
