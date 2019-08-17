ALTER TABLE `tbl_department` 
ADD COLUMN `president_id` INT NULL AFTER `department_name`,
ADD INDEX `president_fk_idx` (`president_id` ASC) VISIBLE;
;
ALTER TABLE `tbl_department` 
ADD CONSTRAINT `president_fk`
  FOREIGN KEY (`president_id`)
  REFERENCES `tbl_employee` (`employee_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
ALTER TABLE `tbl_department` 
DROP FOREIGN KEY `president_fk`;
ALTER TABLE `tbl_department` 
DROP COLUMN `president_id`,
DROP INDEX `president_fk_idx` ;
;
