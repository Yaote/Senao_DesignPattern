/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : factoryMethod.service.CTBCBankService
   Module Description   :

   Date Created      : 2018年1月17日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package factoryMethod.service.impl;

import factoryMethod.service.BankService;

/**
 * @author 015336
 */
public class CTBCBankService implements BankService
{

	@Override
	public String authorize(String creditCardNo)
	{
		switch (creditCardNo)
		{
		case "3560511234561234":
			return "卡號經本行(CTBC)驗證通過,卡號:" + creditCardNo;
		default:
			return "此卡號並非本行(CTBC)卡號,卡號:" + creditCardNo;
		}
	}

}
