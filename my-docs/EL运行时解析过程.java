�ڱ���JSPʱ��ÿ��EL���ʽҪ����������ת��:
ÿ��EL���ʽ��Ҫת��proprietaryEvaluate���ã���:
org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(param[\"foo\"])}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));

1) ���EL���ʽ���з�������:
��jsp\jsp2\el\functions.jsp�е�:
${fn:escapeXml(param["foo"])}��
�ᰴ�������õ�Ƕ�ײ�ι���һ��:
org.apache.jasper.runtime.ProtectedFunctionMapper
Ȼ������ProtectedFunctionMapperʵ������proprietaryEvaluate����,

����${fn:escapeXml(param["foo"])}�ڱ���jsp�����ɵ�Servlet�Ĵ���Ƭ��:
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}
���������Ϊֻ��һ��fn:escapeXml�����Ե���getMapForFunction�õ���ProtectedFunctionMapper��
�����ڲ�ֻ���õ�Method theMethod�ֶΣ�

������:${my:reverse(my:reverse(fn:escapeXml(param["foo"])))}
��ȻǶ�������㣬����ʵ����ֻ��:my:reverse��fn:escapeXml
�ڱ���jsp�����ɵ�Servlet�Ĵ���Ƭ������:
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static {
	_jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_1.mapFunction("my:reverse", jsp2.examples.el.Functions.class, "reverse", new Class[] {java.lang.String.class});

  _jspx_fnmap_1.mapFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
  
}

������ProtectedFunctionMapper.getInstance()�õ�һ��ʵ����
Ȼ���ڵ���mapFunction������
�����õ���ProtectedFunctionMapper���ڲ�����һ��HashMap<String,Method> fnmap����ŷ�����


ProtectedFunctionMapper��������ֿ��Դ���һ�������Ͽ������Method�Ĳ����ٶȡ�



2) ���EL���ʽ��û�з�������:
��jsp\jsp2\el\basic-arithmetic.jsp�е���Щel���ʽ��
��ʱ���ɵ�proprietaryEvaluate����������functionMap������ֵ����null

���⣬PageContext pageContext�ֶξ��Ƕ�Ӧjsp���ɺ��Servlet��Ӧ��PageContext��
ÿ��jsp�������Ķ�Ӧһ��PageContext��

proprietaryEvaluate�ڲ���������ValueExpression����û��MethodExpression