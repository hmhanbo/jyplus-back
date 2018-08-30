CREATE TABLE `mytest`.`t_trouble_bond`(
          trouble_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
          trouble_date Date,
          trouble_type VARCHAR(64),
          trouble_troubler VARCHAR(64),
          ph_trader VARCHAR(16),
          ph_manger VARCHAR(16),
          dealer_corp VARCHAR(16),
          dealer_people VARCHAR(16),
          counterparty_corp VARCHAR(16),
          counterparty_people VARCHAR(16),
          trouble_detail VARCHAR(256),
          trouble_problem VARCHAR(64),
          trouble_solve VARCHAR(64),
          trouble_solve_people VARCHAR(16)
		  )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;