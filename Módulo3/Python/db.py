import psycopg2

DB_HOST = "localhost"
DB_PORT = 5433
DB_NAME = "biblioteca"
DB_USER = "admin"
DB_PASSWORD = "root"

def conectar_db():
    try:
        conn = psycopg2.connect(
            host=DB_HOST,
            port=DB_PORT,
            database=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD
        )
        return conn
    except Exception as e:
        print(e)
        return None



# CRUD Create Read Update Delete

#DML INSERT UPDATE DELETE

def Insert(matricula, nombre, edad, fecha_alta, sancionado):
    conn = conectar_db() #Establecer la conexion con la base de datos
    cursor = conn.cursor() #
    cursor.execute("INSERT INTO estudiantes(matricula, nombre, edad," \
    "fecha_alta,sancionado) VALUES (%s,%s,%d,%s,%s)"
    ,(matricula, nombre, edad, fecha_alta, sancionado))
    conn.commit()
    cursor.close()
    conn.close()


def Delete(matricula):
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute("DELETE from estudiantes WHERE matricula = %s", matricula)
    conn.commit()
    cursor.close()
    conn.close()


def Update(nombre,edad,sancionado, matricula):
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute("UPDATE estudiantes SET nombre= %s, edad = %d, sancionado = %s WHERE matricula = %s",
                   (nombre,edad,sancionado, matricula))
    conn.commit()
    cursor.close()
    conn.close()


#DQL SELECT
def Select(QuerySelect): #QuerySelect: String. 
    conn = conectar_db()
    cursor = conn.cursor()
    cursor.execute(
        QuerySelect
    )
    data = cursor.fetchall()
    cursor.close()
    conn.close()
    return data


if __name__ == "__main__":
    conn = conectar_db()
    if conn is None:
        print("No se estableció la conexión")
    else:
        print("Conexión exitosa")
        conn.close()
