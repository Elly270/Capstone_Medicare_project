package com.agi.shopforhome.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Admin DTO
 *
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {
	private long id;
	private String email;
	private String password;

}
