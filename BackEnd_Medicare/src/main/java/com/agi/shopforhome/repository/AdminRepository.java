package com.agi.shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agi.shopforhome.entity.Admin;

/**
 * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Wishlist Repository
 *
 */

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
