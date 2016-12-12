# --- First database schema

# --- !Ups

create table restaurante (
  id                        bigint not null,
  name                      varchar(255),
  cantidad					bigint not null,
  precio					bigint not null,
  constraint pk_restaurante primary key (id))
;


create sequence restaurante_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists restaurante;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists restaurante_seq;