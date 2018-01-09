/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.Clock
   Module Description   :

   Date Created      : 2018¦~1¤ë9¤é
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 015336
 */
public class Clock
{

	public void onTick(ClockSubjectService subjectService)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		subjectService.publish("update", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
				calendar.get(Calendar.SECOND));
	}
}
