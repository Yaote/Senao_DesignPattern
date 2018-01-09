/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.AbstractClockSubject
   Module Description   :

   Date Created      : 2018年1月9日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

import java.util.HashMap;

/**
 * 時間主題Service
 * 
 * @author 015336
 */
public class ClockSubjectService
{

	/**
	 * 時鐘訂閱者清單
	 */
	private HashMap<String, HashMap<String, ClockObserver>> subscriberList = new HashMap<String, HashMap<String, ClockObserver>>();
	/**
	 * 訂閱的組題
	 */
	private HashMap<String, ClockObserver> subscribedSubjectMap = new HashMap<String, ClockObserver>();

	/**
	 * 訂閱主題
	 * 
	 * @param subject 訂閱的主題
	 * @param clockObserver
	 */
	public void attach(String subscriber, String subject, ClockObserver clockObserver)
	{
		//// 檢查是否存在於訂閱者清單
		if (subscriberList.containsKey(subscriber))
		{
			HashMap<String, ClockObserver> subscribedSubject = subscriberList.get(subscriber);
			//// 增加訂閱的主題
			subscribedSubject.put(subject, clockObserver);
			this.subscriberList.put(subscriber, subscribedSubject);
		} else
		{
			HashMap<String, ClockObserver> subscribedSubject = new HashMap<String, ClockObserver>();
			//// 增加訂閱的主題
			subscribedSubject.put(subject, clockObserver);
			this.subscriberList.put(subscriber, subscribedSubject);
		}
	}

	/**
	 * 取消訂閱
	 * 
	 * @param subject 訂閱的主題
	 * @param clockObserver
	 */
	public void detach(String subscriber, String subject, ClockObserver clockObserver)
	{
		//// 檢查是否存在於訂閱者清單
		if (subscriberList.containsKey(subscriber))
		{
			HashMap<String, ClockObserver> subscribedSubject = subscriberList.get(subscriber);
			//// 移除訂閱的主題
			subscribedSubject.remove(subject);
			this.subscriberList.put(subscriber, subscribedSubject);
		}
	}

	/**
	 * 發布更新
	 * 
	 * @param subject 主題
	 * @param hours 小時
	 * @param minutes 分鐘
	 * @param seconds 秒
	 */
	public void publish(String subject, int hours, int minutes, int seconds)
	{
		for (String subscriber : subscriberList.keySet())
		{
			HashMap<String, ClockObserver> subscribedSubject = subscriberList.get(subscriber);
			if (subscribedSubject.containsKey("update"))
			{
				subscribedSubject.get(subject).update(hours, minutes, seconds);
			}
		}
	}
}
