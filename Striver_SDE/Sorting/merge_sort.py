import math

def mergeSort(arr: [int], l: int, r: int):
    if (l<r):
        mid=math.floor((l+r)/2)
        mergeSort(arr,l,mid)
        mergeSort(arr, mid+1, r)
        merge(arr,l,mid,r)
    return arr

def merge(arr: [int], l: int,mid: [int], r: int):
    temp=[]
    left= l
    right=mid+1
    while(left<=mid and right<=r):
        if(arr[left]>=arr[right]):
            temp.append(arr[right])
            right+=1
        else:
            temp.append(arr[left])
            left+=1

    while left<=mid:
        temp.append(arr[left])
        left+=1

    while right<=r:
        temp.append(arr[right])
        right+=1

    for i in range(len(temp)):
        arr[l +i] = temp[i]

