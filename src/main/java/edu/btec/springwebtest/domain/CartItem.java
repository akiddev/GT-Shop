package edu.btec.springwebtest.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem implements Serializable{
	private int productId;
	private String name;
	private int quantity;
	private double unitPrice;
}
