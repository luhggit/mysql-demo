create table student
(
  id   int auto_increment
  comment '主键'
    primary key,
  name varchar(100) not null
  comment '姓名'
)
  comment '学生表';


create table book
(
  id   int auto_increment
  comment '主键'
    primary key,
  name varchar(100) not null
  comment '书名'
)
  comment '书本表';

create table borrow_record
(
  id         int auto_increment
  comment '主键'
    primary key,
  book_id    int not null
  comment '书本id',
  student_id int not null
  comment '学生id'
)
  comment '借阅记录';