1.
ContextName��4�������ĺ���:
    private final String baseName;
    private final String path;
    private final String version;
    private final String name;
����"aaa#bbb##1.0.0"������Ŀ¼��:
baseName = aaa#bbb##1.0.0
path     = /aaa/bbb
name     = /aaa/bbb##1.0.0
version  = 1.0.0

baseName������ԭʼ��Ŀ¼��
name��path����һ���汾�ţ�
����������##֮���ǰ汾�ţ�����#�ű�ʾĿ¼�ָ���


2.
HostConfig�����������:
	protected boolean deployXML = false;
    protected boolean copyXML = false;
    protected boolean unpackWARs = false;

StandardHostҲ����������
    private boolean deployXML = true;
    private boolean copyXML = false;
    private boolean unpackWARs = true;


HostConfig����һ��LifecycleListener, Ĭ����StandardHost��LifecycleListener��
��lifecycleEvent�����л�Ĭ����StandardHost�������ֶε�ֵ����HostConfig����ͷ�ġ�

deployXML����˼��: ����webӦ��ʱ���Ƿ�META-INF\context.xml�ļ�����
����: 
tomcat\webapps\host-manager\META-INF\context.xml
tomcat\webapps\manager\META-INF\context.xml


copyXML����˼��: 
��deployXML=trueʱ���Ƿ��META-INF\context.xml���Ƶ�tomcat\conf\<engine>\<host>Ŀ¼���У�
����context.xml�ļ������"Ӧ����.xml"

���磬tomcat\webapps\manager\META-INF\context.xml��deployXML=true��copyXML=trueʱ��
�Ḵ�Ƶ�tomcat\conf\Catalina\localhost\manager.xml


3.
HostConfig.deployDirectory

���
E:\Tomcat7-SVN\launch\webapps\aaa#bbb##1.0.0�������·�������������һ��Ŀ¼�޸�ʱ��ŵ�deployedApp.redeployResources
ͬ�����E:\Tomcat7-SVN\launch\conf\Catalina\localhost\aaa#bbb##1.0.0.xml
����E:\Tomcat7-SVN\launch\webapps\aaa#bbb##1.0.0\META-INF\context.xmlҲ�ŵ�deployedApp.redeployResources

����ͨ��HostConfig.addWatchedResources��
�ѿ��ܻ�reload����Դ�ӵ�deployedApp.reloadResources
����: E:\Tomcat7-SVN\launch\webapps\aaa#bbb##1.0.0\WEB-INF\web.xml


DeployedApplication����һ���Ѳ����Ӧ�ã�DeployedApplication��Ӧ����һһ��Ӧ��ϵ��
redeployResources�ļ����reloadResourcesҪ��ǰ�������Ӧ�ã�������Ӧ���е�ĳЩ��Դ
���߶���map��key�Ǿ���·������value��long����


����ٵ���HostConfig.addGlobalRedeployResources:
�������������ļ��Ƿ���ڣ����ڵĻ�����redeployResources
E:\Tomcat7-SVN\launch\conf\Catalina\localhost\context.xml.default (���Ĭ���Կ��²�����)
E:\Tomcat7-SVN\launch\conf\context.xml

