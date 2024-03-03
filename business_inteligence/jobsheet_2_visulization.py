import pandas as pd
import matplotlib.pyplot as plt
import mysql.connector

# Membuat koneksi ke database
db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="classicmodels"
)

# Membuat cursor
cursor = db.cursor()

# Menjalankan query SQL untuk Foon Yue Tseng
cursor.execute("""
SELECT year(pay.paymentDate) as tahun,
sum(pay.amount) as total_omset
FROM payments pay
JOIN customers cust ON pay.customerNumber=cust.customerNumber
JOIN employees employee ON cust.salesRepEmployeeNumber=employee.employeeNumber
WHERE employee.firstName="Foon Yue" AND employee.lastName="Tseng"
GROUP BY tahun;
""")

# Mengambil hasil query
result = cursor.fetchall()

# Mengubah hasil query menjadi DataFrame pandas
df_foon = pd.DataFrame(result, columns=['tahun', 'total_omset'])

# Menjalankan query SQL untuk Pamela Castillo
cursor.execute("""
SELECT year(pay.paymentDate) as tahun,
sum(pay.amount) as total_omset
FROM payments pay
JOIN customers cust ON pay.customerNumber=cust.customerNumber
JOIN employees employee ON cust.salesRepEmployeeNumber=employee.employeeNumber
WHERE employee.firstName="Pamela" AND employee.lastName="Castillo"
GROUP BY tahun;
""")

# Mengambil hasil query
result = cursor.fetchall()

# Mengubah hasil query menjadi DataFrame pandas
df_pamela = pd.DataFrame(result, columns=['tahun', 'total_omset'])

# Membuat plot
plt.plot(df_foon['tahun'], df_foon['total_omset'], label='Foon Yue Tseng')
plt.plot(df_pamela['tahun'], df_pamela['total_omset'], label='Pamela Castillo')

# Menambahkan legenda
plt.legend()

plt.title('Total Omset Tahunan Foon Yue Tseng dan Pamela Castillo')
plt.xlabel('Tahun')
plt.ylabel('Total Omset')
plt.xticks(df_foon['tahun'])
plt.yticks(df_foon['total_omset'])
plt.grid(True)

# Menampilkan plot
plt.show()

# Menutup kursor dan koneksi
cursor.close()

# Menutup koneksi
db.close()