create table userid(
	id		varchar2(30)		primary key
);
insert into userid values('son');
insert into userid values('hhaneunjoo');

select count(id) as cnt from userid where id='son';