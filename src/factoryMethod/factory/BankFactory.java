/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : factoryMethod.factory.BankFactory
   Module Description   :

   Date Created      : 2018年1月16日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package factoryMethod.factory;

import java.util.HashMap;
import java.util.Map;

import factoryMethod.BankEnum;
import factoryMethod.service.BankService;
import factoryMethod.service.impl.CATHYBankService;
import factoryMethod.service.impl.CTBCBankService;
import factoryMethod.service.impl.NCCCBankService;
import factoryMethod.service.impl.TSPGBankService;

/**
 * @author 015336
 */
public class BankFactory
{
	// BankService列表
	private Map<BankEnum, BankService> bankServiceMap;

	public BankFactory()
	{
		this.init();
	}

	public void init()
	{
		this.bankServiceMap = new HashMap<BankEnum, BankService>();
		this.bankServiceMap.put(BankEnum.NCCC, new NCCCBankService());
		this.bankServiceMap.put(BankEnum.CTBC, new CTBCBankService());
		this.bankServiceMap.put(BankEnum.CATHY, new CATHYBankService());
		this.bankServiceMap.put(BankEnum.TSPG, new TSPGBankService());
	}

	/**
	 * 取得對應的BankService
	 * 
	 * @param bankEnum
	 * @return BankService
	 */

	public BankService getBankService(BankEnum bankEnum)
	{
		BankService bankService = null;
		if (bankServiceMap == null)
		{
			this.init();
		}
		if (bankServiceMap.containsKey(bankEnum))
		{
			bankService = bankServiceMap.get(bankEnum);
		}
		return bankService;
	}
}
