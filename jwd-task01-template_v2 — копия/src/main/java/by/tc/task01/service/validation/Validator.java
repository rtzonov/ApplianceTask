package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {

	public boolean isValidLaptop(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("MEMORY_ROM"));
			Double.parseDouble((String) params.get("BATTERY_CAPACITY"));
			Integer.parseInt((String) params.get("SYSTEM_MEMORY"));
			Integer.parseInt((String) params.get("DISPLAY_INCHS"));
			Double.parseDouble((String) params.get("CPU"));

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	public boolean isValidOven(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("POWER_CONSUMPTION"));
			Double.parseDouble((String) params.get("HEIGHT"));
			Double.parseDouble((String) params.get("WIDTH"));
			Integer.parseInt((String) params.get("WEIGHT"));
			Integer.parseInt((String) params.get("CAPACITY"));
			Integer.parseInt((String) params.get("DEPTH"));

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	public boolean isValidRefrigerator(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("POWER_CONSUMPTION"));
			Integer.parseInt((String) params.get("HEIGHT"));
			Integer.parseInt((String) params.get("WIDTH"));
			Integer.parseInt((String) params.get("WEIGHT"));
			Integer.parseInt((String) params.get("FREEZER_CAPACITY"));
			Double.parseDouble((String) params.get("OVERALL_CAPACITY"));

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	public boolean isValidVacuumCleaner(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("POWER_CONSUMPTION"));
			Integer.parseInt((String) params.get("MOTOR_SPEED_REGULATION"));
			Integer.parseInt((String) params.get("CLEANING_WIDTH"));
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	public boolean isValidTabletPC(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("MEMORY_ROM"));
			Integer.parseInt((String) params.get("BATTERY_CAPACITY"));
			Integer.parseInt((String) params.get("DISPLAY_INCHES"));
			Integer.parseInt((String) params.get("FLASH_MEMORY_CAPACITY"));

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	public boolean isValidSpeakers(Criteria criteria){
		try {
			Map<String, Object> params = criteria.getCriteria();
			Integer.parseInt((String) params.get("POWER_CONSUMPTION"));
			Integer.parseInt((String) params.get("NUMBER_OF_SPEAKERS"));
			Integer.parseInt((String) params.get("CORD_LENGTH"));

		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}

//you may add your own new classes