package by.tc.task01.parser;

import by.tc.task01.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ApplianceParser {
    public Criteria criteriaParser(String line) {

        String [] lines = line.split(" : ");
        Criteria criteria = new Criteria(lines[0]);
        Map<String, Object> parameters = new HashMap<>();

        for(String str : lines[1].split(", " )){
            String [] criteriars = str.split("=");
            parameters.put(criteriars[0], criteriars[1]);
        }
        criteria.setCriteria(parameters);
        return criteria;
    }

    public List<Appliance> parser(List<Criteria> criterias) {
        List<Appliance> list = new ArrayList<>();
        Validator validator = new Validator();
        ApplianceBuilder build = new ApplianceBuilder();

        for(Criteria criteria : criterias){
            switch (criteria.getApplianceType())
            {
                case "Oven":
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
                    break;
                case "Laptop" :
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
                    break;
                case "Refrigerator":
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
                case "VacuumCleaner":
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
                case "TabletPC":
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
                case "Speakers":
                    if(validator.isValidOven(criteria)){
                        list.add(build.build(criteria));
                    }
            }
        }
        return list;
    }
}
