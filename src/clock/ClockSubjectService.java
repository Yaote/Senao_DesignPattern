/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : design_pattern.AbstractClockSubject
   Module Description   :

   Date Created      : 2018�~1��9��
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package clock;

import java.util.HashMap;

/**
 * �ɶ��D�DService
 * 
 * @author 015336
 */
public class ClockSubjectService
{

	/**
	 * �����q�\�̲M��
	 */
	private HashMap<String, HashMap<String, ClockObserver>> subscriberList = new HashMap<String, HashMap<String, ClockObserver>>();
	/**
	 * �q�\�����D
	 */
	private HashMap<String, ClockObserver> subscribedSubjectMap = new HashMap<String, ClockObserver>();

	/**
	 * �q�\�D�D
	 * 
	 * @param subject �q�\���D�D
	 * @param clockObserver
	 */
	public void attach(String subscriber, String subject, ClockObserver clockObserver)
	{
		//// �ˬd�O�_�s�b��q�\�̲M��
		if (subscriberList.containsKey(subscriber))
		{
			HashMap<String, ClockObserver> subscribedSubject = subscriberList.get(subscriber);
			//// �W�[�q�\���D�D
			subscribedSubject.put(subject, clockObserver);
			this.subscriberList.put(subscriber, subscribedSubject);
		} else
		{
			HashMap<String, ClockObserver> subscribedSubject = new HashMap<String, ClockObserver>();
			//// �W�[�q�\���D�D
			subscribedSubject.put(subject, clockObserver);
			this.subscriberList.put(subscriber, subscribedSubject);
		}
	}

	/**
	 * �����q�\
	 * 
	 * @param subject �q�\���D�D
	 * @param clockObserver
	 */
	public void detach(String subscriber, String subject, ClockObserver clockObserver)
	{
		//// �ˬd�O�_�s�b��q�\�̲M��
		if (subscriberList.containsKey(subscriber))
		{
			HashMap<String, ClockObserver> subscribedSubject = subscriberList.get(subscriber);
			//// �����q�\���D�D
			subscribedSubject.remove(subject);
			this.subscriberList.put(subscriber, subscribedSubject);
		}
	}

	/**
	 * �o����s
	 * 
	 * @param subject �D�D
	 * @param hours �p��
	 * @param minutes ����
	 * @param seconds ��
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
