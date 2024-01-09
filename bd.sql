CREATE DATABASE IF NOT EXISTS bdTrabajadores1;

USE bdTrabajadores1;

CREATE TABLE `trabajadores` (
  `dni` varchar(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `sueldo` double NOT NULL,
  `fecha` date NOT NULL,
  `matricula` varchar(50) NOT NULL
);

-- Inserción 1
INSERT INTO trabajadores VALUES ('123456789A', 'Juan', 'Pérez López', 2500.00, '2023-01-15', 'M12345');

-- Inserción 2
INSERT INTO trabajadores VALUES ('987654321B', 'María', 'Gómez Rodríguez', 3000.00, '2023-02-20', 'M67890');

-- Inserción 3
INSERT INTO trabajadores VALUES ('456789012C', 'Carlos', 'Fernández García', 2800.50, '2023-03-10', 'M13579');

-- Inserción 4
INSERT INTO trabajadores VALUES ('789012345D', 'Laura', 'Sánchez Martínez', 3200.75, '2023-04-05', 'M24680');

-- Inserción 5
INSERT INTO trabajadores VALUES ('234567890E', 'Pedro', 'Gutiérrez Ruiz', 2700.25, '2023-05-12', 'M35791');

-- Inserción 6
INSERT INTO trabajadores VALUES ('890123456F', 'Ana', 'López Fernández', 3100.00, '2023-06-08', 'M46802');

-- Inserción 7
INSERT INTO trabajadores VALUES ('345678901G', 'Miguel', 'Martínez Sánchez', 2900.50, '2023-07-15', 'M57913');

-- Inserción 8
INSERT INTO trabajadores VALUES ('012345678H', 'Carmen', 'Rodríguez Gómez', 3300.25, '2023-08-22', 'M68024');

-- Inserción 9
INSERT INTO trabajadores VALUES ('567890123I', 'Javier', 'López Martínez', 2600.75, '2023-09-30', 'M79135');

-- Inserción 10
INSERT INTO trabajadores VALUES ('123456789J', 'Isabel', 'García Sánchez', 3000.00, '2023-10-18', 'M80246');

-- Inserción 11
INSERT INTO trabajadores VALUES ('987654321K', 'Roberto', 'Fernández Ruiz', 2800.50, '2023-11-25', 'M91357');

-- Inserción 12
INSERT INTO trabajadores VALUES ('456789012L', 'Elena', 'Sánchez Gutiérrez', 3200.75, '2023-12-01', 'M02468');

-- Inserción 13
INSERT INTO trabajadores VALUES ('789012345M', 'Francisco', 'Gómez Martínez', 2700.25, '2023-01-08', 'M13579');

-- Inserción 14
INSERT INTO trabajadores VALUES ('234567890N', 'Sara', 'Martínez López', 3100.00, '2023-02-14', 'M24680');

-- Inserción 15
INSERT INTO trabajadores VALUES ('890123456O', 'Daniel', 'López Rodríguez', 2900.50, '2023-03-22', 'M35791');



