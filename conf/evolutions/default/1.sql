# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table student (
  id                        integer not null,
  fb_id                     varchar(255),
  name                      varchar(255),
  cgnext                    float,
  cglast                    float,
  constraint pk_student primary key (id))
;

create sequence student_seq;




# --- !Downs

drop table if exists student cascade;

drop sequence if exists student_seq;

