package by.tc.task01.dao.impl;

import by.tc.task01.builder.ApplianceBuilder;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.filter.ApplianceFilter;
import by.tc.task01.parser.ApplianceParser;
import by.tc.task01.reader.ApplianceReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
	@Override

	public List<Appliance> find(Criteria criteria) {

		ApplianceReader applianceReader = new ApplianceReader();
		ApplianceParser applianceParser = new ApplianceParser();
		ApplianceFilter applianceFilter = new ApplianceFilter();

		List<String> applianceParams = applianceReader.reader();
		List<String> filtredAppliances = applianceFilter.filter(applianceParams, criteria);
		List<Criteria> criterias = new ArrayList<>();

		for(String line : filtredAppliances) {
		 criterias.add(applianceParser.criteriaParser(line));
		}
		List<Appliance> appliances = applianceParser.parser(criterias);

		return appliances;
	}

/*	public static void main(String[] args) {
		Criteria criteria = new Criteria(Oven.class.getSimpleName()) ;
		ApplianceDAOImpl a = new ApplianceDAOImpl();
		System.out.println(a.find(criteria));
	}*/
}

