A = int(input("A = "))
B = int(input("B = "))
C = int(input("C = "))
D=B**2-4*A*C
if  D > 0:
    print(f"x1 = {(-B+(D)**(1/2))/2*A} \n"
          f"x2 = {(-B-(D)**(1/2))/2*A}")
elif D == 0:
    print(f"x = {-B/2*A}")
else:
    print(f"D = {D}, Yechimga ega emas!")
