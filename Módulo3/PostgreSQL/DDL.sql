
CREATE TABLE estudiantes(
    matricula TEXT PRIMARY KEY,
    nombre TEXT,
    edad INTEGER NOT NULL CHECK (edad >=18),
    fecha_alta DATE DEFAULT CURRENT_DATE,
    sancionado BOOLEAN DEFAULT FALSE
);



------ Ejemplos de DDL----
--- DATA DEFINITION LENGUAGE---


ALTER TABLE estudiantes 
ADD COLUMN carrera TEXT;


ALTER TABLE estudiantes
RENAME COLUMN nombre TO nombre_completo;

ALTER TABLE estudiantes
RENAME TO alumnos;


ALTER TABLE alumnos
DROP COLUMN carrera;

ALTER TABLE alumnos
ALTER COLUMN matricula type VARCHAR(50);

TRUNCATE alumnos;
