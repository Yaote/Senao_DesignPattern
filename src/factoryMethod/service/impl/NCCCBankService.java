/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : factoryMethod.service.NCCCBankService
   Module Description   :

   Date Created      : 2018年1月17日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package factoryMethod.service.impl;

import factoryMethod.service.BankService;

/**
 * @author 015336
 */
public class NCCCBankService implements BankService
{

	@Override
	public String authorize(String creditCardNo)
	{
		switch (creditCardNo)
		{
		case "5430450100001219":
			return "卡號經本行(NCCC)驗證通過,卡號:" + creditCardNo;
		default:
			return "此卡號並非本行(NCCC)卡號,卡號:" + creditCardNo;
		}
	}

}
