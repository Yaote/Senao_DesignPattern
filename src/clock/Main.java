/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.Main
   Module Description   :

   Date Created      : 2018¦~1¤ë9¤é
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

/**
 * @author 015336
 */
public class Main
{
	public static void main(String[] args)
	{
		ClockSubjectService subject = new ClockSubjectService();
		ClockObserver digitalClock = new DigitalClock();
		subject.attach("java", "update", digitalClock);
		Clock clock = new Clock();
		clock.onTick(subject);
	}
}
