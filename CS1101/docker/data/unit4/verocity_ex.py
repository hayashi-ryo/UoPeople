def velocity(d, t):
    try:
        d = int(d)
        t = int(t)
        if (t != 0):
            v = d / t
            return v
        else:
            print("The argument t must be a non-zero number.")
    except:
        print("The argument must be given a numerical value.")
        return


d = 13.5
t = 4.5
print(velocity(d, t))
