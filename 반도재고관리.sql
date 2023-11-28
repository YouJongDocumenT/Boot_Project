CREATE TABLE "stock_table" (
	"product_code"	number		NOT NULL,
	"length"	number		NOT NULL,
	"weight"	number		NOT NULL,
	"purchase_price"	number		NULL,
	"quantity"	number		NULL
);

CREATE TABLE "clientcomp_table" (
	"client_company"	varchar2(200)		NOT NULL,
	"adress"	varchar2(200)		NULL,
	"comp_number"	varchar2(200)		NULL,
	"email"	varchar2(200)		NULL
);

CREATE TABLE "machine_table" (
	"responsibility"	varchar2(200)		NULL,
	"client_company"	varchar2(200)		NOT NULL,
	"machine_name"	varchar2(200)		NULL
);

CREATE TABLE "purchasecomp_table" (
	"purchase_company"	varchar2(200)		NOT NULL,
	"adress"	varchar2(200)		NULL,
	"comp_number"	varchar2(200)		NULL,
	"email"	varchar2(200)		NULL
);

CREATE TABLE "purchase_table" (
	"purchase_company"	varchar2(200)		NOT NULL,
	"product_code"	number		NOT NULL,
	"purchase_date"	date		NOT NULL,
	"pur_quantity"	number		NULL,
	"purchase_price"	number		NULL,
	"pur_length"	number		NULL,
	"pur_weight"	number		NULL
);

CREATE TABLE "price_table" (
	"stock_price"	number		NULL,
	"allpurchcnt"	number		NULL,
	"allsellcnt"	number		NULL
);

CREATE TABLE "sell_product" (
	"responsibility"	varchar2(200)		NULL,
	"product_code"	number		NOT NULL,
	"ph_number"	number		NULL,
	"sell_date"	date		NOT NULL,
	"sell_quantity"	number		NULL,
	"sell_length"	number		NULL,
	"sell_weight"	number		NULL,
	"tax"	number		NOT NULL
);

CREATE TABLE "product_table" (
	"product_code"	number		NOT NULL,
	"product"	varchar2(200)		NOT NULL,
	"price"	number		NOT NULL
);

ALTER TABLE "clientcomp_table" ADD CONSTRAINT "PK_CLIENTCOMP_TABLE" PRIMARY KEY (
	"client_company"
);

ALTER TABLE "machine_table" ADD CONSTRAINT "PK_MACHINE_TABLE" PRIMARY KEY (
	"responsibility"
);

ALTER TABLE "purchasecomp_table" ADD CONSTRAINT "PK_PURCHASECOMP_TABLE" PRIMARY KEY (
	"purchase_company"
);

ALTER TABLE "product_table" ADD CONSTRAINT "PK_PRODUCT_TABLE" PRIMARY KEY (
	"product_code"
);

