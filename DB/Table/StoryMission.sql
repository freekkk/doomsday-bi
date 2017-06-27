-- auto Generated on 2017-06-23 11:24:41 
-- DROP TABLE IF EXISTS `story_mission`; 
CREATE TABLE `story_mission`(
    `point_id` INT (11) NOT NULL DEFAULT -1 COMMENT 'pointId',
    `id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `player_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'playerId',
    `player_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'playerName',
    `level` INT (11) NOT NULL DEFAULT -1 COMMENT 'level',
    `vip_level` INT (11) NOT NULL DEFAULT -1 COMMENT 'vipLevel',
    `vip_exp` INT (11) NOT NULL DEFAULT -1 COMMENT 'vipExp',
    `country` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'country',
    `language` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'language',
    `device_type` INT (11) NOT NULL DEFAULT -1 COMMENT 'deviceType',
    `device_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'deviceId',
    `alliance_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'allianceId',
    `platform_id` INT (11) NOT NULL DEFAULT -1 COMMENT 'platformId',
    `fvalue` INT (11) NOT NULL DEFAULT -1 COMMENT 'Fvalue',
    `rollback` INT (11) NOT NULL DEFAULT -1 COMMENT 'rollback',
    `reg_time` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'regTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`story_mission`';
