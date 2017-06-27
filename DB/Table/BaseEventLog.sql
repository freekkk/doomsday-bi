-- auto Generated on 2017-06-24 18:31:06 
-- DROP TABLE IF EXISTS `base_event_log`; 
CREATE TABLE `base_event_log`(
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
    `fvalue` INT (11) COMMENT 'Fvalue',
    `rollback` INT (11) COMMENT 'rollback',
    `event_id` VARCHAR (50) COMMENT 'eventId',
    `log_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'logTime',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`base_event_log`';
