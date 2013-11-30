    @Override
    public String getObjectNameKeyProperties() {
        StringBuilder name = new StringBuilder("type=Valve");
        
        Container container = getContainer();

		//������Engine������
        name.append(MBeanUtils.getContainerKeyProperties(container));
        
        int seq = 0;
        
        // Pipeline may not be present in unit testing
        Pipeline p = container.getPipeline();
        if (p != null) {
            for (Valve valve : p.getValves()) {
                // Skip null valves
                if (valve == null) {
                    continue;
                }
                // Only compare valves in pipeline until we find this valve
                if (valve == this) {
                    break;
                }

				//��server.xml����������Ӽ����ظ���Valve�ͻ�����������:
				/*
				<Context ...>
					<Valve className="MyValve" />
					<Valve className="MyValve" />
				</Context>
				*/
				/*
				type=Valve,context=/examples,host=localhost,name=MyValve
				type=Valve,context=/examples,host=localhost,seq=1,name=MyValve
				type=Valve,context=/examples,host=localhost,name=FormAuthenticator
				type=Valve,context=/examples,host=localhost,name=StandardContextValve
				*/
                if (valve.getClass() == this.getClass()) {
                    // Duplicate valve earlier in pipeline
                    // increment sequence number
                    seq ++;
                }
            }
        }
        
        if (seq > 0) {
            name.append(",seq=");
            name.append(seq);
        }

        String className = this.getClass().getName();
        int period = className.lastIndexOf('.');
        if (period >= 0) {
            className = className.substring(period + 1);
        }
        name.append(",name=");
        name.append(className);
        
        return name.toString();
    }


����
org.apache.catalina.connector.Request.setAsyncSupported
�ȱ���StandardEngine��Pipeline�е�ÿ��Valve������Valve��֧���첽ʱ��������֧���첽��
Ȼ��ת��StandardHost��Pipeline ==> StandardContext��Pipeline ==> StandardWrapper��Pipeline