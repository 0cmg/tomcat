org.apache.catalina.core.StandardServer���������������ǲ����õ�:
storeConfig
storeContext
���Ҫ�õ�tomcat5.5�е�һ���ֿ���ģ��:storeconfig
������Tomcat7��Ŀǰû�С�


���е�:
    public synchronized void storeContext(Context context) throws Exception {
        
        ObjectName sname = null;    
        try {
           sname = new ObjectName("Catalina:type=StoreConfig");
           if(mserver.isRegistered(sname)) {
               mserver.invoke(sname, "store",
                   new Object[] {context}, 
                   new String [] { "java.lang.String"});
           } else
               log.error("StoreConfig mbean not registered" + sname);
        } catch (Throwable t) {
            ExceptionUtils.handleThrowable(t);
            log.error(t);
        }
 
    }
"java.lang.String"������ָ������jconsole���鿴ʱ������һ�������ַ�����Ȼ����Mbean��classloaderȥ��������
���ﲢ����˵store�����Ĳ�����string���ͣ���������ȷ�ǳ��Ի�new Object[] {context}��org.apache.catalina.Context�Ķ���
����˵new String [] { "java.lang.String"})Ӧ�ĳ�new String [] { "org.apache.catalina.Context"})�Ŷԣ�
ʵ���ϲ���������.