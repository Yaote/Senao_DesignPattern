/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.factory.CostumeFactory
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.factory;

import abstractFactory.model.Armor;
import abstractFactory.model.Boots;
import abstractFactory.model.Helmet;
import abstractFactory.model.Shield;
import abstractFactory.model.Weapon;

/**
 * 套裝工廠
 * 
 * @author 015336
 */
public abstract class CostumeFactory
{

	// 生產頭盔
	public abstract Helmet createHelmet();

	// 生產盾牌
	public abstract Shield createShield();

	// 生產武器
	public abstract Weapon createWeapon();

	// 生產盔甲
	public abstract Armor createArmor();

	// 生產鞋子
	public abstract Boots createBoots();

}
