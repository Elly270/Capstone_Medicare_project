package com.agi.shopforhome.service;

import java.util.List;

import com.agi.shopforhome.dto.AdminDTO;
import com.agi.shopforhome.entity.Admin;

/**
  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Admin service interface
 *
 */
public interface IAdminService {
	
	public String addAdmin(AdminDTO adminDto);
	
	public List<Admin> getAllAdmin();

}
