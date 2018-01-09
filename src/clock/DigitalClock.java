/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.DigitalClock
   Module Description   :

   Date Created      : 2018¦~1¤ë9¤é
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

/**
 * @author 015336
 */
public class DigitalClock implements ClockObserver
{
	@Override
	public void update(int hours, int minutes, int seconds)
	{
		System.out.println(
				String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
	}
}
