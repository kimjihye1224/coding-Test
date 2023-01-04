n = int(input())
j = 1

for i in range(1 , n*2):
    if i < n:
        print("*" * i + " "*((n*2) - (i * 2))+"*" * i)
    if i == n:
        print("*" * i * 2)
    if i > n:
        print("*" * (n-j) + " " * (2 * (i - n)) + "*" * (n-j))
        j += 1