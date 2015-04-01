# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table member (
  id                        integer primary key AUTOINCREMENT,
  name                      varchar(255),
  surname                   varchar(255),
  ku_no                     varchar(255),
  project_id                integer)
;

create table project (
  id                        integer primary key AUTOINCREMENT,
  project_name              varchar(255),
  pic_project               varchar(255),
  type_app                  varchar(255))
;




# --- !Downs

PRAGMA foreign_keys = OFF;

drop table member;

drop table project;

PRAGMA foreign_keys = ON;

