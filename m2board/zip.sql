CREATE TABLE zipcode(
	id		    NUMBER(5)		primary key,      
	zipcode		VARCHAR2(7),                      
	sido		VARCHAR2(6),                      
	gugun		VARCHAR2(21),                     
	dong		VARCHAR2(36),			  	
	ri			VARCHAR2(60),                   
	bunji		VARCHAR2(60)
);


-- 주소 목록 얻어오는 쿼리
select substr(zipcode, 1, 3) as zipcode1,
 	   substr(zipcode, 5, 3) as zipcode2,
 	   sido || ' ' || gugun || ' ' || dong || ' ' ||
 	   ri || ' ' || bunji as address1
from zipcode
where dong like '%' || '구로' || '%';


