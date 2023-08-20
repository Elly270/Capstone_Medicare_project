package com.agi.shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agi.shopforhome.entity.Wishlist;
/**
  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: User Repository
 *
 */

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
