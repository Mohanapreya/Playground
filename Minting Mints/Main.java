x, y = input().split()
s=int(x)
n=int(y)
a=[]
sum=s
a.append(s)
for i in range(1,n):
    a.append(sum-1)
    sum=sum+a[i];  
    
print(sum)