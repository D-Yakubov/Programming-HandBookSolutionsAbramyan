seconde=int(input("Necha seconde? "))
hour = seconde//3600
second1 = seconde%3600
minute = second1//60
second2 = second1%60
print(hour," hour,",minute," minut,",second2," seconde.")