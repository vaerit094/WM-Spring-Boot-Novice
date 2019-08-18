ALTER TABLE `tbl_employee` 
DROP FOREIGN KEY `department_fk`;
ALTER TABLE `tbl_employee` 
CHANGE COLUMN `depeartment_id` `department_id` INT(11) NULL DEFAULT NULL ;
ALTER TABLE `tbl_employee` 
ADD CONSTRAINT `department_fk`
  FOREIGN KEY (`department_id`)
  REFERENCES `tbl_department` (`department_id`);
