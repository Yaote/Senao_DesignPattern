/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.service.CosplayShopServiceImpl
   Module Description   :

   Date Created      : 2018年1月19日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.service;

import java.util.ArrayList;
import java.util.List;

import abstractFactory.factory.CostumeFactory;
import abstractFactory.model.Equipment;

/**
 * @author 015336
 */
public class CosplayShopServiceImpl implements CosplayShopService
{

	/**
	 * 訂製套裝
	 * 
	 * @param subject 主題
	 * @return 套裝工廠
	 */
	@Override
	public CostumeFactory getFactory(String subject)
	{
		CostumeFactory costumeFactory = null;
		try
		{
			costumeFactory = (CostumeFactory) Class.forName(subject).newInstance();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return costumeFactory;
	}

	/**
	 * 生產
	 * 
	 * @return 裝備清單
	 */
	@Override
	public List<Equipment> orderCustume(CostumeFactory costumeFactory)
	{
		List<Equipment> equipments = new ArrayList<Equipment>();
		if (costumeFactory != null)
		{
			equipments.add(costumeFactory.createArmor());
			equipments.add(costumeFactory.createBoots());
			equipments.add(costumeFactory.createHelmet());
			equipments.add(costumeFactory.createShield());
			equipments.add(costumeFactory.createWeapon());
		}
		return equipments;
	}

}
