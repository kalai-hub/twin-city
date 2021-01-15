insert into treatments (scid, treatment_type, name) values (900, "Minoxidil(Scalp)", "Kalai");
insert into treatments (scid, treatment_type, name) values (901, "Medications for ulcer(Antibiotic)","Kamalini");
insert into treatments (scid, treatment_type, name) values (902, "Nil","Sanjeevi");
insert into treatments (scid, treatment_type, name) values (903, "Chemotherapy, Craniotomy", "Muthumani");
insert into treatments (scid, treatment_type, name) values (904, "Food Control", "Gopi");
insert into treatments (scid, treatment_type, name) values (905, "Bariatric surgery", "Kiran");

insert into details (sid, weight, gender, age, problems, scid) values (100,  67.25, "Male", 22, "Dust allergy, Sinus", 900);
insert into details (sid, weight, gender, age, problems, scid) values (101,  38.65, "Female", 22, "Gastric", 901);
insert into details (sid, weight, gender, age, problems, scid) values (102,  70.60, "Male", 25, "Acne", 902);
insert into details (sid, weight, gender, age, problems, scid) values (103,  40, "Male", 60, "Tumor", 903);
insert into details (sid, weight, gender, age, problems, scid) values (104,  75.85, "Male", 30, "Hypotension", 904);
insert into details (sid, weight, gender, age, problems, scid) values (105,  73.35, "Male", 28, "Pneumonia", 905);

insert into ailments (oid, scid, sid, consultation) values (500, 900, 100, "Cardiologist, ENT");
insert into ailments (oid, scid, sid, consultation) values (501, 901, 101, "Dentist, Gastroenterologist");
insert into ailments (oid, scid, sid, consultation) values (502, 902, 102, "MBBS");
insert into ailments (oid, scid, sid, consultation) values (503, 903, 103, "Oncologist");
insert into ailments (oid, scid, sid, consultation) values (504, 904, 104, "Ayurvedic");
insert into ailments (oid, scid, sid, consultation) values (505, 905, 105, "Lung Specialist");
