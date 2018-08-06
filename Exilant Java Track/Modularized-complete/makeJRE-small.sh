rm -rf jre
/Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/bin/jlink	\
	--module-path $JAVA_HOME/jmods:out \
	--add-modules academy.learnprogramming.jokeapp \
	--launcher JOKER=academy.learnprogramming.jokeapp/academy.learnprogramming.jokeapp.Main 	\
	--compress 2	\
	--no-header-files	\
	--no-man-pages	\
	--strip-debug	\
	--output jre

