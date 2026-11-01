s = input().lower()
vowels = ['a', 'e', 'i', 'o', 'u', 'y']
s1 = ""
for i in s:
    if i in vowels:
        continue
    else:
        s1 += "."+i
print(s1)
