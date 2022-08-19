--CREATE OR REPLACE DATABASE 'market_app';
--GRANT ALL ON `market_app`.* TO 'admin'@'%';
create table BRAND(
    ID integer not null,
    BRAND varchar(255) not null,  
    primary key(ID)
); 
create table PRODUCT(
    ID integer not null, 
    PRODUCT varchar(255) not null,  
    primary key(ID)
); 
create table PRICE(
    ID integer not null,
    BRAND_ID integer not null, 
    START_DATE datetime,
    END_DATE datetime,
    PRICE_LIST integer,
    PRODUCT_ID integer not null,
    PRIORITY integer,
    PRICE decimal(10,2),
    CURR varchar(3) not null, 
    primary key(ID),
    foreign key (BRAND_ID) references BRAND(ID),
    foreign key (PRODUCT_ID) references PRODUCT(ID)
);
insert into BRAND values(1,'ADIDAS');
insert into PRODUCT values(35455,'SHOES');
insert into PRICE values(1, 1, STR_TO_DATE('2020-06-14-00.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-12-31-23.59.59', '%Y-%m-%d-%H.%i.%s'), 1, 35455, 0, 35.50, 'USD');
insert into PRICE values(2, 1, STR_TO_DATE('2020-06-14-15.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-06-14-18.30.00', '%Y-%m-%d-%H.%i.%s'), 2, 35455, 1, 25.45, 'USD');
insert into PRICE values(3, 1, STR_TO_DATE('2020-06-15-00.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-06-15-11.00.00', '%Y-%m-%d-%H.%i.%s'), 3, 35455, 1, 30.50, 'USD');
insert into PRICE values(4, 1, STR_TO_DATE('2020-06-15-16.00.00', '%Y-%m-%d-%H.%i.%s'), STR_TO_DATE('2020-12-31-23.59.59', '%Y-%m-%d-%H.%i.%s'), 4, 35455, 1, 38.95, 'USD');
