/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Boots
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 鞋子
 * 
 * @author 015336
 */
public class Boots extends Equipment
{

	public Boots()
	{
		// 指定配件位置:鞋子
		this.setPart(EquipmentEnum.Boots);
	}

	public Boots(String name, int upgrade, int durability)
	{
		this.setName(name);
		this.setUpgrade(upgrade);
		this.setDurability(durability);
		// 指定配件位置:鞋子
		this.setPart(EquipmentEnum.Boots);
	}
}
