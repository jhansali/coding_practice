def getSecondOrderElements(n: int,  a: [int]) -> [int]:
    return [secondLargest(a,n),secondSmallest(a,n)]


def secondLargest(arr, n):
    if(n<2):
        return -1
    # large = float('-inf')
    # second_large = float('-inf')
    large = arr[0]
    second_large = -1

    for i in range (n):
        if(arr[i]>large):
            second_large = large
            large = arr[i]
        elif(arr[i]>second_large and arr[i]!=large):
            second_large = arr[i]
    return second_large

def secondSmallest(arr, n):
    if(n<2):
        return -1
    # small = float('inf')
    # second_small = float('inf')
    small = arr[0]
    second_small = arr[1]

    for i in range (n):
        if(arr[i]<small):
            second_small = small
            small = arr[i]
        elif(arr[i]<second_small and arr[i]!=small):
            second_small = arr[i]
    return second_small