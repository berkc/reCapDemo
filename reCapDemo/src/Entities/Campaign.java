package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	
	public Campaign(int id, String campaignName) {
		super();
		this.id = id;
		this.campaignName = campaignName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
}
