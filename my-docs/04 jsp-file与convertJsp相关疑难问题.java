conf/web.xml�ļ��ж�����һ����������jspҳ�����servlet
<servlet>
        <servlet-name>jsp</servlet-name>
        <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>
        <init-param>
            <param-name>fork</param-name>
            <param-value>false</param-value>
        </init-param>
        <init-param>
            <param-name>xpoweredBy</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>3</load-on-startup>
    </servlet>

�����web-info\web.xml�ж�����<jsp-file>���͵�servlet����������:
    <servlet>
      <servlet-name>form</servlet-name>
      <jsp-file>/form.jsp</jsp-file>
      <init-param>
          <param-name>jspFile</param-name>
          <param-value>haha.jsp</param-value>
      </init-param>
      <init-param>
          <param-name>myname</param-name>
          <param-value>myvalue</param-value>
      </init-param>
    </servlet>
ÿ��������servlet����װ��һ��org.apache.catalina.deploy.ServletDefʵ����
���ServletDefʵ����servletClass�ֶ���null����jspFile�ֶ���/form.jsp��
parameters��"jspFile=haha.jsp,myname=myvalue"��
�����е�org.apache.catalina.startup.ContextConfig.webConfig()->convertJsps()ʱ��
�������<jsp-file>���͵�servlet�������⴦��
��servletClass�ֶ���Ϊ"org.apache.jasper.servlet.JspServlet"��
������conf/web.xml�ļ����Ǹ�jsp������init-param�ŵ��������parameters�У�
ͬʱ�����parameters��put("jspFile", "/form.jsp");
֮ǰ���parameters�����Ҳ��"jspFile"������key��������������������key��ֵ��"haha.jsp"��
��ô���ᱻ"/form.jsp"�滻��
���put("jspFile", ...)��tomcat���õ���Ϊ�����ǧ��Ҫ��������Ϊ"jspFile"��<init-param>��

������ServletDefʵ����jspFile�ֶα���Ϊnull��
������org.apache.jasper.servlet.JspServlet��init�����п���ͨ��
config.getInitParameter("jspFile")���д����ԭʼ��jsp�ļ�ȡ������

