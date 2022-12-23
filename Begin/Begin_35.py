v_qayiq=int(input("Qayiqning tezligini kiriting: "))
u_oqim=int(input("Oqimning tezligini kiriting: "))
t1=int(input("Oqim bo'yicha harakatalanish vaqti:"))
t2=int(input("Oqimga qarshi harakatalanish vaqti:"))
S1=(v_qayiq+u_oqim)*t1
S2=(v_qayiq-u_oqim)*t2
print("Qayiqning yurgan yo'li S=",(S1+S2))