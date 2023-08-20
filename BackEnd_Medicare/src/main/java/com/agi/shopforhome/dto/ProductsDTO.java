
package com.agi.shopforhome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Product DTO
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDTO {
	
	private long id;
	private String name;
	private double price;
	private String url;
	private String catagory;
	private int quantity;

}
