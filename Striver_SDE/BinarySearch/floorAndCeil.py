def getFloorAndCeil(a, n, x):
    return [getLowerBound(a,n,x),getUpperBound(a,n,x)]

def getUpperBound(a,n,x):
    i=0
    j=n-1
    ans=-1
    while(i<=j):
        mid = (i+j)//2
        if(a[mid]>=x):
            ans=a[mid]
            j=mid-1
        else:
            i=mid+1
    return ans

def getLowerBound(a,n,x):
    i=0
    j=n-1
    ans=-1
    while(i<=j):
        mid = (i+j)//2
        if(a[mid]<=x):
            ans=a[mid]
            i=mid+1
        else:
            j=mid-1
    return ans
