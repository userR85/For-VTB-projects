create table TESTUSER.PERSON(ID INTEGER NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY
                (START WITH 1, INCREMENT BY 1), NAME varchar(100) NOT NULL, POSITION varchar(100), AGE varchar(3), SALARY varchar(10));

insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Иван Петров', 'Директор', '50', '500000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Николай Печкин', 'Заместитель Директора', '48', '450000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Василий Быков', 'Начальник отдела' , '45', '400000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Леонид Белов', 'Начальник отдела', '43', '380000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Владимир Смирнов', 'Главный специалист', '35', '350000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Вячеслав Давыдов', 'Главный специалист', '30', '330000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Петр Елисеев', 'Ведущий специалист', '29', '300000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Александр Пчельников', 'Ведущий специалист', '27', '280000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('Алексей Маслов', 'Старший специалист', '25', '230000');
