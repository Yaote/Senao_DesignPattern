/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Helmet
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 頭盔
 * 
 * @author 015336
 */
public class Helmet extends Equipment
{

	public Helmet()
	{
		this.setPart(EquipmentEnum.Helmet);
	}

	public Helmet(String name, int upgrade, int durability)
	{
		this.setName(name);
		this.setUpgrade(upgrade);
		this.setDurability(durability);
		// 指定配件位置:頭盔
		this.setPart(EquipmentEnum.Helmet);
	}

}
