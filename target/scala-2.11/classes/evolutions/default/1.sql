# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table project (
  id                        varchar(255) not null,
  name                      varchar(255),
  score                     integer,
  constraint pk_project primary key (id))
;

create sequence project_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists project;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists project_seq;

