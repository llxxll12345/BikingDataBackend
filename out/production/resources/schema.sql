DROP TABLE IF EXISTS city;
CREATE TABLE IF NOT EXISTS city(
    id BIGINT NOT NULL AUTO_INCREMENT,
    province_id BIGINT NOT NULL,
    city_name VARCHAR(20),
    description VARCHAR(20),
    PRIMARY KEY (id)
);

