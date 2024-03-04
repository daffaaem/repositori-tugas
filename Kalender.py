import calendar

print("Nama \t\t: Daffa Ammar Mahendra")
print("NPM \t\t: 22081010189")
print("Mata Kuliah \t: Kecerdasan Buatan A081")
print("========================================")
# Input tahun dan bulan
tahun = int(input("Masukkan Tahun : "))
bulan = int(input("Masukkan Bulan(dalam angka) : "))

print(calendar.month(tahun, bulan))