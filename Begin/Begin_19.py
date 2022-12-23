print("Togri tortburchakning qarama-qarshi uchlari koordinatlarini kiriting:")
#uning tomonlari koordinata o'qiga parallel, To'g'ri to'rtburchakning perimetri va yuzasini aniqlang
#A(x1,y1) D(x2,y2) AB==CD==x2-x1 va AC==BD==y2-y1
# A________________B
# |               |
# |               |
# |               |
# |_______________|
# C               D
x1=int(input("x1="))
y1=int(input("y1="))
x2=int(input("x2="))
y2=int(input("y2="))
AB=abs(x2-x1)
BD=abs(y2-y1)
print("To'g'ri to'rtburchak  \n perimetri: P=",2*(AB+BD),"\n Yuzasi: S=",AB*BD)