n = 3
v = [0] * n
i=0

while(i<n):
    v[i]=float(input(F"Digite o valor {i+1}\n"))
    i=i+1
   
i=0 
j=0

for i in range (n-1):
    j=i+1
    while j<n:               
        if v[i]>v[j]:
            x = v[j]
            v[j] = v[i]
            v[i] = x
            j=j+1
        else:
            j=j+1            
            
print(v)
            
            
    
    

