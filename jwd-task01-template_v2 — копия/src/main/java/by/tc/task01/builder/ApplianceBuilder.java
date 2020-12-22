package by.tc.task01.builder;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;


import java.util.Map;

public class ApplianceBuilder {

    public Appliance build(Criteria criteria){
        Map<String, Object> parameters = criteria.getCriteria();
        Appliance appliance = null;
        switch (criteria.getApplianceType()) {
            case "Oven": {
                int powerConsumption = (Integer.parseInt( (String) parameters.get("POWER_CONSUMPTION")));
                int weight = (Integer.parseInt((String)parameters.get("WEIGHT")));
                int capacity = (Integer.parseInt((String)  parameters.get("CAPACITY")));
                int depth = (Integer.parseInt((String) parameters.get("DEPTH")));
                double height = (Double.parseDouble((String)parameters.get("HEIGHT")));
                double width = (Double.parseDouble((String)parameters.get("WIDTH")));
                appliance = new Oven(powerConsumption, weight, capacity, depth, height, width);
                break;
            }
            case "Laptop": {
                double batteryCapacity = (Double.parseDouble((String)parameters.get("BATTERY_CAPACITY")));
                String os = (String) parameters.get("OS");
                int memoryRom = (Integer.parseInt((String)parameters.get("MEMORY_ROM")));
                int systemMemory = (Integer.parseInt((String)parameters.get("SYSTEM_MEMORY")));
                double cpu = (Double.parseDouble((String)parameters.get("CPU")));
                int displayInchs = (Integer.parseInt((String)parameters.get("DISPLAY_INCHS")));
                appliance = new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
                break;
            }
            case "Refrigerator": {
                int powerConsumption = (Integer.parseInt((String)parameters.get("POWER_CONSUMPTION")));
                int weight = (Integer.parseInt((String)parameters.get("WEIGHT")));
                int freezerCapacity = (Integer.parseInt((String)parameters.get("FREEZER_CAPACITY")));
                double overallCapacity = (Double.parseDouble((String)parameters.get("OVERALL_CAPACITY")));
                int height = (Integer.parseInt((String)parameters.get("HEIGHT")));
                int width = (Integer.parseInt((String)parameters.get("WIDTH")));
                appliance = new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
                break;
            }
            case "VacuumCleaner": {
                int powerConsumption = (Integer.parseInt((String)parameters.get("POWER_CONSUMPTION")));
                char filterType = ((String) parameters.get("FILTER_TYPE")).charAt(0);
                String bagType = (String) parameters.get("BAG_TYPE");
                String wandType = (String) parameters.get("WAND_TYPE");
                int motorSpeedRegulation = (Integer.parseInt((String)parameters.get("MOTOR_SPEED_REGULATION")));
                int cleaningWidth = (Integer.parseInt((String)parameters.get("CLEANING_WIDTH")));
                appliance = new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
                break;
            }
            case "TabletPC": {
                int batteryCapacity = (Integer.parseInt((String)parameters.get("BATTERY_CAPACITY")));
                int displayInches = (Integer.parseInt((String) parameters.get("DISPLAY_INCHES")));
                int memoryRom = (Integer.parseInt((String) parameters.get("MEMORY_ROM")));
                int flashMemoryCapacity = (Integer.parseInt((String) parameters.get("FLASH_MEMORY_CAPACITY")));
                String color = (String) parameters.get("COLOR");
                appliance = new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
                break;
            }
            case "Speakers": {
                int powerConsumption = (Integer.parseInt((String) parameters.get("POWER_CONSUMPTION")));
                int numberOfSpeakers = (Integer.parseInt((String) parameters.get("NUMBER_OF_SPEAKERS")));
                String frequencyRange = (String) parameters.get("FREQUENCY_RANGE");
                int cordLength = (Integer.parseInt((String) parameters.get("CORD_LENGTH")));
                appliance = new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
                break;
            }
        }
        return appliance;
    }

}
