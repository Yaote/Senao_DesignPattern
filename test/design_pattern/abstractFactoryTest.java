/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.abstractFactoryTest
   Module Description   :

   Date Created      : 2018年1月19日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package design_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import abstractFactory.EquipmentEnum;
import abstractFactory.factory.CostumeFactory;
import abstractFactory.factory.PokemonCostumeFactory;
import abstractFactory.model.Equipment;
import abstractFactory.service.CosplayShopService;

/**
 * @author 015336
 */
public class abstractFactoryTest
{
	private Logger logger = LogManager.getLogger(abstractFactoryTest.class);

	@Test
	public void main()
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		CosplayShopService cosplayShopService = (CosplayShopService) ctx.getBean("cosplayShopService");
		// 指定要購買寶可夢套裝
		CostumeFactory pokemonFactory = cosplayShopService.getFactory(PokemonCostumeFactory.class.getName());
		List<Equipment> costumes = new ArrayList<Equipment>();
		// 產生10組套裝
		for (int i = 0; i < 10; i++)
		{
			costumes.addAll(cosplayShopService.orderCustume(pokemonFactory));
		}
		logger.info("產生的套裝清單：" + costumes.toString());
		Map<EquipmentEnum, Equipment> bestEquipment = new HashMap<EquipmentEnum, Equipment>();
		// 仔細挑選最佳的裝備
		for (Equipment equipment : costumes)
		{
			EquipmentEnum part = equipment.getPart();
			if (isSwitchEquipment(bestEquipment.get(part), equipment))
			{
				equipment.wear();
				bestEquipment.put(part, equipment);
			}
		}
		logger.info("挑選出最好的裝備：" + bestEquipment.toString());

	}

	/**
	 * 判斷是否要切換裝備
	 * 
	 * @param originalEquipment 目前裝備
	 * @param equipment 比對裝備
	 * @return 要切換則回傳true，否則回傳false
	 */
	private boolean isSwitchEquipment(Equipment originalEquipment, Equipment equipment)
	{
		// 若原本無裝備或數值較小則要切換裝備
		if (originalEquipment == null || originalEquipment.getUpgrade() < equipment.getUpgrade())
		{
			return true;
		}
		return false;
	}
}
