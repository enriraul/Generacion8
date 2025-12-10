BEGIN;

Create table usuario(
id_usuario serial primary key,
nombre varchar(50),
apellido varchar(50),
correo varchar(50)
);

INSERT INTO usuario (nombre, apellido, correo) VALUES
('Ana', 'Martínez', 'ana.martinez@example.com'),
('Luis', 'García', 'luis.garcia@example.com'),
('Carla', 'Fernández', 'carla.fernandez@example.com'),
('Pedro', 'López', 'pedro.lopez@example.com'),
('Sofía', 'Ramírez', 'sofia.ramirez@example.com');


COMMIT;
