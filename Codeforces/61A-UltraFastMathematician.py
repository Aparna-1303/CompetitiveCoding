s1 = input()
s2 = input()
final_s = ""
for i in range(len(s1)):
    if s1[i] == '1' and s2[i] == '1' :
        final_s += '0'
    elif (s1[i] == '1' and s2[i] == '0') or (s1[i] == '0' and s2[i] == '1'):
        final_s += '1'
    else:
        final_s += '0'
print(final_s)
