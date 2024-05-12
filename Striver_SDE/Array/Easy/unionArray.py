def sortedArray(a: [int], b: [int]) -> [int]:
    # Write your code here
    lena=len(a)
    lenb=len(b)
    i=0
    j=0
    union=[]
    while (i<lena and j<lenb):
        if(a[i]<=b[j]):
            if(len(union)==0 or union[-1]!=a[i]):
              union.append(a[i])
            i=i+1
        elif(a[i]>b[j]):
            if(len(union)==0 or union[-1]!=b[j]):
              union.append(b[j])
            j=j+1
    while(i<lena):
        if(union[-1]!=a[i]):
            union.append(a[i])
        i=i+1
    while(j<lenb):
        if(union[-1]!=b[j]):
            union.append(b[j])
        j=j+1

    return union