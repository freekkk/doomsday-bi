-- auto Generated on 2017-06-24 17:41:16 
-- DROP TABLE IF EXISTS `alliance_create_log`; 
CREATE TABLE `alliance_create_log`(
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
    `create_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    `land_count` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'landCount',
    `tech_score` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'techScore',
    `log_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'logTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`alliance_create_log`';
