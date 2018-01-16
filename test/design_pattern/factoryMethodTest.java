/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.factoryMethodTest
   Module Description   :

   Date Created      : 2018年1月17日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package design_pattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import factoryMethod.BankEnum;
import factoryMethod.factory.BankFactory;
import factoryMethod.service.BankService;

/**
 * @author 015336
 */
public class factoryMethodTest
{
	private Logger logger = LogManager.getLogger(factoryMethodTest.class);

	@Test
	public void Main()
	{
		BankFactory bankFactory = new BankFactory();
		List<BankService> bankServiceLists = new ArrayList<BankService>();
		bankServiceLists.add(bankFactory.getBankService(BankEnum.NCCC));
		bankServiceLists.add(bankFactory.getBankService(BankEnum.CTBC));
		bankServiceLists.add(bankFactory.getBankService(BankEnum.CATHY));
		bankServiceLists.add(bankFactory.getBankService(BankEnum.TSPG));
		String creditCardNo = "3560580700002402";
		for (BankService bankService : bankServiceLists)
		{
			logger.info(bankService.authorize(creditCardNo));
		}

	}
}
