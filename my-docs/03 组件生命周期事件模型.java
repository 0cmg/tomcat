Tomcat��һЩ���ĵ������������������(Ҳ����ʵ����org.apache.catalina.Lifecycle�ӿ�)��
������ΪTomcat��һ���¼������������������
����Ϊÿ�������������ڵ����ע�����������¼�������(org.apache.catalina.LifecycleListener)��
���Լ�������13���¼�(���¼��Ⱥ�����˳��):
 1. before_init
 2. after_init
 3. before_start
 4. configure_start
 5. start
 6. after_start

 ....
 7. periodic
 7. periodic
 7. periodic
 ....

 8. before_stop
 9. stop
10. configure_stop
11. after_stop
12. before_destroy
13. after_destroy

���е�7��periodic�¼��������Եķ���(�и���̨�߳������У�Ĭ����10���Ӵ���һ��)��
�ر���Ҫע����ǣ�Ҫ����destroy�¼�����������stop������������Ч��״̬ת���쳣��
����13���¼�������Lifecycle�ӿ�������4������ʱ����:
init()->start()->stop()->destroy()

configure_start��configure_stop
��Context��Server��NamingResources�������漰�������ļ��ĵط�������


