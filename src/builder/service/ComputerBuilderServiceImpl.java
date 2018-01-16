/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : builder.service.ComputerBuilderServiceImpl
   Module Description   :

   Date Created      : 2018�~1��16��
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package builder.service;

import builder.model.Computer;
import builder.model.ComputerEnum;
import builder.model.Desktop;
import builder.model.Laptop;

/**
 * @author 015336
 */
public class ComputerBuilderServiceImpl implements ComputerBuilderService
{
	protected Computer computer;

	@Override
	public Computer buildComputer(String type) throws Exception
	{
		if (type.equals(ComputerEnum.LAPTOP))
		{
			this.computer = new Laptop();
		} else if (type.equals(ComputerEnum.DESKTOP))
		{
			this.computer = new Desktop();
		} else
		{
			throw new Exception("目前無法組裝此種類型電腦！");
		}
		return this.computer;
	}

}
