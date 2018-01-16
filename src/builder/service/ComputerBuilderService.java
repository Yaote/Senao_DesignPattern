/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : builder.service.ComputerBuilderService
   Module Description   :

   Date Created      : 2018�~1��16��
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package builder.service;

import builder.model.Computer;

/**
 * @author 015336
 */
public interface ComputerBuilderService
{
	public Computer buildComputer(String type) throws Exception;

}
