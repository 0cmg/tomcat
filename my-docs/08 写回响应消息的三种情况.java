��һ��:
�ֶ�����response.getWriter().flush()��Response.flushBuffer()����
response.getWriter().write("aaa");
response.getWriter().flush();
��response.flushBuffer();

response.getWriter().flush()��response.flushBuffer()�Ĳ����
response.flushBuffer()���appCommitted��Ϊtrue,
�������������response.isCommitted()���᷵��true��

�ڶ���:
org.apache.catalina.connector.OutputBufferĬ����8k��
���д���ˣ����Զ�д����Ӧ��Ϣ��

������:
Ҳ���������������ִ����servlet��
���������response.finishResponse��
response.finishResponse����OutputBuffer.close��
OutputBuffer.close�ᴥ��һϵ�����飬���д����Ӧ��Ϣ��