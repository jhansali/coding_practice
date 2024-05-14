def getFloorAndCeil(arr, n, x):
    floor = 0
    ceil = 100001
    for i in arr:
        if(i <= x and i > floor):
            floor = i
        if(i >= x and i < ceil):
            ceil = i
    if floor == 0:
        floor = -1
    if ceil == 100001:
        ceil = -1
    return [floor,ceil]
