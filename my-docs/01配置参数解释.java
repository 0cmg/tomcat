1. org.apache.catalina.connector.Connector.parseBodyMethods

���ŷָ���http���󷽷�������POST�������Ǵ�д��
�˲�����ʾ:��������ʲô����http���󷽷������ܽ��������壬
Ĭ��ֻ��POST�����ܽ��������塣
����org.apache.catalina.connector.Request.parseParameters()��������У�
�������������Request.getParameterʱ�ᴥ��

���ǲ��ܰ���TRACE���������:
throw new IllegalArgumentException(sm.getString("coyoteConnector.parseBodyMethodNoTrace"));
java.lang.IllegalArgumentException: TRACE method MUST NOT include an entity (see RFC 2616 Section 9.6),
������IntrospectionUtils.setProperty(Object, String, String, boolean) line: 390	
��������ͬ������if (log.isDebugEnabled())����ܿ��õ�


2. useBodyEncodingForURI��URIEncoding����
���useBodyEncodingForURI��Ϊtrue����ôURIEncoding������������ʲô���ǲ��������õ�
���useBodyEncodingForURI��Ϊtrue����:
1) ������û��Content-Typeͷ��ȡ�������charset��
2) �����û��Ƿ���ù�request.setCharacterEncoding(...);
���1��2���������ôȡ2�ģ�����1��2��ȡ���ַ�����ʱ��������ָ���ģ�
������ISO-8859-1

���useBodyEncodingForURI��Ϊfalse������URIEncoding����������uri��

