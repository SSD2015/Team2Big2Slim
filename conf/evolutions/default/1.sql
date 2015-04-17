# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table member (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  surname                   varchar(255),
  ku_no                     varchar(255),
  project_id                bigint,
  constraint pk_member primary key (id))
;

create table note (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_note primary key (id))
;

create table project (
  id                        integer auto_increment not null,
  project_name              varchar(255),
  vote_score                integer,
  pic_project               varchar(255),
  type_app                  varchar(255),
  sc1                       varchar(255),
  sc2                       varchar(255),
  sc3                       varchar(255),
  constraint pk_project primary key (id))
;

create table rating_criteria (
  id                        integer auto_increment not null,
  criteria_name             varchar(255),
  constraint pk_rating_criteria primary key (id))
;

create table rating_criteria_list (
  id                        integer auto_increment not null,
  constraint pk_rating_criteria_list primary key (id))
;

create table rating_record (
  id                        integer auto_increment not null,
  project_id                integer,
  criteria_id               integer,
  score                     integer,
  constraint pk_rating_record primary key (id))
;

create table regular_user (
  id                        integer auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_regular_user primary key (id))
;

create table user (
  id                        integer auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (id))
;

create table voting_criteria (
  id                        integer auto_increment not null,
  criteria_name             varchar(255),
  constraint pk_voting_criteria primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table member;

drop table note;

drop table project;

drop table rating_criteria;

drop table rating_criteria_list;

drop table rating_record;

drop table regular_user;

drop table user;

drop table voting_criteria;

SET FOREIGN_KEY_CHECKS=1;

