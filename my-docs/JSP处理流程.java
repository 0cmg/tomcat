1)
Ԥ��ʼ��:
org.apache.jasper.compiler.JspRuntimeContext
org.apache.jasper.runtime.JspFactoryImpl


Tomcat�ڳ�ʼ��ʱ��
�ᴥ��org.apache.catalina.core.JasperListener��
�ڴ����lifecycleEvent�����м���org.apache.jasper.compiler.JspRuntimeContext��

Ȼ����org.apache.jasper.compiler.JspRuntimeContext��ľ�̬��ʼ������
����һ��org.apache.jasper.runtime.JspFactoryImplʵ����
������javax.servlet.jsp.JspFactory���setDefaultFactory��̬�ķ���
org.apache.jasper.runtime.JspFactoryImpl��javax.servlet.jsp.JspFactory�����ࡣ


�������ڼ�ֻ����һ��JspFactoryImplʵ����
JspFactory�����������������javax.servlet.js.JspApplicationContext��
��javax.servlet.jsp.PageContext


2)����JSP
����jsp�Ĵ������ȱ���ͨ��org.apache.jasper.servlet.JspServlet��
org.apache.jasper.servlet.JspServletҲ��һ��HttpServlet,
Tomcat�����ڼ�ֻ��һ��org.apache.jasper.servlet.JspServletʵ����
��Tomcat�Զ���������init����ʱ��
������һ��org.apache.jasper.compiler.JspRuntimeContextʵ����
�������ڼ�Ҳֻ��һ��org.apache.jasper.compiler.JspRuntimeContextʵ����

���е�jsp�ļ���ת����һ��Servlet��
��ת�����ÿ��Servlet����һ��
org.apache.jasper.servlet.JspServletWrapperʵ����װ������
������jsp��ص�uri(ͨ������jsp�ļ���)��JspServletWrapperʵ������JspRuntimeContext

3)JSP�ĳ�ʼ��(�Զ�����init����):
Tomcat��Ϊÿ��jsp����һ��Servlet�ļ���
�������״μ������Servletʱ��������_jspInit()������
�����_jspInit()�����������������飺




����JspFactory���getJspApplicationContext�����ͻ�õ�һ��
JspApplicationContextʵ����
JspApplicationContext�������ڼ�Ҳֻ��һ��ʵ����
���ʵ��ͨ��ServletContext��setAttribute����������
ServletContext��һ��ȫ�ֵĻ�������Tomcat�����ڼ�һֱ���ڣ�Ҳֻ��һ��ʵ����
ServletContext��ʵ��������ͨ��JspFactory���getJspApplicationContext�������ݵģ�
ServletContext��setAttribute��key=JspApplicationContextImpl.class.getName()��
JspApplicationContextԭΨһʵ������������

JspApplicationContext��ServletContext���Կ�����ͬ�ȼ���ĸ��
ServletContext�������е�Servlet��
��JspApplicationContext�������е�JSP��


JspApplicationContext��������:
javax.el.ExpressionFactory,
����getExpressionFactory()������õ�һ��javax.el.ExpressionFactoryʵ����
���javax.el.ExpressionFactoryʵ��Ҳֻ��һ����
javax.el.ExpressionFactoryʵ��ʵ����
org.apache.el.ExpressionFactoryImpl��ʵ����

������ͨ��addELResolver������
javax.el.ELResolver������ӵ�JspApplicationContext��,
��Щjavax.el.ELResolver��������:
javax.servlet.jsp.el.ImplicitObjectELResolver
javax.el.MapELResolver
javax.el.ResourceBundleELResolver
javax.el.ListELResolver
javax.el.ArrayELResolver
javax.el.BeanELResolver
javax.servlet.jsp.el.ScopedAttributeELResolver

������ͨ��addELContextListener������
javax.el.ELContextListener�ӵ�JspApplicationContext�С�
(javax.el.ELContextListenerĿǰ��Tomcat��δ�ҵ�����ʵ����)


4)����JSP���ɵ�Servlet��_jspService����:
�˷����Զ���������8������:
HttpServletRequest request
HttpServletResponse response
PageContext pageContext
HttpSession session
ServletContext application
ServletConfig config
JspWriter out
Object page = this;

pageʵ���Ͼ������ɵ�Servlet��ʵ������
PageContextͨ��JspFactory��getPageContext������ã�
PageContext��ÿ��jspһһ��Ӧ��
JspFactory������JspFactoryImpl��һ��PageContextPool��
PageContext��ʵ�����Դ�PageContextPool��ȡ��
��ִ����_jspService�������ٰ�PageContext��ʵ���Ż�PageContextPool�С�

�������ĸ���������ͨ��PageContext��ʵ���õ�
HttpSession session
ServletContext application
ServletConfig config
JspWriter out
ʵ������4����������ֱ�Ӵ����ɵ�Servlet��ʵ����ӵõ���
config = servlet.getServletConfig()
application = config.getServletContext()
HttpSession session=((HttpServletRequest) request).getSession();

JspWriter out = new org.apache.jasper.runtime.JspWriterImpl

configʵ�����Ǵ�javax.servlet.GenericServlet�õ���