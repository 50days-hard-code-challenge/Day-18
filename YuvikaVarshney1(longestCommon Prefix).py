def commonPrefix(arr: List[str], n: int) -> str:
    # Write your code here
    arr.sort()
    for i in range(len(arr[0])):
        x=arr[0][0:i+1:]
        for j in range(n):
            if(arr[j].startswith(x)):
                continue
            else:
                if i==0:
                    return -1
                return arr[0][0:i:]
    return arr[0]
            
    pass
