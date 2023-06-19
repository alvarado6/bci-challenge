create table if not exists users
(
    id         varchar(50),
    name       varchar(100),
    email      varchar(400) unique,
    password   varchar(100),
    created    timestamp,
    modified   timestamp,
    last_login timestamp,
    token      text,
    is_active  boolean default true,
    constraint pk_u_id primary key (id)
);

create table if not exists phone
(
    id         varchar(50),
    users_id   varchar(50),
    number     varchar(100),
    citycode   varchar(10),
    contrycode varchar(10),
    constraint pk_p_id primary key (id)
);

ALTER TABLE phone
    ADD CONSTRAINT fk_p_users_id FOREIGN KEY (users_id) REFERENCES users (id);