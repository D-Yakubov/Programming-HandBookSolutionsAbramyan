"""
abc beriladi ==> bac bo'lishi kerak
"""
abc =int(input("Uch xonali son kiriting: "))
print(f"{abc} <==> {(abc//10)%10*100+(abc//100)*10+abc%10}")