package com.foximy.weixin4j.example.server.handler;

import com.foxinmy.weixin4j.exception.WeixinException;
import com.foxinmy.weixin4j.handler.MessageHandlerAdapter;
import com.foxinmy.weixin4j.message.TextMessage;
import com.foxinmy.weixin4j.request.WeixinRequest;
import com.foxinmy.weixin4j.response.TextResponse;
import com.foxinmy.weixin4j.response.WeixinResponse;

/**
 * 文本消息处理
 * 
 * @className TextMessageHandler
 * @author jy
 * @date 2015年11月18日
 * @since JDK 1.7
 * @see
 */
public class TextMessageHandler extends MessageHandlerAdapter<TextMessage> {

	@Override
	public WeixinResponse doHandle0(WeixinRequest request, TextMessage message)
			throws WeixinException {
		return new TextResponse("收到了文本消息");
	}
}