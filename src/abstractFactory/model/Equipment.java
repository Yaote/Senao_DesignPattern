/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : abstractFactory.model.Equipment
   Module Description   :

   Date Created      : 2018年1月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package abstractFactory.model;

import abstractFactory.EquipmentEnum;

/**
 * 裝備
 * 
 * @author 015336
 */
public class Equipment
{
	// 裝備名稱
	private String name;

	// 裝備部位
	private EquipmentEnum part;

	// 提升屬性
	private int upgrade = 0;

	// 是否裝備
	private boolean isEquipped = false;

	// 耐久度
	private int durability = 10;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the part
	 */
	public EquipmentEnum getPart()
	{
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(EquipmentEnum part)
	{
		this.part = part;
	}

	/**
	 * @return the upgrade
	 */
	public int getUpgrade()
	{
		return upgrade;
	}

	/**
	 * @param upgrade the upgrade to set
	 */
	public void setUpgrade(int upgrade)
	{
		this.upgrade = upgrade;
	}

	/**
	 * @return the isEquipped
	 */
	public boolean isEquipped()
	{
		return isEquipped;
	}

	/**
	 * @param isEquipped the isEquipped to set
	 */
	public void setEquipped(boolean isEquipped)
	{
		this.isEquipped = isEquipped;
	}

	/**
	 * @return the durability
	 */
	public int getDurability()
	{
		return durability;
	}

	/**
	 * @param durability the durability to set
	 */
	public void setDurability(int durability)
	{
		this.durability = durability;
	}

	public void wear()
	{
		this.setEquipped(true);
	}

	public void remove()
	{
		this.setEquipped(false);
	}

	@Override
	public String toString()
	{
		return "Equipment [name=" + name + ", part=" + part + ", upgrade=" + upgrade + ", isEquipped=" + isEquipped
				+ ", durability=" + durability + "]";
	}

}
