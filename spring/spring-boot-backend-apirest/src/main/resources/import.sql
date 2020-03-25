
INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamerica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceania');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antartida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Leonel','Mazzan','leo@yopmail.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Lautaro','Fernandez','lau@yopmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Carlos','Ripari','car@yopmail.com', '2018-03-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Juanelo','Solomeo','juanelo@yopmail.com', '2018-04-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Fernando','Alerdi','fer@yopmail.com', '2018-05-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Marcelo','Martinez','mar@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Gaston','Aro','gas@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Alberto','Aballay','alb@yopmail.com', '2018-07-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'Franco','Persia','fran@yopmail.com', '2018-08-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Leonel','Mazzan','le@yopmail.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Lautaro','Fernandez','la@yopmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Carlos','Ripari','ca@yopmail.com', '2018-03-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Juanelo','Solomeo','juanel@yopmail.com', '2018-04-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Fernando','Alerdi','fe@yopmail.com', '2018-05-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Marcelo','Martinez','ma@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Gaston','Aro','ga@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Alberto','Aballay','al@yopmail.com', '2018-07-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'Franco','Persia','fra@yopmail.com', '2018-08-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Leonel','Mazzan','l@yopmail.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Lautaro','Fernandez','les@yopmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Carlos','Ripari','c@yopmail.com', '2018-03-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Juanelo','Solomeo','juane@yopmail.com', '2018-04-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Fernando','Alerdi','f@yopmail.com', '2018-05-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Marcelo','Martinez','m@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Gaston','Aro','g@yopmail.com', '2018-06-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Alberto','Aballay','a@yopmail.com', '2018-07-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Franco','Persia','fil@yopmail.com', '2018-08-01');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$gyFdpk3y9pOwYwAqpb21K.EkUduvOuytP6hiemWKoxiqSonBtR4MS',1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$sQL0HBLa061NMcLFZDp8HehiBRbDOmK/g3n8BGNIrxVOc5mLrYFJW',1, 'John', 'Doe', 'jhon@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);

INSERT INTO productos (nombre,precio,create_at) VALUES ('lcd', 200, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('huawei p20', 2300, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('play 4', 250, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('samsung a20', 300, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('mac', 800, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('motorola ddefy', 2000, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('1080ti', 9000, NOW());
INSERT INTO productos (nombre,precio,create_at) VALUES ('mate', 50, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura de compra', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 3);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 4);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura de play', 'Alguna nota importante', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 3);


