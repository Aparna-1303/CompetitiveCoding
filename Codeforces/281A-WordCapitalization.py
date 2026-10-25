word = input()
s = ""
for i in range(len(word)):
    if i == 0:
        s += word[i].upper()
    else:
        s += word[i]
print(s)
