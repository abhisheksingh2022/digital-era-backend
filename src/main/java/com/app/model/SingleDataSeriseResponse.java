//This is a common http response model for providing data series

package com.app.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SingleDataSeriseResponse extends OperationResponse {
	private List<SingleSerise> items;

	public List<SingleSerise> getItems() {
		return items;
	}

	public void setItems(List<SingleSerise> items) {
		this.items = items;
	}
}
