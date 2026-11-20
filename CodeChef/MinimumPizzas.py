t = int(input())
for _ in range(t):
    n, x = map(int, input().split())
    slices = (n * x) % 4
    pizzas = (n * x) // 4 
    if(slices == 0):
        print(pizzas)
    else:
        print(pizzas + 1)
    
