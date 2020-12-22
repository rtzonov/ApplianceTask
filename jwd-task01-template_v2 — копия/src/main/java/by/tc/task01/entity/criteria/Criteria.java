package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	public Criteria(String applianceType){
		this.applianceType = applianceType;
	}

	private String applianceType;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}

	public Map<String, Object> getCriteria(){ return criteria; }
	public String getApplianceType() {
		return applianceType;
	}
	public void setApplianceType(String applianceType) { this.applianceType = applianceType; }



	// you may add your own code here

}
