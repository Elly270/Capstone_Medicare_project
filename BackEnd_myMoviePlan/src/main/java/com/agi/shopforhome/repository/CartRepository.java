package com.agi.shopforhome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agi.shopforhome.entity.Cart;

/**
  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Cart Repository
 *
 */

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
	List<Cart> findAllByUserId(Long id);
}