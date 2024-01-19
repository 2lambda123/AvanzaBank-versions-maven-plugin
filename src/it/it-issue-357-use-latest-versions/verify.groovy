import groovy.util.XmlSlurper

def file = new File(basedir, 'pom.xml')
def project = new XmlSlurper().parse(file)

def updatedVersion = new DefaultArtifactVersion(project.properties.'spring-boot.version'.text())

assert updatedVersion > new DefaultArtifactVersion('2.1.3.RELEASE')
