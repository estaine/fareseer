insert into airline (name, iata_code) values ('WizzAir', 'W6');

insert into airport (iata_code, name, city, country, timezone) values ('VNO', 'Vilnius International', 'Vilnius', 'Lithuania', 'Europe/Vilnius');
insert into airport (iata_code, name, city, country, timezone) values ('KUN', 'Kaunas International', 'Kaunas', 'Lithuania', 'Europe/Vilnius');
insert into airport (iata_code, name, city, country, timezone) values ('RIX', 'Riga International', 'Riga', 'Latvia', 'Europe/Riga');
insert into airport (iata_code, name, city, country, timezone) values ('WAW', 'Warsaw Chopin', 'Warsaw', 'Poland', 'Europe/Warsaw');
insert into airport (iata_code, name, city, country, timezone) values ('GDN', 'Gdansk Lech Walesa', 'Gdansk', 'Poland', 'Europe/Warsaw');
insert into airport (iata_code, name, city, country, timezone) values ('OSL', 'Oslo Gardermoen', 'Oslo', 'Norway', 'Europe/Oslo');
insert into airport (iata_code, name, city, country, timezone) values ('TRF', 'Sandefjord Torp', 'Sandefjord', 'Norway', 'Europe/Oslo');
insert into airport (iata_code, name, city, country, timezone) values ('BGO', 'Bergen Flesland', 'Bergen', 'Norway', 'Europe/Oslo');
insert into airport (iata_code, name, city, country, timezone) values ('SVG', 'Stavanger Sola', 'Stavanger', 'Norway', 'Europe/Oslo');
insert into airport (iata_code, name, city, country, timezone) values ('AES', 'Alesund Vigra', 'Alesund', 'Norway', 'Europe/Oslo');

insert into airport_alias(alias, airport_id) (select 'Okecie', id from airport where iata_code = 'WAW');
insert into airport_alias(alias, airport_id) (select 'Rebiechowo', id from airport where iata_code = 'GDN');
insert into airport_alias(alias, airport_id) (select 'Oslo Torp', id from airport where iata_code = 'TRF');


insert into currency(iso_code, name) values ('EUR', 'Euro');
insert into currency(iso_code, name) values ('NOK', 'Norwegian Krone');
insert into currency(iso_code, name) values ('PLN', 'Polish zloty');