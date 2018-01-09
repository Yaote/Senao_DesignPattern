/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.ClockObserver
   Module Description   :

   Date Created      : 2018�~1��9��
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

/**
 * @author 015336
 */
public interface ClockObserver
{
	public void update(int hours, int minutes, int seconds);
}
