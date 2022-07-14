def velocity(d, t):
    try:
        d = float(d)
        t = float(t)
        if (t != 0):
            v = d / t
            return v
        else:
            print("The argument t must be a non-zero number.")
    except:
        print("The argument must be given a numerical value.")
        return


# NG
d = 13.5
t = 4.5
velocity(d, t)
# OK
d = 13.5
t = 4.5
print(velocity(d, t))
