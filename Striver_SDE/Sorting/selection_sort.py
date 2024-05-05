from typing import List

def selectionSort(arr: List[int]) -> None: 
    for i in range (len(arr)-1):
        minindex=i
        for j in range(i+1,len(arr)):
            if(arr[j]<arr[minindex]):
                minindex=j;
        arr[i],arr[minindex] = arr[minindex],arr[i]
    pass
