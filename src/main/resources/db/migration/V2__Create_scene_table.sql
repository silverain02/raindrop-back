DROP TABLE IF EXISTS scene CASCADE;

CREATE TABLE scene (
    scene_id BIGINT AUTO_INCREMENT NOT NULL,
    social_id VARCHAR(255) NOT NULL,
    theme VARCHAR(255) NOT NULL,
    is_visible BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (scene_id),
    FOREIGN KEY (social_id) REFERENCES user(social_id)
);