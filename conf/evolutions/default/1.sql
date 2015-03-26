# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table note (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_note primary key (id))
;

create table project (
  id                        varchar(255) not null,
  name                      varchar(255),
  score                     integer,
  profile_pic               varchar(255),
  constraint pk_project primary key (id))
;

create table regular_user (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_regular_user primary key (id))
;

create table user (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table note;

drop table project;

drop table regular_user;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

