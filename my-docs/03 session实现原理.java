1. Ĭ����StandardManager
��session���ݱ��浽work\Catalina\localhost\examples\SESSIONS.ser
SESSIONS.ser�д���˶��session�����ݡ�

����Tomcatʱ������org.apache.catalina.session.StandardManager.load()��
��SESSIONS.ser�е����ݷ����л����������ɶ��StandardSessionʵ����
ֹͣTomcatʱ������org.apache.catalina.session.StandardManager.unload()������session���л����浽SESSIONS.ser��
ע����eclipse�а���ɫ�����Terminate��ť���޷�����session�ı���ģ���������tomcat\bin\shutdown.bat�ſ��ԡ�

2. PersistentManager
���԰�session���ݱ��浽�ļ���(Ҳ����FileStore�ķ�ʽ)��һ��session��Ӧһ���ļ����ļ�����sessionId + ".session"��
Ҳ���԰�session���ݱ��浽���ݿ���(Ҳ����JDBCStore�ķ�ʽ)��

StandardManager��PersistentManager�Ĳ����:
session�ķ����л�������������Tomcatʱ���ģ�
Ҳ����˵org.apache.catalina.session.PersistentManagerBase.load()���������ʵ��û���õģ�
".session"�ļ��Ķ�ȡ���ӳٵ������������sessionʱ��ȥ����Ҳ���ǵ���request.getSession����ʱ��
�����һ�ν�����һ��socket����ôtomcat��ͨ��cookie�ķ�ʽ��sessionId�����������
Ȼ���������һ������ʱͬ��ͨ��cookie��sessionId����������:
Cookie: JSESSIONID=3EE8725ABF1B7960363C28BEBBA86D63
���������JSESSIONID�Ϳ��Բ鿴��ص�".session"�ļ��ˡ�

StandardManager��PersistentManager������tomcat�ر�ʱ��session����������


