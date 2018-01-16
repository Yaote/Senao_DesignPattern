/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : factoryMethod.service.TSPGBankService
   Module Description   :

   Date Created      : 2018年1月17日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package factoryMethod.service.impl;

import factoryMethod.service.BankService;

/**
 * @author 015336
 */
public class TSPGBankService implements BankService
{

	@Override
	public String authorize(String creditCardNo)
	{
		switch (creditCardNo)
		{
		case "3560580700002402":
		case "4050598300755208":
		case "5406411300011606":
			return "卡號經本行(TSPG)驗證通過,卡號:" + creditCardNo;
		default:
			return "此卡號並非本行(TSPG)卡號,卡號:" + creditCardNo;
		}
	}

}
