x,y=input().split()
low=int(x)
up=int(y)
for i in range(low,up+1):
    if(up>=100):
        print("%03d" %i,end=' ')
    elif(up>=10):
        print("%02d" %i,end=' ')
    else:
        print(i,end=' ')