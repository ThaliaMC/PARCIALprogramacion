numero=int(input("Ingrese un numero : "))
factorial=1

if numero!=0:
    for i in range (1,numero+1):
     factorial=factorial*i
print("El factorial del numero es : ",factorial)