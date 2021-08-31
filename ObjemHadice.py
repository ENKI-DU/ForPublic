import os
while True:
        print("Priemery hadic:\n1'' = 3,2cm\n1/2'' = 1,6cm\n3/4'' = 2,5cm\n5/4'' = 4,0cm")
        r = float(input("Zadaj priemer hadice v cm: "))
        h = float(input("Zadaj dlzku hadice v cm: "))
        volume = ((22 * (r / 2) * (r / 2) * h) / 7)
        liter = volume / 1000

        print("\nObjem hadice je: %.2f"  % (volume), " cm'3\n", "Do hadice sa zmesti: %.2f" % (liter)," L vody.")
        next = input('Chces skoncit? a/n: \n')
        if next == 'a':
                break
os.system("pause")


