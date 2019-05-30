package com.liuli.day21collapsehierarchy.problem;

import lombok.Data;

import java.util.List;

@Data
public class Website {

	private String title;

	private String description;

	private List<Object> pages;
}