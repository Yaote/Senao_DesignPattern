/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : factoryMethod.service.CATHYBankService
   Module Description   :

   Date Created      : 2018年1月17日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package factoryMethod.service.impl;

import factoryMethod.service.BankService;

/**
 * @author 015336
 */
public class CATHYBankService implements BankService
{

	@Override
	public String authorize(String creditCardNo)
	{
		switch (creditCardNo)
		{
		case "4283682007174555":
		case "4023103400034671":
			return "卡號經本行(CATHY)驗證通過,卡號:" + creditCardNo;
		default:
			return "此卡號並非本行(CATHY)卡號,卡號:" + creditCardNo;
		}
	}

}
