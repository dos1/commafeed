package com.commafeed.frontend.rest.model;

import java.util.List;

import com.google.common.collect.Lists;

public class Entries {
	private String name;
	private List<Entry> entries = Lists.newArrayList();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

}
