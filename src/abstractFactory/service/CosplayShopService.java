/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.service.CosplayShopService
   Module Description   :

   Date Created      : 2018年1月19日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.service;

import java.util.List;

import abstractFactory.factory.CostumeFactory;
import abstractFactory.model.Equipment;

/**
 * @author 015336
 */
public interface CosplayShopService
{
	/**
	 * 取得生產工廠
	 * 
	 * @param subject 主題
	 * @return 套裝工廠
	 */
	public CostumeFactory getFactory(String subject);

	/**
	 * 訂製套裝
	 * 
	 * @return 裝備清單
	 */
	public List<Equipment> orderCustume(CostumeFactory costumeFactory);
}
