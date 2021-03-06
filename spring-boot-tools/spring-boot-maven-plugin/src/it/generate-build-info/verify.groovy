import org.springframework.boot.maven.Verify

import static org.junit.Assert.assertTrue

def file = new File(basedir, "target/classes/META-INF/boot/build.properties")
println file.getAbsolutePath()
Properties properties = Verify.verifyBuildInfo(file,
		'org.springframework.boot.maven.it', 'generate-build-info',
		'Generate build info', '0.0.1.BUILD-SNAPSHOT')
assertTrue properties.containsKey('build.time')