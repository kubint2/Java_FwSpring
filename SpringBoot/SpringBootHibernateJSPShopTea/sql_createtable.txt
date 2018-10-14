CREATE TABLE ar_invdetail (
	code CHARACTER VARYING(8)  NOT NULL,
	code_product CHARACTER VARYING(20)  NOT NULL,
	code_customer CHARACTER VARYING(20)  NOT NULL,
	price_unit_exp NUMERIC,
	price_unit_transport NUMERIC,
	price_unit_other NUMERIC,
	count_product_exp NUMERIC,
    sum_price_exp NUMERIC,
	note TEXT,
    CONSTRAINT PK_invoice PRIMARY KEY (code)
);

CREATE TABLE ap_invdetail (
    code CHARACTER VARYING(8) NOT NULL,
	code_product CHARACTER VARYING(20)  NOT NULL,
	price_unit_ NUMERIC,
	price_unit_transport NUMERIC,
	price_unit_other NUMERIC,
	count_product_imp NUMERIC,
	sum_price_imp NUMERIC,
	note TEXT,
    CONSTRAINT PK_ap_invdetail PRIMARY KEY (code)
);

CREATE TABLE product_master(
    code CHARACTER VARYING(20)  NOT NULL,
    name CHARACTER VARYING(100),
	describe_product TEXT,
	link CHARACTER VARYING(200),
	note TEXT,
    CONSTRAINT PK_product_master PRIMARY KEY (code)
);

CREATE TABLE customer_master(
    code CHARACTER VARYING(20)  NOT NULL,
    name CHARACTER VARYING(100),
	describe_custommer TEXT,
	link CHARACTER VARYING(200),
	note TEXT,
    CONSTRAINT PK_customer_master PRIMARY KEY (code)
);



