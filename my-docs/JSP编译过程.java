2010-1-26 23:41:51 org.apache.catalina.core.AprLifecycleListener init
��Ϣ: The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: D:\JavaSE\bin;.;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;F:\JavaCC\javacc-5.0\bin;D:\Python26\Lib\site-packages\django\bin;D:\Python26;D:\JavaSE\bin;D:\JavaFX\bin;D:\JavaFX\emulator\bin;E:\Play1.1;E:\Play;D:\oracle\ora90\bin;D:\Oracle11\zhh\product\11.1.0\db_1\bin;D:\Svn;D:\Program Files\MySQL\MySQL Server 5.1\bin;D:\oracle\ora90\Apache\Perl\5.00503\bin\mswin32-x86;C:\Program Files\Oracle\jre\1.1.8\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\Program Files\Common Files\Thunder Network\KanKan\Codecs;C:\Program Files\Microsoft SQL Server\80\Tools\BINN
2010-1-26 23:41:51 org.apache.coyote.http11.Http11Protocol init
��Ϣ: Initializing Coyote HTTP/1.1 on http-8080
2010-1-26 23:41:51 org.apache.catalina.startup.Catalina load
��Ϣ: Initialization processed in 523 ms
2010-1-26 23:41:52 org.apache.catalina.core.StandardService start
��Ϣ: Starting service Catalina
2010-1-26 23:41:52 org.apache.catalina.core.StandardEngine start
��Ϣ: Starting Servlet Engine: Apache Tomcat/@VERSION@
2010-1-26 23:41:52 org.apache.catalina.startup.HostConfig deployDirectory
��Ϣ: Deploying web application directory examples
2010-1-26 23:41:52 org.apache.catalina.startup.HostConfig deployDirectory
��Ϣ: Deploying web application directory ROOT
2010-1-26 23:41:52 org.apache.coyote.http11.Http11Protocol start
��Ϣ: Starting Coyote HTTP/1.1 on http-8080
2010-1-26 23:41:52 org.apache.jk.common.ChannelSocket init
��Ϣ: JK: ajp13 listening on /0.0.0.0:8009
2010-1-26 23:41:52 org.apache.jk.server.JkMain start
��Ϣ: Jk running ID=0 time=0/31  config=null
2010-1-26 23:41:52 org.apache.catalina.startup.Catalina start
��Ϣ: Server startup in 684 ms
org.apache.jasper.compiler.ParserController===>parseDirectives(1)
-----------------------------------------------------------
inFileName=/jspTest.jsp
java.lang.Error
	at my.Debug.e(Debug.java:250)
	at org.apache.jasper.compiler.ParserController.parseDirectives(ParserController.java:127)
	at org.apache.jasper.compiler.Compiler.generateJava(Compiler.java:165)
	at org.apache.jasper.compiler.Compiler.compile(Compiler.java:332)
	at org.apache.jasper.compiler.Compiler.compile(Compiler.java:312)
	at org.apache.jasper.compiler.Compiler.compile(Compiler.java:299)
	at org.apache.jasper.JspCompilationContext.compile(JspCompilationContext.java:589)
	at org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:317)
	at org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:313)
	at org.apache.jasper.servlet.JspServlet.service(JspServlet.java:260)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:717)
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:290)
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:206)
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:233)
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:191)
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:465)
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:127)
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:102)
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:109)
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:298)
	at org.apache.coyote.http11.Http11Processor.process(Http11Processor.java:852)
	at org.apache.coyote.http11.Http11Protocol$Http11ConnectionHandler.process(Http11Protocol.java:588)
	at org.apache.tomcat.util.net.JIoEndpoint$Worker.run(JIoEndpoint.java:489)
	at java.lang.Thread.run(Thread.java:619)
�˳�(������;)


ָ��(directive):
JSP��ʽ��ָ���� "<%@" ��ͷ
XML��ʽ��ָ���� "<jsp:directive." ��ͷ

ָ��������6��:
page
include
taglib
tag
attribute
variable

tag��attribute��variable������ָ��ֻ������tag�ļ���(��".tag"Ϊ��չ�����ļ�)
pageָ�������tag�ļ�

tag�ļ���ŵ�Ŀ¼������"/WEB-INF/tags"������Ŀ¼��

ע��:
����ָ�������tag�ļ���
<%@ page

����ָ��ֻ������tag�ļ���
<%@ tag
<%@ attribute
<%@ variable

����ֵ�����õ����Ż�˫����������

�������﷨Ҳ�ǿ��Ե�:
<%@ pageimport="java.io.*" %>
��"pageimport"����ָ����������������һ���ˣ�
��Ϊjasper�ǰ���Сǰ׺��ƥ��ָ������



ÿ��JSPҪ�������ν�����
��һ���Ƚ���5��ָ��ֱ���:
page
include
tag
attribute
variable

ע�⣺taglib�ڵ�һ�ν���ʱ�����ԡ�
�����������5��ָ��󣬻�����һ��Node.Nodes��
Ȼ��ͨ��Validator���validateDirectives������֤����ָ���Ƿ���ȷ��
��һ�ν����Ľ������ŵ�PageInfo��(һ��PageInfo��һ��jsp�ļ����)
