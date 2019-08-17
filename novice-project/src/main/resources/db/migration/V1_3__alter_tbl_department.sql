ALTER TABLE `tbl_department` 
ADD COLUMN `president_id` INT NULL AFTER `department_name`,
ADD INDEX `president_fk_idx` (`president_id` ASC) VISIBLE;
;
ALTER TABLE `novice-project-schema`.`tbl_department` 
ADD CONSTRAINT `president_fk`
  FOREIGN KEY (`president_id`)
  REFERENCES `novice-project-schema`.`tbl_employee` (`employee_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;