package com.agi.shopforhome.service;

import java.util.List;

import com.agi.shopforhome.entity.Cart;

/**
 *  * @author Elly Mugisha
 * Modified Date: 19/08/2023
 * Description: Cart service interface
 *
 */

public interface IcartService {
	public Cart addToCart(Cart cart);
	
	public List<Cart> getAllByUserCart(long id);
	
	public void deleteCart(long id);
	
	public void updateCart(Cart cart,long cid);

}
