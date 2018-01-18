/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Weapon
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 武器
 * 
 * @author 015336
 */
public class Weapon extends Equipment
{
	public Weapon()
	{
		// 指定配件位置:武器
		this.setPart(EquipmentEnum.Weapon);
	}

	public Weapon(String name, int upgrade, int durability)
	{
		this.setName(name);
		this.setUpgrade(upgrade);
		this.setDurability(durability);
		// 指定配件位置:武器
		this.setPart(EquipmentEnum.Weapon);
	}
}
