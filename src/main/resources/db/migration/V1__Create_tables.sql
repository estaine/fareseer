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
    alias varchar(255),
    city varchar(255),
    country varchar(255),
    timezone varchar(255),
    primary key(id)
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
    departure_utc_timestamp timestamp null,
    arrival_utc_timestamp timestamp null,
    fare double not null,
    currency_id bigint not null,
    primary key(id),
    foreign key(airport_from_id) references airport(id),
    foreign key(airport_to_id) references airport(id),
    foreign key(airline_id) references airline(id),
    foreign key(currency_id) references currency(id)
);
