package com.app.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderDetailResponse extends PageResponse {
	@ApiModelProperty(required = true, value = "")
	// private List<OrderExtended> items;
	private List<OrderDetail> items;

	public List<OrderDetail> getItems() {
		return items;
	}

	public void setItems(List<OrderDetail> items) {
		this.items = items;
	}
}
