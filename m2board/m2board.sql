
/* Drop Tables */

DROP TABLE tbl_board CASCADE CONSTRAINTS;
DROP TABLE tbl_member CASCADE CONSTRAINTS;

/* Drop Sequences */

DROP SEQUENCE seq_board;


/* Create Sequences */

CREATE SEQUENCE seq_board INCREMENT BY 1 START WITH 1;


/* Create Tables */

CREATE TABLE tbl_board
(
	no number NOT NULL,
	title varchar2(100) NOT NULL,
	content varchar2(4000) NOT NULL,
	regdate date DEFAULT sysdate NOT NULL,
	readcount number DEFAULT 0 NOT NULL,
	id varchar2(30) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE tbl_member
(
	id varchar2(30) NOT NULL,
	password varchar2(120) NOT NULL,
	name varchar2(30) NOT NULL,
	birth date,
	phone varchar2(30),
	zipcode varchar2(6),
	address1 varchar2(120),
	address2 varchar2(60),
	PRIMARY KEY (id)
);


/* Create Foreign Keys */

ALTER TABLE tbl_board
	ADD FOREIGN KEY (id)
	REFERENCES tbl_member (id)
;

INSERT INTO TBL_MEMBER(id,name,password,birth) VALUES('abc','에이비','1111','2000-01-01');

INSERT INTO TBL_BOARD(no,title,content,id) VALUES(seq_board.nextval, 'gg', 'gg','son') ;

select count(*) as cnt from tbl_member where id='abc';

select * from tbl_member;
