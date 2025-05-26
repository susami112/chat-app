CREATE TABLE IF NOT EXISTS users (
  id        SERIAL          NOT NULL,
  name      VARCHAR(128)    NOT NULL,
  email     VARCHAR(128)    NOT NULL UNIQUE,
  password  VARCHAR(512)    NOT NULL,
  PRIMARY KEY (id)
);