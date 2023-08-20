package com.agi.shopforhome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: User DTO
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private long id;
	private String name;
	private String email;
	private String password;
	private long phone;
	

}
