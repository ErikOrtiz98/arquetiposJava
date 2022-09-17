INSERT INTO users (id,ds_name,ds_lastname,age)
VALUES
  (1,'Sydney','Ramirez',37),
  (2,'Lara','Morrison',29),
  (3,'Ann','Stewart',33),
  (4,'Maxwell','Mendoza',27),
  (5,'Ali','Hudson',26),
  (6,'Orson','Andrews',25),
  (7,'Darryl','Rios',23),
  (8,'Colorado','Williams',23),
  (9,'Trevor','Harrison',26),
  (10,'Howard','Campbell',24),
  (11,'Donovan','Wilson',30),
  (12,'Sasha','Crawford',38),
  (13,'Kitra','Lopez',32),
  (14,'Alexandra','Cole',33),
  (15,'Mechelle','Kennedy',39),
  (16,'Shaine','Peters',27),
  (17,'Willow','Medina',25),
  (18,'Lara','Hawkins',36),
  (19,'Kelsey','Aguilar',22),
  (20,'Richard','Murphy',30);


INSERT INTO mouses (idmouse,brand,serialnumber,model)
VALUES
  (1,'Steelseries',3391363,'office'),
  (2,'Roccat',7247054,'ergonomic'),
  (3,'HP',1411767,'office'),
  (4,'Jelly Comb',4572016,'productive'),
  (5,'HP',2938444,'ergonomic'),
  (6,'HP',3301664,'productive'),
  (7,'Victsing',1541076,'office'),
  (8,'Jelly Comb',6894806,'office'),
  (9,'Roccat',9072570,'productive'),
  (10,'razer',1799667,'office'),
  (11,'Steelseries',4922780,'ergonomic'),
  (12,'Victsing',1225470,'office'),
  (13,'Jelly Comb',5224482,'office'),
  (14,'logitech',5006084,'productive'),
  (15,'HP',1217253,'productive'),
  (16,'HP',3133611,'office'),
  (17,'razer',8620958,'ergonomic'),
  (18,'Roccat',9141189,'office'),
  (19,'HP',8137894,'ergonomic'),
  (20,'razer',4960659,'gamer');

INSERT INTO monitors (idmonitor,brand,serialnumber,model)
VALUES
  (1,'AceActeck',8185146,'office'),
  (2,'BenQ',3484099,'office'),
  (3,'Acer',5616077,'curved'),
  (4,'Acer',2419407,'curved'),
  (5,'ASUS',3951921,'ultrawide'),
  (6,'ASUS',6976005,'ultrawide curved'),
  (7,'GHIA',6057426,'ultrawide'),
  (8,'BenQ',5845358,'ultrawide'),
  (9,'Acer',5228212,'curved'),
  (10,'BenQ',3631369,'ultrawide curved'),
  (11,'GHIA',1580643,'ultrawide'),
  (12,'Enson',9764112,'gamer'),
  (13,' AOC',6498762,'curved'),
  (14,'AceActeck',9587145,'office'),
  (15,'BenQ',9170552,'ultrawide curved'),
  (16,'GHIA',7376422,'curved'),
  (17,'AceActeck',5272648,'gamer'),
  (18,'GHIA',8956030,'ultrawide curved'),
  (19,'Dell',6023966,'curved'),
  (20,' AOC',5827399,'ultrawide curved');

INSERT INTO keyboards (idkeyboard,brand,serialnumber,model)
VALUES
  (1,'corsair',8650698,' membrane'),
  (2,'logitech',6638707,'memchanical'),
  (3,'microsoft',5715454,'memchanical'),
  (4,'corsair',2459355,'mechanical'),
  (5,'logitech',3160557,'mechanical'),
  (6,'MSI',4916583,' membrane'),
  (7,'microsoft',5166549,'mechanical'),
  (8,'MSI',7619985,' membrane'),
  (9,'logitech',3909099,' membrane'),
  (10,'asus',2155352,'mechanical'),
  (11,'microsoft',7085897,'memchanical'),
  (12,'corsair',9752971,'memchanical'),
  (13,'microsoft',5743944,' membrane'),
  (14,'logitech',9154871,' membrane'),
  (15,'razer',4768300,'memchanical'),
  (16,'logitech',5377695,' membrane'),
  (17,'microsoft',8967238,'memchanical'),
  (18,'logitech',8146113,'mechanical'),
  (19,'MSI',7248369,'mechanical'),
  (20,'corsair',4538247,' membrane');
  

INSERT INTO orders (idorder,description)
VALUES
  (1,'device assignment'),
  (2,'device assignment'),
  (3,'device assignment'),
  (4,'device assignment'),
  (5,'device assignment'),
  (6,'device assignment'),
  (7,'device assignment'),
  (8,'device assignment'),
  (9,'device assignment'),
  (10,'device assignment'),
  (11,'device assignment'),
  (12,'device assignment'),
  (13,'device assignment'),
  (14,'device assignment'),
  (15,'device assignment'),
  (16,'device assignment'),
  (17,'device assignment'),
  (18,'device assignment'),
  (19,'device assignment'),
  (20,'device assignment');

INSERT INTO computer (idcomputer,brand,serialnumber,idorder,idkeyboard,idmouse,idmonitor)
VALUES
  (1,'razer',8122144,13,16,7,13),
  (2,'asus',1112532,6,4,10,7),
  (3,'razer',6111130,13,10,11,6),
  (4,'asus',7875005,4,9,17,15),
  (5,'lenovo',9512202,4,18,13,5),
  (6,'razer',3539720,3,5,20,13),
  (7,'HP',5736492,16,6,20,4),
  (8,'HP',3560866,7,5,16,6),
  (9,'HP',3814507,9,9,13,18),
  (10,'DELL',2851769,10,4,14,18),
  (11,'lenovo',8843690,5,3,5,17),
  (12,'asus',5393328,20,9,9,11),
  (13,'asus',5456632,7,4,13,1),
  (14,'razer',5238827,19,17,4,7),
  (15,'asus',8202673,6,17,6,3),
  (16,'razer',7507438,2,17,13,14),
  (17,'razer',4773250,2,8,7,3),
  (18,'HP',5217462,5,16,9,3),
  (19,'lenovo',7225107,14,18,8,2),
  (20,'DELL',7408651,5,11,16,8);