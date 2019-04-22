create table TESTUSER.PERSON(ID INTEGER NOT NULL 
                PRIMARY KEY GENERATED ALWAYS AS IDENTITY
                (START WITH 1, INCREMENT BY 1), NAME varchar(100) NOT NULL, POSITION varchar(100), AGE varchar(3), SALARY varchar(10));

insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('���� ������', '��������', '50', '500000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('������� ������', '����������� ���������', '48', '450000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('������� �����', '��������� ������' , '45', '400000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('������ �����', '��������� ������', '43', '380000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('�������� �������', '������� ����������', '35', '350000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('�������� �������', '������� ����������', '30', '330000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('���� �������', '������� ����������', '29', '300000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('��������� ����������', '������� ����������', '27', '280000');
insert into TESTUSER.PERSON (Name, Position, Age,Salary) values ('������� ������', '������� ����������', '25', '230000');
