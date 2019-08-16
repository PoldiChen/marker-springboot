
#### label
CREATE TABLE `label` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


 #### marker
 CREATE TABLE `marker` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `title` varchar(45) NOT NULL,
   `content` text NOT NULL,
   `author` int(11) NOT NULL,
   `update_date` timestamp NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8


 #### marker_label
CREATE TABLE `marker_label` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `marker_id` int(11) NOT NULL,
   `label_id` int(11) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


#### marker_user
CREATE TABLE `marker_user` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `marker_id` int(11) NOT NULL,
   `user_id` int(11) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


 #### user
 CREATE TABLE `user` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   `display` varchar(45) NOT NULL,
   `email` varchar(45) NOT NULL,
   `password` varchar(45) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci