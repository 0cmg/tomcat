CHUNKED��GZIP���Ի��ʹ�ã�
����Ҫ��gzip��Ȼ���ٰ�gzip������ݷ�chunked��������chunked��gzip��
����������յ�������е�chunk�ϲ���һ���ٽ�ѹ��


��Ӧ�����һ��Filter����
���е����һ����org.apache.coyote.http11.InternalOutputBuffer.OutputStreamOutputBuffer(BIO)
ǰ���Filter��������ʵ����ֽڣ�ֻ����һЩ���⴦������gzip��chunked�ȣ�
��socket������ֽ�����OutputStreamOutputBuffer������
���Filter����VoidOutputFilter����ô��ζ��ִ�е�VoidOutputFilterʱ�����ͱ��ϵ��ˣ�
Ҳ���ǲ��ڵ�����һ��Filter��doWrite�������Ӷ�������socket������ֽڡ�
VoidOutputFilterͨ������HEAD���󣬻�����Ӧ״̬����204,205,304


http09Э����û����Ӧͷ�ģ�Ҳû��gzip��chunked��ֱ���������


prepareResponse������Ҫд��Ӧ�С���Ӧͷ
��Ӧ�С���Ӧͷ��prepareResponse����ִ��ʱĬ������²�������д���������
��Ϊorg.apache.coyote.http11.InternalOutputBuffer���и�ByteChunk socketBuffer��
д����Ϣ����һ����������������
