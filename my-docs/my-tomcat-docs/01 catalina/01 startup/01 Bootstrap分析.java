org.apache.catalina.startup.Bootstrap

main(String[])
	=> init()
		=> initClassLoaders()
			=> createClassLoader(String, ClassLoader)

	=> setAwait(boolean)
		=> ������� org.apache.catalina.startup.Catalina.setAwait(boolean)

	=> load(String[])
		=> ������� org.apache.catalina.startup.Catalina.load(String[])
			=> arguments(String[])
			=> load()
				=> initDirs()
				=> initNaming()
				=> createStartDigester()
				=> org.apache.tomcat.util.digester.Digester.parse(InputSource)
				=> initStreams()
				=> StandardServer.init()

	=> start()
		=> ������� org.apache.catalina.startup.Catalina.start()
		=> StandardServer.start()

