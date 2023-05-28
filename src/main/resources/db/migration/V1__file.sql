create table employees
(
    id      serial not null,
    name    varchar,
    surname varchar,
    age     int,
    primary key (id)
);

create table cars
(
    id    serial not null,
    stamp varchar,
    class varchar,
    year  int,
    color varchar,
    primary key (id)
);

create table employee_cars
(
    employee_id int,
    car_id int,
    foreign key (employee_id) references employees(id),
    foreign key (car_id) references cars(id)
);
