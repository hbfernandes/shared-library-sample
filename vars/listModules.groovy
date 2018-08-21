import org.hfernandes.maven.MavenModule

def call(String pom) {
  MavenModule module = MavenModule.buildModule(new File(pom))

  println 'Read maven module:'
  println module.toString()
}