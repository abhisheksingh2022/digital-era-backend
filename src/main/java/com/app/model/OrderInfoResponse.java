package com.app.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderInfoResponse extends PageResponse {
	@ApiModelProperty(required = true, value = "")
	private List<OrderInfo> items;

	public List<OrderInfo> getItems() {
		return items;
	}

	public void setItems(List<OrderInfo> items) {
		this.items = items;
	}
}
