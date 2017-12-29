package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {
	
	/**
	 * 需求：根据商品id查询商品信息
	 * @param itemId
	 * @return
	 * @throws Exception
	 */
	public TbItem findItemById(Long itemId)throws Exception;

}
