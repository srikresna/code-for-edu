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

# Menjalankan query SQL
cursor.execute("""
SELECT year(pay.paymentDate) as tahun,
employee.firstName,
employee.lastName,
sum(pay.amount) as total_omset
FROM payments pay
JOIN customers cust ON pay.customerNumber=cust.customerNumber
JOIN employees employee ON cust.salesRepEmployeeNumber=employee.employeeNumber
WHERE employee.firstName IN ("Foon Yue", "Pamela") AND employee.lastName IN ("Tseng", "Castillo")
GROUP BY tahun, employee.firstName, employee.lastName;
""")

# Mengambil hasil query
result = cursor.fetchall()

# Mengubah hasil query menjadi DataFrame pandas
df = pd.DataFrame(result, columns=['tahun', 'firstName', 'lastName', 'total_omset'])

# Membuat plot untuk setiap karyawan
for name, group in df.groupby(['firstName', 'lastName']):
    plt.plot(group['tahun'], group['total_omset'], label=' '.join(name))

# Menambahkan legenda
plt.legend()

plt.title('Total Omset Tahunan')
plt.xlabel('Tahun')
plt.ylabel('Total Omset')
plt.xticks(df['tahun'].unique())
plt.grid(True)

# Menampilkan plot
plt.show()

# Menutup kursor dan koneksi
cursor.close()

# Menutup koneksi
db.close()