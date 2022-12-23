#Tekislikda berilgan ikki nuqta (x1,y1) (x2,y2) orasidagi masofa topilsin
import math
print("Nuqtalarni kiriting:")
x1=int(input("x1="))
y1=int(input("y1="))
x2=int(input("x2="))
y2=int(input("y2="))
masofa=math.sqrt((x2-x1)**2+(y2-y1)**2)
print("Nuqtalar orasidagi masofa:",masofa)