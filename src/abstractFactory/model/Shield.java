/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Shield
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 盾牌
 * 
 * @author 015336
 */
public class Shield extends Equipment
{
	public Shield()
	{
		// 指定配件位置:盾牌
		this.setPart(EquipmentEnum.Shield);
	}

	public Shield(String name, int upgrade, int durability)
	{
		this.setName(name);
		this.setUpgrade(upgrade);
		this.setDurability(durability);
		// 指定配件位置:盾牌
		this.setPart(EquipmentEnum.Shield);
	}

}
