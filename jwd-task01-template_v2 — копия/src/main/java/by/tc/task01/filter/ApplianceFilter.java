package by.tc.task01.filter;

import by.tc.task01.entity.criteria.Criteria;
import java.util.ArrayList;
import java.util.List;

public class ApplianceFilter {

        public List<String> filter(List<String> lines, Criteria criteria) {

            List<String> list = new ArrayList<>();
            String name = criteria.getApplianceType();

            for (String line : lines) {
                if (line.split(" : ")[0].equals(name)) {
                    list.add(line);
                }
            }
            return list;
        }

}
