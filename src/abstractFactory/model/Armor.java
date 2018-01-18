/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Armor
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 鎧甲
 * 
 * @author 015336
 */
public class Armor extends Equipment
{
	public Armor()
	{
		// 指定配件位置:鎧甲
		this.setPart(EquipmentEnum.Armor);
	}

	public Armor(String name, int upgrade, int durability)
	{
		this.setName(name);
		this.setUpgrade(upgrade);
		this.setDurability(durability);
		// 指定配件位置:鎧甲
		this.setPart(EquipmentEnum.Armor);
	}

}
