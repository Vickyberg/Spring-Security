# CREATE TABLE `volabank`.`users` (
#                                    `username` VARCHAR(16) NOT NULL,
#                                    `email` VARCHAR(255) NULL,
#                                    `password` VARCHAR(32) NOT NULL,
#                                    `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP);
# create table volabank. authorities (
#                              `username` varchar(50) not null,
#                              `authority` varchar(50) not null,
#                              `id` int not null auto_increment,
#                              primary key (`id`)
#
# );

CREATE TABLE  `customer`(
    `id` int NOT NULL  AUTO_INCREMENT,
    `email` varchar(45) NOT NULL ,
    `pwd` varchar(100) NOT NULL ,
    `role` varchar(45) NOT NULL ,
    primary key (`id`)
);

insert into `customer` (`email`, `pwd`, `role`)
VALUES ('olamide124@gmail.com','54321', 'admin')