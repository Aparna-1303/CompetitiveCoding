s = input()
k = ""
for i in range(len(s)):
    if i == 0 or i == 2 or i == 4:
        k += s[i]
    else:
        continue
print(k)
