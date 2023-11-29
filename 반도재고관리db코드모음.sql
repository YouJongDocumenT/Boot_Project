CREATE TABLE stock_table (
    product_code NUMBER NOT NULL,
    length NUMBER NOT NULL,
    weight NUMBER NOT NULL,
    purchase_price NUMBER,
    quantity NUMBER
);

CREATE TABLE clientcomp_table (
    client_id number NOT NULL,
    client_company VARCHAR2(200) NOT NULL,
    adress VARCHAR2(200),
    comp_number VARCHAR2(200),
    email VARCHAR2(200)
);

CREATE TABLE machine_table (
    client_id number NOT NULL,
    responsibility_code number NOT NULL,
    machine_name VARCHAR2(200),
    responsibility VARCHAR2(200)
);

CREATE TABLE purchasecomp_table (
    purchase_id NUMBER NOT NULL,
    purchase_company VARCHAR2(200) NOT NULL,
    adress VARCHAR2(200),
    comp_number VARCHAR2(200),
    email VARCHAR2(200),
    CONSTRAINT PK_PURCHASECOMP_TABLE PRIMARY KEY (purchase_id)
);

CREATE TABLE purchase_table (
    purchase_id NUMBER NOT NULL,
    product_code NUMBER NOT NULL,
    purchase_date DATE NOT NULL,
    pur_quantity NUMBER,
    purchase_price NUMBER,
    pur_length NUMBER,
    pur_weight NUMBER,
    CONSTRAINT PK_PURCHASE_TABLE PRIMARY KEY (purchase_id)
);

CREATE TABLE price_table (
    stock_price NUMBER,
    allpurchcnt NUMBER,
    allsellcnt NUMBER
);

CREATE TABLE sell_product (
    responsibility VARCHAR2(200),
    product_code number NOT NULL,
    ph_number NUMBER,
    sell_date DATE NOT NULL,
    sell_quantity NUMBER,
    sell_length NUMBER,
    sell_weight NUMBER,
    tax NUMBER NOT NULL
);

CREATE TABLE product_table (
    product_code NUMBER NOT NULL,
    product VARCHAR2(200) NOT NULL,
    price NUMBER NOT NULL,
    CONSTRAINT PK_PRODUCT_TABLE PRIMARY KEY (product_code)
);

SELECT * FROM purchase_table;

CREATE SEQUENCE purchasecomp_table_SEQ
START WITH 1
INCREMENT BY 1;

purchasecomp_table_SEQ.NEXTVAL

commit;

ALTER TABLE purchase_table
ADD CONSTRAINT PK_PURCHASE_TABLE PRIMARY KEY (purchase_id);


ALTER TABLE purchase_table
ADD CONSTRAINT FK_PURCHASE_ID
FOREIGN KEY (purchase_id)
REFERENCES purchasecomp_table(purchase_id);


ALTER TABLE purchase_table DROP COLUMN product_code;

-- product 칼럼 추가
ALTER TABLE purchase_table ADD product VARCHAR2(200) NOT NULL;

ALTER TABLE purchase_table
MODIFY purchase_date DATE DEFAULT SYSDATE NOT NULL;

ALTER TABLE purchase_table
ALTER COLUMN purchase_date DROP DEFAULT;

ALTER TABLE purchase_table
MODIFY purchase_date DATE NOT NULL;

ALTER TABLE purchase_table
ADD new_purchase_date DATE;

UPDATE purchase_table
SET new_purchase_date = purchase_date;

ALTER TABLE purchase_table
DROP COLUMN purchase_date;

ALTER TABLE purchase_table
RENAME COLUMN new_purchase_date TO purchase_date;

ALTER TABLE purchase_table
MODIFY purchase_date DATE DEFAULT SYSDATE;


SELECT * FROM purchase_table;


SELECT purchase_id, purchase_company, adress, comp_number, email
	   		FROM purchasecomp_table
	   		WHERE purchase_id = 1;
        
SELECT Product, purchase_date, pur_quantity, purchase_price, pur_length, pur_weight
	   		FROM purchase_table
	   		WHERE purchase_id = 1;
        
        
        
ALTER TABLE purchase_table
DROP CONSTRAINT PK_PURCHASE_TABLE;


ALTER TABLE purchase_table
ADD CONSTRAINT FK_PURCHASE_TABLE FOREIGN KEY (purchase_id) REFERENCES purchasecomp_table(purchase_id);

ALTER TABLE purchase_table
DROP CONSTRAINT FK_PURCHASE_TABLE;

ALTER TABLE purchase_table
ADD CONSTRAINT FK_NEW_PURCHASE_TABLE FOREIGN KEY (purchase_id) REFERENCES purchasecomp_table(purchase_id);


SELECT constraint_name
FROM user_constraints
WHERE table_name = 'purchase_table';
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        