# 실습에 필요한 테이블 생성

## 게시판 테이블 생성
create table ex_board(
    bno int not null,
    titl varchar(255) not null,
    cont text,
    rdt datetime not null
    
);
##  테이블의 주키
alter table ex_board
add constraint ex_board_pk primary key(bno);

alter table ex_board
modify column bno int not null auto_increment;

describe ex_board;

insert into ex_board(titl, cont, rdt) values('subject1','contents1',now());
    insert into ex_board(titl, cont, rdt) values('subject2','contents2',now());
    insert into ex_board(titl, cont, rdt) values('subject3','contents3',now());
insert into ex_board(titl, cont, rdt) values('subject4','contents4',now());
insert into ex_board(titl, cont, rdt) values('subject5','contents5',now());
insert into ex_board(titl, cont, rdt) values('subject6','contents6',now());
insert into ex_board(titl, cont, rdt) values('subject7','contents7',now());
insert into ex_board(titl, cont, rdt) values('subject8','contents8',now());
insert into ex_board(titl, cont, rdt) values('subject9','contents9',now());
insert into ex_board(titl, cont, rdt) values('subject10','contents10',now());


select *
from ex_board;

update ex_board set titl = 'nono' where cont='content';