# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table project (
  id                        varchar(255) not null,
  name                      varchar(255),
  pass                      varchar(255),
  vscore                    integer,
  rscore                    integer,
  profile_pic               varchar(255),
  constraint pk_project primary key (id))
;

create table project_account (
  id                        varchar(255) not null,
  name                      varchar(255),
  pass                      varchar(255),
  vscore                    integer,
  rscore                    integer,
  profile_pic               varchar(255),
  constraint pk_project_account primary key (id))
;

create table regular_user (
  id                        varchar(255) not null,
  name                      varchar(255),
  pass                      varchar(255),
  constraint pk_regular_user primary key (id))
;

create sequence project_seq;

create sequence project_account_seq;

create sequence regular_user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists project;

drop table if exists project_account;

drop table if exists regular_user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists project_seq;

drop sequence if exists project_account_seq;

drop sequence if exists regular_user_seq;

