��webapps��ͷ��Ӧ�ü���META-INF\context.xml�ļ�ʱ��
�Ḵ��һ��conf\Catalina\localhost���¸��Ƶ��ļ�����Ӧ�������ļ�����һ����
���ǵ��޸�META-INF\context.xml�ļ�������ʱ��conf\Catalina\localhost�е��ļ�����û�и��£�
��������Tomcatʱ��ʹ�õ���conf\Catalina\localhost�е��ļ���������META-INF\context.xml�ļ���

��webapps\test\META-INF\context.xml

<Context antiResourceLocking="false" privileged="true">
	<Parameter name="myname" value="myvalue1" override="true" description="mydescription" />
	<Parameter name="myname" value="myvalue2" override="false" description="mydescription" />
</Context>

�õ�:
conf\Catalina\localhost\test.xml

<Context antiResourceLocking="false" privileged="true">
	<Parameter name="myname" value="myvalue1" override="true" description="mydescription" />
	<Parameter name="myname" value="myvalue2" override="false" description="mydescription" />
</Context>

Ҳ����˵conf\Catalina\localhost\test.xml���Զ����ɵģ�
�����޸��κ�һ���������Զ����¶Է���
�������ʹ��conf\Catalina\localhost\test.xml�ķ�ʽ��
��Ϊtest\META-INF\context.xmlһ��ֻ����jar�ļ��У�����������һ�������Ͳ��������޸���






org.apache.catalina.connector.Responseʵ����javax.servlet.http.HttpServletResponse��
����setBufferSize������getBufferSize()�õ���ֵ���Բ�һ����
����response.setBufferSize(100)��response.getBufferSize()ȴ����8192��
������ΪResponse�ڲ���OutputBufferĬ����8192���������ñ�8192С����ôʵ���ϻ���Ե��ġ�

