s = input()
word = "hello"
j = 0
for ch in s:
    if j < 5 and ch == word[j]:
        j += 1
if j == 5:
    print("YES")
else:
    print("NO")
