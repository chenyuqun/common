package com.zizaike.core.framework.event;



/**
 * 
 * ClassName: Event <br/>  
 * Function: <p>通用事件模型。</p>
 * <p>
 * 此处对事件的抽象为事件以3个维度进行描述。<br>
 * 事件类型 <br>
 * 发生时间 <br>
 * 事件源。 <br>
 * </p>. <br/>  
 * date: 2016年4月5日 上午11:41:39 <br/>  
 *  
 * @author snow.zhang  
 * @version @param <S>  
 * @since JDK 1.7
 */
public interface Event<S> extends java.io.Serializable {

	/****
	 * get事件类型。
	 */
	public String getType();
	
	/****
	 * get发生时间
	 */
	public long getOccuredTime();

	/****
	 * get事件源
	 */
	public S getSource();
	

}
