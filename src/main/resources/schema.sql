DROP TABLE IF EXISTS city;
CREATE TABLE IF NOT EXISTS city(
    id BIGINT NOT NULL AUTO_INCREMENT,
    province_id BIGINT NOT NULL,
    city_name VARCHAR(20),
    description VARCHAR(20),
    PRIMARY KEY (id)
);

drop table if exists location;
create table if not exists locaiton(
    loc_id BIGINT NOT NULL AUTO_INCREMENT,
    loc_name VARCHAR(50) NOT NULL ,
    user_id  BIGINT NOT NULL ,
    tag VARCHAR(200),
    route_id BIGINT,
    urls VARCHAR(500),
    upvotes BIGINT,
    is_private BIT,
    longitude DOUBLE,
    latitude DOUBLE,
    region VARCHAR(200)
);

