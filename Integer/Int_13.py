"""
abc ==> bca
"""
abc =int(input("Uch xonali son kiriting: "))
print(f"{abc} ning chap tomonidagi raqamni o'chirib o'ng tarafiga yozilgan son: {(abc//10)%10*100+abc%10*10+abc//100}")