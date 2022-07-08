def countdown(n):
    if n <= 0:
        print('Blastoff!')
    else:
        print(n)
        countdown(n-1)


def countup(n):
    if n >= 0:
        print('Blastoff!')
    else:
        print(n)
        countup(n+1)


n = input("please input number:")
try:
    n = int(n)
    if(n < 0):
        countup(n)
    else:
        countdown(n)
except ValueError:
    print("plese input nuber")
