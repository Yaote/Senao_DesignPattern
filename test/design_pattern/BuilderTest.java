/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.BuilderTest
   Module Description   :

   Date Created      : 2018年1月16日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package design_pattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import builder.model.Computer;
import builder.model.ComputerEnum;
import builder.service.ComputerBuilderService;

/**
 * @author 015336
 */
public class BuilderTest
{
	private Logger logger = LogManager.getLogger(BuilderTest.class);

	@Test
	public void 正常執行()
	{
		try
		{
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });
			ComputerBuilderService computerBuilderService = (ComputerBuilderService) ctx.getBean("computerBuilderService");
			List<Computer> computerLists = new ArrayList<Computer>();

			// 組裝桌機
			Computer desktop = computerBuilderService.buildComputer(ComputerEnum.DESKTOP);
			desktop.addPart("cpu", "Intel i5-7500(3.80 GHz)");
			desktop.addPart("ram", "8G DDR4 2400MHz");
			desktop.addPart("hdd", "1TB");
			desktop.addPart("vga", "IntelR HD Graphics P530");
			desktop.addPart("mainBoard", "HP 400G4");
			computerLists.add(desktop);

			// 組裝筆電
			Computer laptop = computerBuilderService.buildComputer(ComputerEnum.LAPTOP);
			laptop.addPart("cpu", "七代i5-7200U處理器(2.5GHz/3.1GHz)");
			laptop.addPart("ram", "DDR4 4G記憶體2133HZ");
			laptop.addPart("hdd", "1TB大硬碟+128G SSD");
			laptop.addPart("vga", "NV 940MX 2G DDR5輕電競獨顯");
			laptop.addPart("mainBoard", "K50-30-56VV");
			computerLists.add(laptop);

			for (Computer computer : computerLists)
			{
				logger.info(computer.show());
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
