--CREATE OR REPLACE DATABASE 'market_app';
--GRANT ALL ON `market_app`.* TO 'admin'@'%';
create table brand(
    id integer not null,
    brand varchar(255) not null,  
    primary key(id)
); 
create table product(
    id integer not null, 
    product varchar(255) not null,  
    primary key(id)
); 
create table price(
    id integer not null,
    brand_id integer not null, 
    start_date datetime,
    end_date datetime,
    price_list integer,
    product_id integer not null,
    priority integer,
    price decimal(10,2),
    curr varchar(3) not null, 
    primary key(id),
    foreign key (brand_id) references brand(id),
    foreign key (product_id) references product(id)
);
insert into brand values(1,'ADIDAS');
insert into product values(35455,'SHOES');
insert into price values(1, 1, STR_TO_DATE('2020-06-14-00.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-12-31-23.59.59', '%Y-%m-%d-%H.%i.%s'), 1, 35455, 0, 35.50, 'USD');
insert into price values(2, 1, STR_TO_DATE('2020-06-14-15.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-06-14-18.30.00', '%Y-%m-%d-%H.%i.%s'), 2, 35455, 1, 25.45, 'USD');
insert into price values(3, 1, STR_TO_DATE('2020-06-15-00.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-06-15-11.00.00', '%Y-%m-%d-%H.%i.%s'), 3, 35455, 1, 30.50, 'USD');
insert into price values(4, 1, STR_TO_DATE('2020-06-15-16.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-12-31-23.59.59', '%Y-%m-%d-%H.%i.%s'), 4, 35455, 1, 38.95, 'USD');
