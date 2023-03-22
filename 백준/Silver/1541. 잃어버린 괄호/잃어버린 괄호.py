n = input().split('-')
a = []

for i in n:
  i = i.split('+')
  plus = 0
  for j in i:
    plus += int(j)
  a.append(plus)

result = a[0]
for i in range(1, len(a)):
  result -= a[i]

print(result)


