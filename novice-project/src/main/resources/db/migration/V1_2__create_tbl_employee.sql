CREATE TABLE `tbl_employee` (
  `employee_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(250) NOT NULL,
  `last_name` VARCHAR(250) NULL,
  `phone_number` VARCHAR(45) NULL,
  `birth_date` DATETIME NULL,
  `depeartment_fk` INT NULL,
  PRIMARY KEY (`employee_id`),
  INDEX `department_fk_idx` (`depeartment_fk` ASC) VISIBLE,
  CONSTRAINT `department_fk`
    FOREIGN KEY (`depeartment_fk`)
    REFERENCES `novice-project-schema`.`tbl_department` (`department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);