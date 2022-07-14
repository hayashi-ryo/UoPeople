def calBalance(exBef, exNow, valBefDoL, valNowDoL):
    valBefYen = exBef * valBefDoL
    valNowYen = exNow * valNowDoL
    PaL = valNowYen - valBefYen
    return PaL


print(calBalance(100, 120, 300, 400))
print("#####")
print(calBalance(120, 140, 300, 250))
print("#####")
print(calBalance(200, 100, 500, 1500))
