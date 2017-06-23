create table airline (
    id bigint not null auto_increment,
    name varchar(255) not null,
    iata_code char(2) not null,
    primary key(id)
);

create table airport (
    id bigint not null auto_increment,
    iata_code char(3) not null,
    name varchar(255) not null,
    city varchar(255) not null,
    country varchar(255) not null,
    timezone varchar(255) not null,
    primary key(id)
);

create table airport_alias (
    id bigint not null auto_increment,
    alias varchar(255) not null,
    airport_id bigint not null,
    primary key(id),
    foreign key(airport_id) references airport(id)
);

create table currency (
    id bigint not null auto_increment,
    iso_code char(3) not null,
    name varchar(255) not null,
    primary key(id)
);

create table flight (
    id bigint not null auto_increment,
    airport_from_id bigint not null,
    airport_to_id bigint not null,
    airline_id bigint not null,
    number int not null,
    departure_time_utc timestamp null,
    arrival_time_utc timestamp null,
    fare double not null,
    currency_id bigint not null,
    primary key(id),
    foreign key(airport_from_id) references airport(id),
    foreign key(airport_to_id) references airport(id),
    foreign key(airline_id) references airline(id),
    foreign key(currency_id) references currency(id)
);

create table connection (
    id bigint not null auto_increment,
    airline_id bigint not null,
    first_airport_id bigint not null,
    second_airport_id bigint not null,
    primary key(id),
    foreign key(airline_id) references airline(id),
    foreign key(first_airport_id) references airport(id),
    foreign key(second_airport_id) references airport(id)
);