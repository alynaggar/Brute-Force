use http;

CREATE TABLE request(
id BIGINT NOT NULL AUTO_INCREMENT,
response_code INTEGER,
response_message VARCHAR(50),
request_body VARCHAR(500),
url VARCHAR(75),
PRIMARY KEY(id)
)
