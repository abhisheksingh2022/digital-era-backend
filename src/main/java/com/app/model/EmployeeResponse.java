package com.app.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeResponse extends PageResponse {
	@ApiModelProperty(required = true, value = "")
	private List<Employee> items;

	public List<Employee> getItems() {
		return items;
	}

	public void setItems(List<Employee> items) {
		this.items = items;
	}
}
