package com.agi.shopforhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agi.shopforhome.entity.Products;

/**
  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Product Repository
 *
 */

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
