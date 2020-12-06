create table programator(
programare_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pacient_id INT,
angajat_id INT,
data_de_inceput TIMESTAMP,
data_de_sfarsit TIMESTAMP,
FOREIGN KEY (pacient_id) REFERENCES pacienti(id),
FOREIGN KEY (angajat_id) REFERENCES angajati(id)
);

create table fise_pacienti(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pacient_id INT,
diagnostic_id INT,
medic_id INT,
data_diagnostic DATE,
FOREIGN KEY (pacient_id) REFERENCES pacienti(id),
FOREIGN KEY (diagnostic_id) REFERENCES diagnostice(id),
FOREIGN KEY (medic_id) REFERENCES medici(id));


create table abonamente(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
tip_abonament VARCHAR(255),
pret VARCHAR(255),
duarata_zile INT
);

create table registru_abonament(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pacient_id INT,
abonament_id INT,
data_de_inceput TIMESTAMP,
data_de_sfarsit TIMESTAMP,
FOREIGN KEY (pacient_id) REFERENCES pacienti(id),
FOREIGN KEY (abonament_id) REFERENCES abonamente(id)
);

RENAME TABLE `registru_abonament` TO registru_abonamente;


