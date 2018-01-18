/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.factory.PokemonCostumeFactory
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.factory;

import java.util.Random;

import abstractFactory.model.Armor;
import abstractFactory.model.Boots;
import abstractFactory.model.Helmet;
import abstractFactory.model.Shield;
import abstractFactory.model.Weapon;

/**
 * 寶可夢套裝工廠
 * 
 * @author 015336
 */
public class PokemonCostumeFactory extends CostumeFactory
{
	private static final String[] adjectiveArray = new String[] { "堅固的", "破損的", "平凡的", "強壯的", "敏捷的", "可愛的" };

	/**
	 * 生產頭盔
	 */
	@Override
	public Helmet createHelmet()
	{
		Random ran = new Random();
		int random = ran.nextInt(adjectiveArray.length);
		// 隨機產生數值
		int upgrade = ran.nextInt(10);
		int durability = ran.nextInt(10);
		// 隨機抽取形容詞
		String name = adjectiveArray[random].toString() + "頭盔";
		return new Helmet(name, upgrade, durability);
	}

	/**
	 * 生產盾牌
	 */
	@Override
	public Shield createShield()
	{
		Random ran = new Random();
		int random = ran.nextInt(adjectiveArray.length);
		// 隨機產生數值
		int upgrade = ran.nextInt(10);
		int durability = ran.nextInt(10);
		// 隨機抽取形容詞
		String name = adjectiveArray[random].toString() + "盾牌";
		return new Shield(name, upgrade, durability);
	}

	/**
	 * 生產武器
	 */
	@Override
	public Weapon createWeapon()
	{
		Random ran = new Random();
		int random = ran.nextInt(adjectiveArray.length);
		// 隨機產生數值
		int upgrade = ran.nextInt(18);
		int durability = ran.nextInt(8);
		// 隨機抽取形容詞
		String name = adjectiveArray[random].toString() + "武器";
		return new Weapon(name, upgrade, durability);
	}

	/**
	 * 生產盔甲
	 */
	@Override
	public Armor createArmor()
	{
		Random ran = new Random();
		int random = ran.nextInt(adjectiveArray.length);
		// 隨機產生數值
		int upgrade = ran.nextInt(16);
		int durability = ran.nextInt(12);
		// 隨機抽取形容詞
		String name = adjectiveArray[random].toString() + "盔甲";
		return new Armor(name, upgrade, durability);
	}

	/**
	 * 生產鞋子
	 */
	@Override
	public Boots createBoots()
	{
		Random ran = new Random();
		int random = ran.nextInt(adjectiveArray.length);
		// 隨機產生數值
		int upgrade = ran.nextInt(8);
		int durability = ran.nextInt(15);
		// 隨機抽取形容詞
		String name = adjectiveArray[random].toString() + "鞋子";
		return new Boots(name, upgrade, durability);
	}

}
