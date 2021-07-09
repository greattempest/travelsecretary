/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2021/7/6 15:18:55                            */
/*==============================================================*/


drop table if exists checklist;

drop table if exists listitem;

drop table if exists schedule;

drop table if exists traffice;

drop table if exists travel;

drop table if exists user;

/*==============================================================*/
/* Table: checklist                                             */
/*==============================================================*/
create table checklist
(
   id                   varchar(50) not null,
   userid               varchar(50),
   travelid             varchar(50),
   status               varchar(2),
   isdefault            varchar(2),
   primary key (id)
);

/*==============================================================*/
/* Table: listitem                                              */
/*==============================================================*/
create table listitem
(
   id                   varchar(50) not null,
   listid               varchar(50),
   checked              varchar(2),
   name                 varchar(50),
   remark               varchar(100),
   amount               INTEGER(3),
   status               varchar(2),
   primary key (id)
);

/*==============================================================*/
/* Table: schedule                                              */
/*==============================================================*/
create table schedule
(
   id                   varchar(50) not null,
   userid               varchar(50),
   travelid             varchar(50),
   scheduleday          date,
   starttime            varchar(8),
   endtime              varchar(8),
   title                varchar(100),
   detail               varchar(1000),
   remark               varchar(100),
   status               varchar(2),
   position             varchar(100),
   country              varchar(5),
   primary key (id)
);

/*==============================================================*/
/* Table: traffice                                              */
/*==============================================================*/
create table traffice
(
   id                   varchar(50) not null,
   scheduleid           varchar(50),
   thedesc               varchar(1000),
   picure               varchar(50),
   status               varchar(2),
   shift                varchar(100),
   primary key (id)
);

/*==============================================================*/
/* Table: travel                                                */
/*==============================================================*/
create table travel
(
   id                   varchar(50) not null,
   userid               varchar(50),
   title                varchar(100),
   thedesc               varchar(500),
   days                 integer(4),
   startday             date,
   endday               date,
   status               varchar(2),
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   VARCHAR(50) not null,
   username             VARCHAR(50),
   password             varchar(100),
   fullname             varchar(50),
   mobile               varchar(20),
   status               varchar(2),
   regdate              DATE,
   logdate              DATE,
   nickname             varchar(20),
   email                varchar(100),
   primary key (id)
);

alter table checklist add constraint FK_Reference_6 foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table checklist add constraint FK_Reference_7 foreign key (travelid)
      references travel (id) on delete restrict on update restrict;

alter table listitem add constraint FK_Reference_8 foreign key (listid)
      references checklist (id) on delete restrict on update restrict;

alter table schedule add constraint FK_Reference_1 foreign key (userid)
      references user (id) on delete restrict on update restrict;

alter table schedule add constraint FK_Reference_4 foreign key (travelid)
      references travel (id) on delete restrict on update restrict;

alter table traffice add constraint FK_Reference_3 foreign key (scheduleid)
      references schedule (id) on delete restrict on update restrict;

alter table travel add constraint FK_Reference_5 foreign key (userid)
      references user (id) on delete restrict on update restrict;

