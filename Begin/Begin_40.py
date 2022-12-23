a1 = int(input("A1 = "))
b1 = int(input("B1 = "))
c1 = int(input("C1 = "))
a2 = int(input("A2 = "))
b2 = int(input("B2 = "))
c2 = int(input("C2 = "))
d = (a1*b2-a2*b1)
x = (c1*b2 - c2*b1)/d
y = (a1*c2-a2*c1)/d
print("X = ",x)
print("Y = ",y)